package by.itstep.tia.controller;

import by.itstep.tia.model.data.ArrayCreation;
import by.itstep.tia.model.logic.AdditionalArrayActions;
import by.itstep.tia.model.logic.ExtremeValues;
import by.itstep.tia.view.InputOutput;

public class GeneralTask {
    public static void main(String[] args) {

        double[] array = ArrayCreation.createArray();

        double maxValue = ExtremeValues.findMaximumValue(array);
        double minValue = ExtremeValues.findMinimumValue(array);
        double average = ExtremeValues.findAverageValue(array);
        double sum = AdditionalArrayActions.sumElementsAbsoluteValueLessThanAverage(array, average);

        double multiple = AdditionalArrayActions.multipleOfPositiveElementsWithEvenPlaces(array);
        String multipleMsg = " Multiple of positive array elements on even places is: " + multiple;
        if (multiple < 0) {
            multipleMsg = " There is no positive array elements with even indexes.";
        }

        double[] arrayWithChangedMinAndMaxValues =
                ExtremeValues.changePlacesOfExtremeValues(array);

        InputOutput.output("Element with maximum value: " + maxValue);
        InputOutput.output("Element with minimum value: " + minValue);
        InputOutput.output("Average of array elements: " + average);
        InputOutput.output("Sum of array elements which absolute value less than average is: " + sum);
        InputOutput.output(multipleMsg);
        InputOutput.output(" The array with changed min and max value elements: ", arrayWithChangedMinAndMaxValues);

    }
}
