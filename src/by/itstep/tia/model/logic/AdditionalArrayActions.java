package by.itstep.tia.model.logic;

public class AdditionalArrayActions {

    public static double sumElementsAbsoluteValueLessThanAverage(double[] array, double average) {
        double sum = 0;
        for (double element : array) {
            if (Math.abs(element) < average) {
                sum += element;
            }
        }
        return sum;
    }

    public static double multipleOfPositiveElementsWithEvenPlaces(double[] array) {
        double result = 1.0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0 & i % 2 != 0) {
                result *= array[i];
                count++;
            }
        }
        if (count == 0) {
            result = -1.0;
        }
        return result;
    }
}
