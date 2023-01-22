package org.exampleDay2;

import static org.exampleDay2.StringValidator.isValid;

public class Task4Day2 {

    private static final String REPLACEMENT = "-STOP-";
    public static void main(String[] args){
        String input = "Ala ma kota, kot ma ale";
        System.out.println(replaceString(input));


    }

    private static String replaceString(String input){
        if(isValid(input)){
            return input
                    .replace(".","-STOP-")
                    .replace(",","-STOP-");
        }
        return null;
    }
}
