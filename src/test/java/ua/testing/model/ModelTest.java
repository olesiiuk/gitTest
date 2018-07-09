package ua.testing.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModelTest {

    private static ExtendedModel model;

    @BeforeAll
    public static void init() {
        model = new ExtendedModel();
    }

    @Test
    public void getRandomNumber() {
        int number = model.getRandomNumber();

        if (number < 0 || number >= 100) {
            Assertions.fail("fail");
        }
    }


}