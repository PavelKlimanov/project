package Lesson3;

public class Lesson3 {
    public static void main(String[] args) {

        int[] example1 = changeValue();


    }


    private static int[] changeValue() {
        int[] example1 = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for(int i=0; i<example1.length; i++) {
            if (example1[i]==0) example1[i]=1;
            else example1[i]=0;
        }
        return example1;
    }

    int[] array2 = new int[100];
    fillIn(array2);
    printArray1("2. Filled with cycle:\t", array2)

    public static void printArray1(String msg, int[] inputArray) {
        System.out.print(msg + ": ");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }

}
