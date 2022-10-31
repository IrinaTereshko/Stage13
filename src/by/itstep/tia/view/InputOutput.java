package by.itstep.tia.view;

import java.util.Scanner;

public class InputOutput {

    public static void output(String msg) {
        System.out.println(msg);
    }

    public static void output(double element) {
        System.out.print(element + "|");
    }

    public static void output(String msg, double[] array) {
        System.out.println(msg);
        for (double element : array) {
            System.out.print(element + "|");
        }
    }

    public static void output(String msg, int[] array) {
        System.out.println(msg);
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    public static int input(String msg) {

        System.out.print(msg);
        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();

    }

    public static double input() {

        Scanner scanner = new Scanner(System.in);

        return scanner.nextDouble();
    }

    public static int[] inputMarks(String msg, int quantityOfArrayElements, int maxMark, int minMark) {

        int[] array = new int[quantityOfArrayElements];
        Scanner scanner = new Scanner(System.in);

        System.out.println(msg);

        for (int i = 0; i < (quantityOfArrayElements); i++) {
            do {
                array[i] = scanner.nextInt();

                if (array[i] < minMark || array[i] > maxMark) {
                    System.out.println(" Incorrect mark, please check and repeat input! ");
                }

            } while (array[i] < minMark || array[i] > maxMark);
        }
        return array;
    }


}
