package org.exampleDay2;

public class Task15Day2 {
    public static void main(String[] args) {
        String [] input = {"Ala", "Kot", "Pies"};
        String [] input2 = {"Ala", "Kot", "Pies"};
        System.out.println(isEqual(input, input2));
    }
    private static boolean isEqual(String[] input1, String[] input2){

        if(input1.length != input2.length){
            return false;
        }

        for(int i =0; i< input1.length; i++){
            String input1Element = input1[i];
            String input2Element = input2[i];
            if(input1Element == null && input2Element == null){
                continue;
            }
            if(input1Element==null || (!input1Element.equals (input2Element))){
                return false;
            }

        }

        return true;
    }
}
