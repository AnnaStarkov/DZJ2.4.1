package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {

            sum = sum + purchase;

        }
        return sum;
    }


    public long averageAmount(long[] purchases) {
        long sum = calculateSum(purchases);
        return sum/12;
    }

    public long maxMonth(long[] purchases) {
        long max = purchases[0];
        long index = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] > max) {
                max = purchases[i];
                index = i;
            }
        }
        return index;
    }

    public long minMonth(long[] purchases) {
        long min = purchases[0];
        long index = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] < min) {
                min = purchases[i];
                index = i;
            }
        }
        return index;
    }


    public long minAverage(long[] purchases) {
        long sum = calculateSum(purchases);
        long average = 0;
        average = sum/purchases.length;
        long index = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] < average) {
                index ++;
            }
        }
        return index;
    }

    public long maxAverage(long[] purchases) {
        long sum = calculateSum(purchases);
        long average = 0;
        average = sum/purchases.length;
        long index = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] > average) {
                index ++;
            }
        }
        return index;
    }

}