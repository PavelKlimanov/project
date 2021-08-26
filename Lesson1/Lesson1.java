package Lesson1;

public class Lesson1 {

        public static void main(String[] args) {
            printThreeWords();
            checkSumSign(300, 28);
            printColor();
            compareNumbers();
        }

        public static void printThreeWords() {
            System.out.println("_Orange");
            System.out.println("_Banana");
            System.out.println("_Apple");
        }

        public static void checkSumSign(int a, int b) {

            int result = a + b;
            if (result >= 0) {
                System.out.println("Сумма положительная");
            }
            else {
                System.out.println("Сумма отрицательная");
            }
        }

        public static void printColor() {
            int value = 64;
            if (value < 0) {
                System.out.println("Красный");
            }
            else if (value > 0 && value <= 100) {
                System.out.println("Желтый");
            }
            else {
                System.out.println("Зеленый");
            }
        }

        public static void compareNumbers() {
            int a = 25;
            int b = 31;
            if (a>=b) {
                System.out.println("a>=b");
            }
            else {
                System.out.println("a<b");
            }
        }
    }
