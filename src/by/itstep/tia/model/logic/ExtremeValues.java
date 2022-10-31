package by.itstep.tia.model.logic;

public class ExtremeValues {

    public static double findMaximumValue(double[] array) {
        double maximumValue;
        maximumValue = Double.MIN_VALUE;
        for (double element : array) {
            if (maximumValue < element) {
                maximumValue = element;
            }
        }
        return maximumValue;
    }

    public static double findMinimumValue(double[] array) {
        double minimumValue;
        minimumValue = Double.MAX_VALUE;
        for (double element : array) {
            if (minimumValue > element) {
                minimumValue = element;
            }
        }
        return minimumValue;
    }

    public static double findAverageValue(double[] array) {
        double averageValue=0;
        for (double element:array) {
            averageValue+=element;
        }
        averageValue /= array.length;

        return averageValue;
    }

    public static double[] changePlacesOfExtremeValues(double[] array) {
        double minValue = ExtremeValues.findMinimumValue(array);
        double maxValue = ExtremeValues.findMaximumValue(array);
        int minIndex = -1, maxIndex = -1;

        for (int i = 0; (i < array.length & minIndex < 0); i++) {
            if (array[i] == minValue) {
                minIndex = i;
            }
        }
        for (int i = 0; (i < array.length & maxIndex < 0); i++) {
            if (array[i] == maxValue) {
                maxIndex = i;
            }
        }
        double bubble = array[minIndex];
        array[minIndex]= array[maxIndex];
        array[maxIndex]=bubble;

        return array;
    }

}
