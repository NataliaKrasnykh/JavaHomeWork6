package ru.netology.javaqa.JavaHomeWork6;

public class Main {

    public static void main(String[] args) {

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        long sum = service.calculateAllSumSales(sales);
        System.out.println("Сумма продаж равна " + sum);

        long averageSales = service.calculateAverageSales(sales);
        System.out.println("Средняя сумма продаж равна " + averageSales);

        int maxMonth = service.calculateMaxSales(sales);
        System.out.println("Месяц, в котором осуществлены продажи на максимальную сумму равен " + maxMonth);

        int minMonth = service.calculateMinSales(sales);
        System.out.println("Месяц, в котором осуществлены продажи на минимальную сумму равен " + minMonth);

        int monthBelowAverage = service.calculateMonthesBelowAverage(sales);
        System.out.println("Количество месяцев с продажами ниже среднего равно " + monthBelowAverage);

        int monthAboveAverage = service.calculateMonthesAboveAverage(sales);
        System.out.println("Количество месяцев с продажами выше среднего равно " + monthAboveAverage);
    }
}