import java.util.Date;
import java.util.TreeSet;

//   Оставил для наглядности (пример 3 из задания)
public class PriceUtil {
    public static void main(String[] args) {


        TreeSet<Price> oldList = new TreeSet<>();
        oldList.add(new Price("122856", 1, 1, new Date(113, 0, 1, 0, 0, 0), new Date(113, 1, 1, 0, 0, 0), 80));
        oldList.add(new Price("122856", 1, 1, new Date(113, 1, 1, 0, 0, 0), new Date(113, 2, 1, 0, 0, 0), 87));
        oldList.add(new Price("122856", 1, 1, new Date(113, 2, 1, 0, 0, 0), new Date(113, 3, 1, 0, 0, 0), 90));

        TreeSet<Price> newList = new TreeSet<>();
        newList.add(new Price("122856", 1, 1, new Date(113, 0, 15, 0, 0, 0), new Date(113, 1, 15, 0, 0, 0), 80));
        newList.add(new Price("122856", 1, 1, new Date(113, 1, 15, 0, 0, 0), new Date(113, 2, 20, 0, 0, 0), 85));


        PriceMerger test = new PriceMerger();
        TreeSet<Price> result = test.addNewPrices(oldList, newList);

        for (Price price : result){
            System.out.println(price);
        }
    }
}
