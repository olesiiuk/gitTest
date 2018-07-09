package ua.testing.model;

import java.util.ArrayList;
import java.util.List;

public class Model {

    private final int MAX_RANDOM = 100;

    private int lowerBorder;

    private int upperBorder;

    private int secretNumber;

    private List<Integer> log;

    public Model() {
        lowerBorder = 0;
        upperBorder = MAX_RANDOM;
        log = new ArrayList<>();
        secretNumber = getRandomNumber();
    }

    protected int getRandomNumber() {
        return 0;
    }


}
