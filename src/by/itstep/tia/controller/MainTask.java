package by.itstep.tia.controller;

import by.itstep.tia.model.data.ArrayCreation;
import by.itstep.tia.model.logic.VectorChecklist;
import by.itstep.tia.view.InputOutput;

public class MainTask {

    public static void main(String[] args) {

        double[] array = ArrayCreation.createArray();

        InputOutput.output(" The array elements are in ascending order: "
                + VectorChecklist.checkForAscOrder(array));
        InputOutput.output(" The array elements are in descending order: "
                + VectorChecklist.checkForDescOrder(array));
        InputOutput.output(" The array elements are in mirror order around the middle: " +
                VectorChecklist.checkForMirrorOrder(array));
        InputOutput.output(" The array elements are all the same: " +
                VectorChecklist.checkForAllTheSameElements(array));
        InputOutput.output(" The array elements are unique: " +
                VectorChecklist.checkForAllDifferentElements(array));
        InputOutput.output(" The odd array elements quantity is: " +
                VectorChecklist.countAllOddElements(array));
        InputOutput.output(" The even array elements quantity is: " +
                VectorChecklist.countAllEvenElements(array));
    }
}
