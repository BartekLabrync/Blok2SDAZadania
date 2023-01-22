package org.exampleDay2;

import static org.exampleDay2.StringValidator.isValid;

public class Task6Day2 {

    public static void main(String[] args){
        String input = "Ala ma kota";
        char searchedWord = 'a';
        System.out.println("Result:" + getFirstWord("Ala ma kota",'a'));

        input = "Ala ma kota";
        searchedWord = 'z';
        System.out.println("Result:" + getFirstWord("Ala ma kota",'a'));

    }

    private static int getFirstWord(String input, char SearchedWord){

        if(isValid(input)){
            for(int i =0; i<input.length(); i++){
                if(input.charAt(i) == SearchedWord){
                    return i;
                }
            }
        }

        return -1;
    }
}
