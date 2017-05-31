import java.util.TreeSet;

public class PriceMerger {

    public TreeSet<Price> addNewPrices(TreeSet<Price> oldList, TreeSet<Price> newList) {
        TreeSet<Price> resultList = new TreeSet<>();
        TreeSet<Price> proxyList = oldList;

        for (Price b : newList) {
            int count = 0;
            for (Price a : oldList) {
                if (a.getProduct_code().equals(b.getProduct_code()) && a.getNumber() == b.getNumber() && a.getDepart() == b.getDepart() && !DateUtil.isNotIntersect(a.getBegin(), a.getEnd(), b.getBegin(), b.getEnd())) {
                    if (a.getValue() != b.getValue()) {
                        if (DateUtil.firstIntersect(a.getBegin(), a.getEnd(), b.getBegin(), b.getEnd())) {
                            resultList.add(new Price(b.getProduct_code(), b.getNumber(), b.getDepart(), b.getBegin(), b.getEnd(), b.getValue()));
                            resultList.add(new Price(a.getProduct_code(), a.getNumber(), a.getDepart(), b.getEnd(), a.getEnd(), a.getValue()));
                        } else if (DateUtil.secondIntersect(a.getBegin(), a.getEnd(), b.getBegin(), b.getEnd())) {
                            resultList.add(new Price(a.getProduct_code(), a.getNumber(), a.getDepart(), a.getBegin(), b.getBegin(), a.getValue()));
                            resultList.add(new Price(b.getProduct_code(), b.getNumber(), b.getDepart(), b.getBegin(), b.getEnd(), b.getValue()));
                            resultList.add(new Price(a.getProduct_code(), a.getNumber(), a.getDepart(), b.getEnd(), a.getEnd(), a.getValue()));
                        } else if (DateUtil.thirdIntersect(a.getBegin(), a.getEnd(), b.getBegin(), b.getEnd())) {
//                            кидаем в прокси, а не сразу в результирующий лист, чтобы избавиться от 87(см. задание, пример 3)
                            proxyList.add(new Price(a.getProduct_code(), a.getNumber(), a.getDepart(), a.getBegin(), b.getBegin(), a.getValue()));
                            resultList.add(new Price(b.getProduct_code(), b.getNumber(), b.getDepart(), b.getBegin(), b.getEnd(), b.getValue()));
                        } else {
                            resultList.add(b);
                        }
                    } else {
                        if (DateUtil.firstIntersect(a.getBegin(), a.getEnd(), b.getBegin(), b.getEnd())) {
                            resultList.add(new Price(a.getProduct_code(), a.getNumber(), a.getDepart(), b.getBegin(), a.getEnd(), a.getValue()));
                        } else if (DateUtil.thirdIntersect(a.getBegin(), a.getEnd(), b.getBegin(), b.getEnd())) {
                            resultList.add(new Price(a.getProduct_code(), a.getNumber(), a.getDepart(), a.getBegin(), b.getEnd(), a.getValue()));
                        }
                    }
                    proxyList.remove(a);
                    break;
                } else {
                    count++;
                    if (count == oldList.size()) {
                        resultList.add(b);
                    }
                }
            }
        }

//        здесь обрабатываются старые поля, которые вообще ни с кем не пересеклись + кусочки 120, 90 (см. задание, пример2 и пример 3) + подлейший на свете кусок 87 (см. задание, пример 3)
        for (Price a : proxyList) {
            int count = 0;
            for (Price b : newList) {
                if (a.getProduct_code().equals(b.getProduct_code()) && a.getNumber() == b.getNumber() && a.getDepart() == b.getDepart() && DateUtil.proxyIntersectLastElement(a.getBegin(), a.getEnd(), b.getBegin(), b.getEnd())) {
                    resultList.add(new Price(a.getProduct_code(), a.getNumber(), a.getDepart(), b.getEnd(), a.getEnd(), a.getValue()));
                    break;
                } else if (a.getProduct_code().equals(b.getProduct_code()) && a.getNumber() == b.getNumber() && a.getDepart() == b.getDepart() && DateUtil.proxyIntersectMiddleElement(a.getBegin(), a.getEnd(), b.getEnd())) {
                    break;
                } else {
                    count++;
                    if (count == newList.size()) {
                        resultList.add(a);
                    }
                }
            }
        }
        return resultList;
    }
}