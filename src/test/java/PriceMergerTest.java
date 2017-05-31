import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
}