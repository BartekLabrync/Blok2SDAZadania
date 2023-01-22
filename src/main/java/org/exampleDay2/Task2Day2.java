package org.exampleDay2;

public class Task2Day2 {
    public static void main (String[] args){
        String input = "programowanie";
        String prefix = "pro";
        System.out.println("input:" + input);
        System.out.println("result:" + isPrefix(input, prefix));

        input = "programowanie";
        prefix = "pro";
        System.out.println("input:" + input);
        System.out.println("prefix:" + prefix);
        System.out.println("result:" + isPrefix(input, prefix));

    }
    private static boolean isPrefix(String input, String prefix){
        if(input != null && !input.isEmpty()) {
            return input.startsWith(prefix);
        }
        return false;
    }
}
