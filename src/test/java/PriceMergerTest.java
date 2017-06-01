import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.util.Date;
import java.util.TreeSet;

public class PriceMergerTest extends Assert {

    private PriceMerger merger;

    @Before
    public void initTest() {
        merger = new PriceMerger();
    }

    //    тест таблиц из задания
    @Test
    public void addNewPrices() throws Exception {
        assertEquals(PriceTestData.RESULT1, merger.addNewPrices(PriceTestData.OLD1, PriceTestData.NEW1));
    }

    //    пример 1 (схематический из задания)
    @Test
    public void addNewPrices2() throws Exception {
        assertEquals(PriceTestData.RESULT2, merger.addNewPrices(PriceTestData.OLD2, PriceTestData.NEW2));
    }

    //    пример 2
    @Test
    public void addNewPrices3() throws Exception {
        assertEquals(PriceTestData.RESULT3, merger.addNewPrices(PriceTestData.OLD3, PriceTestData.NEW3));
    }

    //    пример 3
    @Test
    public void addNewPrices4() throws Exception {
        assertEquals(PriceTestData.RESULT4, merger.addNewPrices(PriceTestData.OLD4, PriceTestData.NEW4));
    }

    //    совпадение по всем полям, кроме value, на закуску
    @Test
    public void addNewPrices5() throws Exception {
        assertEquals(PriceTestData.RESULT5, merger.addNewPrices(PriceTestData.OLD5, PriceTestData.NEW5));
    }

    @Test
    public void test2() throws ParseException {
        TreeSet<Price> oldPrices = new TreeSet<>();

        oldPrices.add(new Price("122856", 1, 1, new Date(117, 1, 2, 0, 0, 0), new Date(117, 1, 3, 23, 59, 59), 1L));
        oldPrices.add(new Price("122856", 1, 1, new Date(117, 1, 4, 0, 0, 0), new Date(117, 1, 6, 23, 59, 59), 2L));
        oldPrices.add(new Price("122856", 1, 1, new Date(117, 1, 7, 0, 0, 0), new Date(117, 1, 8, 23, 59, 59), 1L));
        oldPrices.add(new Price("122856", 1, 1, new Date(117, 1, 9, 0, 0, 0), new Date(117, 1, 10, 23, 59, 59), 2L));
        oldPrices.add(new Price("122856", 1, 1, new Date(117, 1, 11, 0, 0, 0), new Date(117, 1, 12, 23, 59, 59), 1L));



        System.out.println("OLD:_______________________________________");
        oldPrices.forEach(System.out::println);

        TreeSet<Price> newPrices = new TreeSet<>();

        newPrices.add(new Price("122856", 1, 1, new Date(117, 1, 3, 0, 0, 0), new Date(117, 1, 8, 0, 0, 0), 1L));
        newPrices.add(new Price("122856", 1, 1, new Date(117, 1, 8, 23, 0, 0), new Date(117, 1, 12, 0, 0, 0), 1L));


        System.out.println("NEW:_______________________________________");
        newPrices.forEach(System.out::println);

        TreeSet<Price> prices = merger.addNewPrices(oldPrices, newPrices);
        System.out.println("RESULT:____________________________________");
        prices.forEach(System.out :: println);
        //должна получится одна цена
        Assert.assertEquals(prices.size(), 1);
        Assert.assertEquals(prices.first(), new Price("122856", 1, 1, new Date(117, 1, 2, 0, 0, 0), new Date(117, 1, 12, 23, 59, 59), 1L));
    }
}