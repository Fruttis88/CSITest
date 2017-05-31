import java.text.SimpleDateFormat;
import java.util.Date;

public class Price implements Comparable<Price> {
    private long id;
    private String product_code;
    private int number, depart;
    private Date begin, end;
    private long value;

    public Price() {
    }

    public Price(String product_code, int number, int depart, Date begin, Date end, long value) {
        this(0, product_code, number, depart, begin, end, value);
    }


    public Price(long id, String product_code, int number, int depart, Date begin, Date end, long value) {
        this.id = id;
        this.product_code = product_code;
        this.number = number;
        this.depart = depart;
        this.begin = begin;
        this.end = end;
        this.value = value;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getDepart() {
        return depart;
    }

    public void setDepart(int depart) {
        this.depart = depart;
    }

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    private static final SimpleDateFormat DATE_TIME_FORMATTER = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

    @Override
    public String toString() {
        return "Price{" +
                "id=" + id +
                ", product_code='" + product_code + '\'' +
                ", number=" + number +
                ", depart=" + depart +
                ", begin=" + DATE_TIME_FORMATTER.format(begin) +
                ", end=" + DATE_TIME_FORMATTER.format(end) +
                ", value=" + value +
                '}';
    }

    public int compareTo(Price o) {
        int result = this.getProduct_code().compareTo(o.getProduct_code());
        if (result == 0) {
            int result2 = this.getNumber() - o.getNumber();
            if (result2 == 0) {
                int result3 = this.getBegin().compareTo(o.getBegin());
                if(result3 == 0){
                    return this.getEnd().compareTo(o.getEnd());
                }
                return result3;
            }
            return result2;
        }
        return result;
    }
}