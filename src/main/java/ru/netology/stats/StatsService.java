package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {

            sum = sum + purchase;

        }
        return sum;
    }


    public long AverageAmount(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum / 12;
    }

    public long MaxMonth(long[] purchases) {
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

    public long MinMonth(long[] purchases) {
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


    public long MinAverage(long[] purchases) {
        long sum = 0;
        long average = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        average = sum/purchases.length;
        long index = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] < average) {
                index ++;
            }
        }
        return index;
    }

    public long MaxAverage(long[] purchases) {
        long sum = 0;
        long average = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
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