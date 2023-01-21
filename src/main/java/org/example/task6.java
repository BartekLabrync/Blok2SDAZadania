package org.example;

public class task6 {
    public static void main (String[] args){
        printMultiplicationtable(6,2,5);

    }
    private static void printMultiplicationtable(){
        for (int i = 1; i <= 4; i++){
            System.out.println("5 x" + i + " = " + (5 * i));
        }
    }
    private static void printMultiplicationtable( int Multiplier, int minMultiplicand, int maxMultiplicand){
        for(int i= minMultiplicand; i <= maxMultiplicand; i++){
            int result = Multiplier * i;
            System.out.print(Multiplier + " x " + i + " = " + result);
        }
    }
}
