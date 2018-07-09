package ua.testing.controller;

import ua.testing.model.Model;
import ua.testing.view.View;

import java.util.Scanner;

public class Controller {

    private Model model;

    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void process() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            askToEnterNumber();

            int number = getUsersNumber(scanner);

            view.printLog(model.getLog());

            if (model.isRightNumber(number)) {
                view.printSuccessMessage(number);
                break;
            }
        }
    }

    private void askToEnterNumber() {
        view.askNumber(model.getLowerBorder(), model.getUpperBorder());
    }

    private int getUsersNumber(Scanner scanner) {
        int number;
        while (true) {
            String input = scanner.next();
            try {
                number = Integer.parseInt(input);
                break;
            } catch (NumberFormatException ex) {
                askToEnterNumber();
            }
        }
        return number;
    }


}
