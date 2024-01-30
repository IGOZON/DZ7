import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.javaqamvn.DZ7.StatsService;

public class StatsServiceTest {

    @Test
    public void minSalesTest() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long expected = 9;
        long actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void maxSalesTest() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long expected = 8;
        long actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void amountSalesTest() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long expected = 180;
        long actual = service.amountSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void averageAmountTest() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long expected = 15;
        long actual = service.averageAmount(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void belowAverageTest() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long expected = 5;
        long actual = service.belowAverage(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void aboveAverageTest() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long expected = 5;
        long actual = service.aboveAverage(sales);
        Assertions.assertEquals(expected, actual);

    }
}
