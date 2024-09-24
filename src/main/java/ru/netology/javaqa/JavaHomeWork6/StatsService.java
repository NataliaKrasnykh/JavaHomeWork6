package ru.netology.javaqa.JavaHomeWork6;

public class StatsService {

    public int calculateMinSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int calculateMaxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public long calculateAllSumSales(long[] sales) {
        long sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public long calculateAverageSales(long[] sales) {
        long averageSum = 0;

        for (int i = 0; i < sales.length; i++) {
            averageSum += sales[i];
        }
        averageSum = averageSum / sales.length;
        return averageSum;
    }

    public int calculateMonthesBelowAverage(long[] sales) {
        long averageSum = calculateAverageSales(sales);
        int monthBelowAverage = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSum) { //
                monthBelowAverage++; //
            }
        }
        return monthBelowAverage;
    }

    public int calculateMonthesAboveAverage(long[] sales) {
        long averageSum = calculateAverageSales(sales);
        int monthAboveAverage = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSum) { //
                monthAboveAverage++; //
            }
        }
        return monthAboveAverage;
    }
}
