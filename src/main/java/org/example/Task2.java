package org.example;


import java.util.Scanner;

public class Task2 {
    //private static final float PI = 3.14F;
    private static final double  PI = Math.PI;

    public static void main (String[] args){
        float radius = getDiameterFromUser() / 2;
        float circumference = CalculateCircumferenceOfCircle(radius);
        float area = CalculateAreaOfCircle(radius);
        System.out.println("Circle reference of a circle" + circumference);
        System.out.println("area of a circle" + area);



    }
    private static float getDiameterFromUser(){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Please insert diameter");
        return scanner.nextFloat();

    }
    private static float CalculateCircumferenceOfCircle(float radius){
        return 2 * 3.14F * radius/2;
    }
    private static float CalculateAreaOfCircle(float radius){
        return 3.14F * radius/2 * radius/2;
    }
}
