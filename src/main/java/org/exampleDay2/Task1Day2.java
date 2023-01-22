package org.exampleDay2;

public class Task1Day2 {

    public static void main (String [] args){
    String input = "Ala";
    System.out.println("Original word:" + input);
    System.out.println("last char:" + getLastCharacter(input));

    input = "Domek";
    System.out.println("Original word:" + input);
    System.out.println("last char:" + getLastCharacter(input));


    }

    private static char getLastCharacter(String input){
        if(input != null && !input.isEmpty()) {
            int lastPosition = input.length() - 1;
            input.charAt(lastPosition);

        }
        return '\u0000';
    }
}
