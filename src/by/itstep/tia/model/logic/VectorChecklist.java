package by.itstep.tia.model.logic;

public class VectorChecklist {

    public static boolean checkForDescOrder(double[] array) {
        int count = 0;
        for (int i = 0; i < (array.length - 1); i++) {
            if (array[i] > array[i + 1]) {
                count++;
            }
        }

        return (count == array.length - 1);
    }

    public static boolean checkForAscOrder(double[] array) {

        int count = 0;
        for (int i = 0; i < (array.length - 1); i++) {
            if (array[i] < array[i + 1]) {
                count++;
            }
        }

        return (count == array.length - 1);
    }

    public static boolean checkForMirrorOrder(double[] array) {
        int count = 0;
        int middleIndex = (array.length % 2 == 0) ? (array.length / 2 - 1) : (array.length / 2 + 1);
        for (int i = 0; i <= middleIndex; i++) {
            if (array[i] == array[array.length - 1 - i]) {
                count++;
            }
        }

        return (count == middleIndex + 1);
    }

    public static boolean checkForAllDifferentElements(double[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (double element : array) {
                if (array[i] == element) {
                    count++;
                }
                if (count > i + 1) return false;
            }
        }
        return true;
    }

    public static boolean checkForAllTheSameElements(double[] array) {
        int count = 0;
        double reference = array[0];
        for (double element : array) {

            if (reference == element) {
                count++;
            }
        }

        return (count == array.length);
    }

    public static int countAllOddElements(double[] array) {
        int counter = 0;
        for (double element : array) {
            if (element % 2 != 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int countAllEvenElements(double[] array) {
        int counter = 0;
        for (double element : array) {
            if (element % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }
}




