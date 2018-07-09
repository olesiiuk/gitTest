package ua.testing.view;

import java.util.List;

public class View {
    private String SPACE = " ";
    private String COMMA = ",";

    private String ASK_NUMBER_FORMAT = "Enter number in bounds from %d to %d";
    private String LOG_MESSAGE = "Numbers you entered before:";
    private String SUCCESS_MESSAGE_FORMAT = "You have won! The secret number was %d";


    public void askNumber(int from, int to) {
        printMessage(String.format(ASK_NUMBER_FORMAT, from, to));
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printLog(List<Integer> log) {
        StringBuilder sb = new StringBuilder(LOG_MESSAGE);
        for (Integer number : log) {
            sb.append(SPACE);
            sb.append(number);
            sb.append(COMMA);
        }

        printMessage(sb.toString());
    }

    public void printSuccessMessage(int number) {
        printMessage(String.format(SUCCESS_MESSAGE_FORMAT, number));
    }
}
