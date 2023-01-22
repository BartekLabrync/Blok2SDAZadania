package org.exampleDay2;

public class Task14Day2 {
    public static void main(String[] args) {
        int [] inputs = {10, -3, 5, -4};
        int size = getTable(inputs);
        int [] arrayTab = arrayTab(inputs, size);
        System.out.println(getTable(inputs));
        System.out.println(arrayTab(inputs, size));
    }

    private static int getTable (int [] inputs){

        int counter = 0;
        for (int element : inputs) {
            if (element < 0) {
                counter++;
            }
        }

        return counter;
    }
    private static int [] arrayTab(int[] inputs, int size){
        int[] results = new int [size];
        int counter = 0;
        for (int element : inputs){
            if (element < 0){
                results[counter] = element;
                counter++;
            }
        }
        return inputs;
    }

}
