package org.example;

public class Task5 {
    public static void main(String[] args) {
        int firstDigit = 4;
        int secondDigit = 11;
        int result = sum(firstDigit, secondDigit);
        System.out.println("result:" + result);
    }

    private static int sum(int firstDigit, int secondDigit) {
        int sum = 0;
        for (int i = firstDigit; i <= secondDigit; i++){
            sum += i;
        }
        return sum;






    }

}



