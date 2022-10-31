package by.itstep.tia.model.logic;

public class ExamResultsProcessing {

    public static int[] countMarks(int maxMark, int[] marks) {

        int[] marksCounted = new int[maxMark + 1];

        for (int i = 0; i < marksCounted.length; i++) {
            int counter = 0;
            for (int element : marks) {
                if (element == i) {
                    counter++;
                }
            }
            marksCounted[i] = counter;
        }
        return marksCounted;
    }

    public static int[] calculatePercentages(int quantityOfMarks, int[] marksCounted) {
        int[] percentages = new int[marksCounted.length];
        for (int i = 0; i < marksCounted.length; i++) {
            percentages[i] = marksCounted[i] * 100 / quantityOfMarks;
        }
        return percentages;
    }

    public static String convertToLiteral(int mark) {
        String markByLetters;
        switch (mark) {
            case 0:
                markByLetters = "zeros";
                break;
            case 1:
                markByLetters = "units";
                break;
            case 2:
                markByLetters = "deuces";
                break;
            case 3:
                markByLetters = "triplets";
                break;
            case 4:
                markByLetters = "fours";
                break;
            default:
                markByLetters = "fives";
        }
        return markByLetters;
    }

}
