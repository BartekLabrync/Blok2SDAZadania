package org.exampleDay2;

public class Task3Day2 {
    public static void main (String[] args){
        String input = "Ala ma kota";
        String word = "ma";
        System.out.println("input:" + input);
        System.out.println("word:" + word);
        System.out.println("result:" + getIndex(input, word));

        input = "Ala ma kota";
        word = null;
        System.out.println("input:" + input);
        System.out.println("word:" + word);
        System.out.println("result:" + getIndex(input, word));

    }

    private static int getIndex (String input, String word){
        if(StringValidator.isValid(input) && StringValidator.isValid(word)){
            if(input.contains(word)){
                return input.indexOf(word);
            }else{

            }

            return input.contains(word) ? input.indexOf(word): -1;
        }
        return -1;
    }
}
