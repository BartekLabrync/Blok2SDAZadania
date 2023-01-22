package org.exampleDay2;

import static org.exampleDay2.StringValidator.isValid;

public class Task8Day2 {
    private static final int VALUE_UPPER_A_IN_ASCII = 65;

    private static final int VALUE_UPPER_Z_IN_ASCII = 90;

    private static final int VALUE_LOWER_A_IN_ASCII = 97;

    private static final int VALUE_LOWER_Z_IN_ASCII = 122;
    private static final int DIFF_UPPER_AND_LOWER_IN_ASCII = 32;
    public static void main(String[] args){
        String input = "AlA Ma KOta i 5 PsÓw";
        System.out.println("result: " + replaceChars(input));

    }

    private static String replaceChars (String input){
        if(isValid(input)){
            String result = "";
            for(int i =0; i< input.length();i++){
                char currentChar = input.charAt(i);
                if(currentChar >= 65 && currentChar <= 90){
                    result +=(char) (currentChar + DIFF_UPPER_AND_LOWER_IN_ASCII);

                }else if (currentChar >= 97 && currentChar <= 122 ){
                    result +=(char) (currentChar - DIFF_UPPER_AND_LOWER_IN_ASCII);

                }else {
                    result += currentChar;
                }

            }

        }
        return input;
    }
}
