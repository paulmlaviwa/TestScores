package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {

    public static void main(String[] args) {

        int[] myScores = {90, 98, 89, 94, 87, 88, 99, 100, 97, 80};

        int i;
        for (i = 0; i < myScores.length; i++)
            System.out.println(myScores[i]);

        double average = 0;
        int sum = 0;
        for (int score : myScores) {
            sum += score;
        }
        average = sum / (myScores.length);

        // Find the high score and low score
        int highScore = Arrays.stream(myScores).max().getAsInt();
        int lowScore = Arrays.stream(myScores).min().getAsInt();

        // Calculate the median
        Arrays.sort(myScores);
        double median;
        if (myScores.length % 2 == 0) {
            int middle1 = myScores[myScores.length / 2 - 1];
            int middle2 = myScores[myScores.length / 2];
            median = (middle1 + middle2) / 2.0;
        } else {
            median = myScores[myScores.length / 2];
        }

        // Print the statistics
        System.out.println("Average: " + average);
        System.out.println("High Score: " + highScore);
        System.out.println("Low Score: " + lowScore);
        System.out.println("Median: " + median);
    }
}

