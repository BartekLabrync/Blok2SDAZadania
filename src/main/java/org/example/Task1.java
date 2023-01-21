package org.example;

public class Task1 {
    public static void main (String[] args){
    displayWordUsignDecimalFormat();
    System.out.println();
    displayWordUsignBinaryFormat();
        System.out.println();
    displayWordUsignHexFormat();
    }
    private static void displayWordUsignDecimalFormat(){
        char s = 83;
        char d = 68;
        char a = 65;
        System.out.print(s);
        System.out.print(d);
        System.out.print(a);
    }
    private static void displayWordUsignBinaryFormat(){
        char s = 0b01010011;
        char d = 0b01000100;
        char a = 0b01000001;
        System.out.print(s);
        System.out.print(d);
        System.out.print(a);
    }
    private static void displayWordUsignHexFormat(){
        char s = 0x53;
        char d = 0x44;
        char a = 0x41;
        System.out.print(s);
        System.out.print(d);
        System.out.print(a);
    }
}
