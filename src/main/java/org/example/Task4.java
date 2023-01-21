package org.example;

import java.util.Scanner;

public class Task4 {
    private static final float BMI_MIN_RANGE = 18.5F;
    private static final float BMI_MAX_RANGE = 24.9F;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int height = getHeightFromUser();
        float Weight = getWeightFromUser();
        float BMI = calculateBMI(Weight, height);
        DisplayBMIResult(BMI);

    }

    private static float getWeightFromUser() {
        System.out.print("Please insert weight in KG");
        return scanner.nextFloat();
    }

    private static int getHeightFromUser() {
        System.out.print("Please insert height in CM");
        return scanner.nextInt();
    }

    private static float calculateBMI (float weight, int height) {
        float heightInMeter = height / 100F;
        return weight / (heightInMeter * heightInMeter);
    }

    private static void DisplayBMIResult(float bmi){
        if(bmi >= 18.5F && bmi <= 24.9F){
            System.out.println("BMI is correct:" + bmi);
        }else{
            System.out.println("BMI is not correct:" + bmi);
        }
    }
}

