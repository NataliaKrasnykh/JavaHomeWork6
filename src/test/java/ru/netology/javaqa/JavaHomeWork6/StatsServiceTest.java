package ru.netology.javaqa.JavaHomeWork6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldCalculateMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.calculateMinSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.calculateMaxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldcalculateAllSumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calculateAllSumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldcalculateAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.calculateAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldcalculateMonthesBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calculateMonthesBelowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldcalculateMonthesAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calculateMonthesAboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}