package ua.testing.model;

import java.util.ArrayList;
import java.util.List;

public class Model {

    private final int MAX_RANDOM = 100;

    private int lowerBorder;

    private int upperBorder;

    private int secretNumber;

    private List<Integer> log = new ArrayList<>();

    public Model() {
        lowerBorder = 0;
        upperBorder = MAX_RANDOM;
        secretNumber = getRandomNumber();
    }

    public Model(int lowerBorder, int upperBorder) {
        this.lowerBorder = lowerBorder;
        this.upperBorder = upperBorder;
        secretNumber = getRandomNumber(lowerBorder, upperBorder);
    }

    protected int getRandomNumber() {
        return (int) (Math.random() * 100);
    }

    protected int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }

    public boolean isRightNumber(int number) {
        log.add(number);
        if (number == secretNumber) {
            return true;
        }
        if (number > lowerBorder && number < secretNumber) {
            lowerBorder = number;
        } else if (number < upperBorder && number > secretNumber){
            upperBorder = number;
        }
        return false;
    }

    public int getLowerBorder() {
        return lowerBorder;
    }

    public int getUpperBorder() {
        return upperBorder;
    }

    protected void setSecretNumber(int secretNumber) {
        this.secretNumber = secretNumber;
    }
}
