package org.example;

public class Task8 {
    public static void main (String [] args){
        int firstNumber = 0;
        int lastNumber = 10;
    isPrimeNumber();
    }
    private static boolean isPrimeNumber(){
        int number = 0;
        for (int i = 2; i < number/2; i++){
            if (number%i == 0){
                return false;
            }
        }
    return false;
    }
}
