package by.itstep.tia.model.data;

import by.itstep.tia.view.InputOutput;
import java.util.Random;

public class ArrayCreation {

    public static double[] createArray() {

        int quantity = ArrayCreation.inputQuantityOfArrayElements();
        int fillingMethod = ArrayCreation.chooseArrayFillingMethod();
        double[] array;

        if (fillingMethod == 1) {
            array = ArrayCreation.fillArrayByUser(quantity);
        } else {
            array = ArrayCreation.fillArrayByRandom(quantity);
        }

        return array;
    }

    public static int inputQuantityOfArrayElements (){
        int quantityOfArrayElements;
        do {
            quantityOfArrayElements = InputOutput.input(" Input the quantity of array elements : ");
            if (quantityOfArrayElements < 1) {
                InputOutput.output("The quantity can't be less then 1. Please, input right value. \n ");
            }
        } while (quantityOfArrayElements < 1);

        return quantityOfArrayElements;}

    public static int chooseArrayFillingMethod() {

        int fillingMethod;

        do {
            fillingMethod = InputOutput.input("If you want to fill array from console  press 1. \n "
                    + "If with help of random function press 2. \n Please, make a choice: ");

            if (fillingMethod < 1 | fillingMethod > 2) {
                InputOutput.output(" Incorrect value!!! ");
            }
        }
        while (fillingMethod < 1 | fillingMethod > 2);

        return fillingMethod;
    }

    public static double[] fillArrayByRandom(int quantityOfArrayElements) {

        double[] array = new double[quantityOfArrayElements];
        Random random = new Random();
        InputOutput.output("Array elements: ");

        for (int i = 0; i < quantityOfArrayElements; i++) {
            array[i] = random.nextDouble(100);
            InputOutput.output(array[i]);
        }

        InputOutput.output("\n");

        return array;
    }

    public static double[] fillArrayByUser(int quantityOfArrayElements) {

        double[] array = new double[quantityOfArrayElements];

        InputOutput.output("Input array elements, fix every element with [Enter] : ");

        for (int i = 0; i < quantityOfArrayElements; i++) {
            array[i] = InputOutput.input();
        }

        return array;
    }
}
