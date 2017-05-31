import java.util.Date;
import java.util.TreeSet;

public class PriceTestData {

    public static final Price OLD_PRICE1 = new Price("444", 1, 3, new Date(2015, 2, 10, 0, 0, 0), new Date(2015, 4, 10, 0, 0, 0), 131313);
    public static final Price OLD_PRICE2 = new Price("122856", 1, 1, new Date(2013, 0, 1, 0, 0, 0), new Date(2013, 1, 1, 0, 0, 0), 80);
    public static final Price OLD_PRICE3 = new Price("122856", 1, 1, new Date(2013, 0, 1, 0, 0, 0), new Date(2013, 0, 31, 23, 59, 59), 11000);
    public static final Price OLD_PRICE4 = new Price("122856", 1, 1, new Date(2013, 0, 31, 23, 59, 59), new Date(2013, 1, 28, 23, 59, 59), 14000);
    public static final Price OLD_PRICE5 = new Price("122856", 1, 1, new Date(2013, 1, 1, 0, 0, 0), new Date(2013, 2, 1, 0, 0, 0), 87);
    public static final Price OLD_PRICE6 = new Price("122856", 2, 1, new Date(2013, 0, 10, 0, 0, 0), new Date(2013, 0, 20, 23, 59, 59), 99000);
    public static final Price OLD_PRICE7 = new Price("6654", 1, 2, new Date(2013, 0, 1, 0, 0, 0), new Date(2013, 0, 31, 0, 0, 0), 5000);
    public static final Price OLD_PRICE8 = new Price("122856", 1, 1, new Date(2013, 2, 1, 0, 0, 0), new Date(2013, 3, 1, 0, 0, 0), 90);

    public static final Price NEW_PRICE1 = new Price("444", 1, 3, new Date(2015, 2, 10, 0, 0, 0), new Date(2015, 4, 10, 0, 0, 0), 4);
    public static final Price NEW_PRICE2 = new Price("122856", 1, 1, new Date(2013, 0, 20, 0, 0, 0), new Date(2013, 1, 20, 23, 59, 59), 11000);
    public static final Price NEW_PRICE3 = new Price("122856", 2, 1, new Date(2013, 0, 15, 0, 0, 0), new Date(2013, 0, 25, 23, 59, 59), 92000);
    public static final Price NEW_PRICE4 = new Price("6654", 1, 2, new Date(2013, 0, 12, 0, 0, 0), new Date(2013, 0, 13, 0, 0, 0), 4000);
    public static final Price NEW_PRICE5 = new Price("122856", 1, 1, new Date(2013, 0, 20, 0, 0, 0), new Date(2013, 1, 20, 23, 59, 59), 33333);
    public static final Price NEW_PRICE6 = new Price("122856", 1, 1, new Date(2013, 0, 15, 0, 0, 0), new Date(2013, 1, 15, 0, 0, 0), 80);
    public static final Price NEW_PRICE7 = new Price("122856", 1, 1, new Date(2013, 1, 15, 0, 0, 0), new Date(2013, 2, 20, 0, 0, 0), 85);


    public static final TreeSet<Price> OLD1;
    public static final TreeSet<Price> NEW1;
    public static final TreeSet<Price> RESULT1;

    public static final TreeSet<Price> OLD2;
    public static final TreeSet<Price> NEW2;
    public static final TreeSet<Price> RESULT2;

    public static final TreeSet<Price> OLD3;
    public static final TreeSet<Price> NEW3;
    public static final TreeSet<Price> RESULT3;

    public static final TreeSet<Price> OLD4;
    public static final TreeSet<Price> NEW4;
    public static final TreeSet<Price> RESULT4;

    public static final TreeSet<Price> OLD5;
    public static final TreeSet<Price> NEW5;
    public static final TreeSet<Price> RESULT5;

    static {
        OLD1 = new TreeSet<>();
        OLD1.add(OLD_PRICE3);
        OLD1.add(OLD_PRICE6);
        OLD1.add(OLD_PRICE7);
        NEW1 = new TreeSet<>();
        NEW1.add(NEW_PRICE2);
        NEW1.add(NEW_PRICE3);
        NEW1.add(NEW_PRICE4);
        RESULT1 = new TreeSet<>();
        RESULT1.add(new Price("122856", 1, 1, new Date(2013, 0, 1, 0, 0, 0), new Date(2013, 1, 20, 23, 59, 59), 11000));
        RESULT1.add(new Price("122856", 2, 1, new Date(2013, 0, 10, 0, 0, 0), new Date(2013, 0, 15, 0, 0, 0), 99000));
        RESULT1.add(new Price("122856", 2, 1, new Date(2013, 0, 15, 0, 0, 0), new Date(2013, 0, 25, 23, 59, 59), 92000));
        RESULT1.add(new Price("6654", 1, 2, new Date(2013, 0, 1, 0, 0, 0), new Date(2013, 0, 12, 0, 0, 0), 5000));
        RESULT1.add(new Price("6654", 1, 2, new Date(2013, 0, 12, 0, 0, 0), new Date(2013, 0, 13, 0, 0, 0), 4000));
        RESULT1.add(new Price("6654", 1, 2, new Date(2013, 0, 13, 0, 0, 0), new Date(2013, 0, 31, 0, 0, 0), 5000));

        OLD2 = new TreeSet<>();
        OLD2.add(OLD_PRICE7);
        NEW2 = new TreeSet<>();
        NEW2.add(NEW_PRICE4);
        RESULT2 = new TreeSet<>();
        RESULT2.add(new Price("6654", 1, 2, new Date(2013, 0, 1, 0, 0, 0), new Date(2013, 0, 12, 0, 0, 0), 5000));
        RESULT2.add(new Price("6654", 1, 2, new Date(2013, 0, 12, 0, 0, 0), new Date(2013, 0, 13, 0, 0, 0), 4000));
        RESULT2.add(new Price("6654", 1, 2, new Date(2013, 0, 13, 0, 0, 0), new Date(2013, 0, 31, 0, 0, 0), 5000));

        OLD3 = new TreeSet<>();
        OLD3.add(OLD_PRICE3);
        OLD3.add(OLD_PRICE4);
        NEW3 = new TreeSet<>();
        NEW3.add(NEW_PRICE5);
        RESULT3 = new TreeSet<>();
        RESULT3.add(new Price("122856", 1, 1, new Date(2013, 0, 1, 0, 0, 0), new Date(2013, 0, 20, 0, 0, 0), 11000));
        RESULT3.add(new Price("122856", 1, 1, new Date(2013, 0, 20, 0, 0, 0), new Date(2013, 1, 20, 23, 59, 59), 33333));
        RESULT3.add(new Price("122856", 1, 1, new Date(2013, 1, 20, 23, 59, 59), new Date(2013, 1, 28, 23, 59, 59), 14000));

        OLD4 = new TreeSet<>();
        OLD4.add(OLD_PRICE2);
        OLD4.add(OLD_PRICE5);
        OLD4.add(OLD_PRICE8);
        NEW4 = new TreeSet<>();
        NEW4.add(NEW_PRICE6);
        NEW4.add(NEW_PRICE7);
        RESULT4 = new TreeSet<>();
        RESULT4.add(new Price("122856", 1, 1, new Date(2013, 0, 1, 0, 0, 0), new Date(2013, 1, 15, 0, 0, 0), 80));
        RESULT4.add(new Price("122856", 1, 1, new Date(2013, 1, 15, 0, 0, 0), new Date(2013, 2, 20, 0, 0, 0), 85));
        RESULT4.add(new Price("122856", 1, 1, new Date(2013, 2, 20, 0, 0, 0), new Date(2013, 3, 1, 0, 0, 0), 90));

        OLD5 = new TreeSet<>();
        OLD5.add(OLD_PRICE1);
        NEW5 = new TreeSet<>();
        NEW5.add(NEW_PRICE1);
        RESULT5 = new TreeSet<>();
        RESULT5.add(NEW_PRICE1);

    }
}
