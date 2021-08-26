package Lesson2;

public class Lesson2 {

    public static void main(String[] args) {
        System.out.println("Задание 1: " + sumBoolean(5, 7));

        System.out.print("Задание 2: ");
        positiveInteger(-3);

        System.out.println("Задание 3: " + booleanInteger(5));

        System.out.println("Задание 4: ");
        textMultiplicator("Hello", 4);

    }

    public static boolean sumBoolean(int a, int b) {
        return (a + b > 10) && (a + b <= 20);
    }

    public static void positiveInteger (int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean booleanInteger (int a) {
        return a <= 0;
    }

    public static void textMultiplicator (String variable, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println ("String " + i + ":" + variable);
        }
    }

}
