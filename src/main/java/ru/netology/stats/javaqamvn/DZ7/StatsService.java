package ru.netology.stats.javaqamvn.DZ7;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int minMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                minMonth = i; // запомним его как максимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public long amountSales(long[] sales) {   // сумма всех продаж
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public long averageAmount(long[] sales) {  // средняя сумма
        long sum = amountSales(sales);
        return sum / sales.length;

    }

    public int belowAverage(long[] sales) { // кол-во месяцев с продажами меньше среднего
        long averageSales = averageAmount(sales);
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) {
                month++;
            }
        }
        return month;
    }

    public int aboveAverage(long[] sales) { // кол-во месяцев с продажами выше среднего
        long averageSales = averageAmount(sales);
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                month++;
            }
        }
        return month;
    }


}
