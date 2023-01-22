package org.exampleDay2;

public class Task5Day2 {
    public static void main(String[] args) {
        String input = "Ala ma kota";
        char searched = 'a';
        System.out.println("Result:" + CountCharInString("Ala ma kota",'a'));

        input = null;
        searched = 'z';
        System.out.println("Result:" + CountCharInString("Ala ma kota",'a'));



    }
        private static int CountCharInString (String input,char searched){
            if (StringValidator.isValid(input)) {
                int counter = 0;
                for (int i = 0; i < input.length(); i++) {
                   if (input.charAt(i) == searched){
                       counter++;
                   }
                }

            }

            return 0;
        }

    }

