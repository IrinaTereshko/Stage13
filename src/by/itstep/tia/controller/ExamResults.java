package by.itstep.tia.controller;

import by.itstep.tia.model.data.ArrayCreation;
import by.itstep.tia.model.logic.ExamResultsProcessing;
import by.itstep.tia.view.InputOutput;

public class ExamResults {

    public static int MAX_MARK = 5;
    public static int MIN_MARK = 0;

    public static void main(String[] args) {

        int quantityOfMarks = ArrayCreation.inputQuantityOfArrayElements();

        int[] marks = InputOutput.inputMarks(" Input marks: ", quantityOfMarks, MAX_MARK, MIN_MARK);
        int[] marksCounted = ExamResultsProcessing.countMarks(MAX_MARK, marks);
        int[] percentage = ExamResultsProcessing.calculatePercentages(quantityOfMarks, marksCounted);

        InputOutput.output(" Exam Result Handling: ");
        InputOutput.output(" Marks: ", marks);

        for (int i = MAX_MARK; i >= 0; i--) {
            String msg = ExamResultsProcessing.convertToLiteral(i) +
                    " -- " + percentage[i] + "% (" + marksCounted[i] + ")";
            InputOutput.output(msg);
        }
    }
}
