package org.exampleDay2;

public class Task13Day2 {
    public static void main(String[] args) {
        int[] input = {12, 7, 19};
        System.out.println("MinValue:" + getMinValue(input));
        System.out.println("MinValue:" + getMinValue(input));
    }

    private static int getMinValue(int[] input) {

        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
        int minValue = Integer.MAX_VALUE;
        for (int element : input) {
            if (minValue > element) {
                minValue = element;
            }
        }
        return minValue;


    }

    private static int sum(int[] input) {
        int sum = 0;
        for (int i : input) {
            sum += i;
        }
        return sum;
    }
}

