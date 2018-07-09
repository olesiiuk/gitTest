package ua.testing.model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ModelTest {

    private static ExtendedModel model;

    @BeforeAll
    public static void init() {
        model = new ExtendedModel();
    }

    @Disabled
    @RepeatedTest(10000)
    public void getRandomNumber() {
        int number = model.getRandomNumber();

        if (number < 0 || number >= 100) {
            Assertions.fail("Test failed");
        }
    }

    @Disabled
    @RepeatedTest(100)
    public void getRandomNumberWithParams() {
        int number = model.getRandomNumber(90, 95);

        if (number < 90 || number > 94) {
            Assertions.fail("Test failed");
        }
    }

    @Test
    public void isRightNumberNumberLessThenSecret() {
        model = new ExtendedModel();
        int secretNumber = 50;
        int testNumber = 25;
        model.setSecretNumber(secretNumber);

        model.isRightNumber(testNumber);

        if (model.getLowerBorder() != testNumber) {
            Assertions.fail("Border wasn't shifted");
        }
    }

    @Test
    public void isRightNumberBiggerThanSecret() {
        model = new ExtendedModel();
        int secretNumber = 50;
        int testNumber = 75;
        model.setSecretNumber(secretNumber);

        model.isRightNumber(testNumber);

        if (model.getUpperBorder() != testNumber) {
            Assertions.fail("Upper border wasn't shifted");
        }
    }

    @Test
    public void isRightNumberIsSecret() {
        model = new ExtendedModel();
        int secretNumber = 50;
        model.setSecretNumber(50);

        assertTrue(model.isRightNumber(secretNumber));
    }

    @Test
    public void isRightNumberLessThenBounds() {
        model = new ExtendedModel();
        int expected = model.getLowerBorder();

        model.isRightNumber(-17);

        assertEquals(expected, model.getLowerBorder());
    }

    @Test
    public void isRightNumberBiggerThanBounds() {
        model = new ExtendedModel();
        int expected = model.getUpperBorder();

        model.isRightNumber(2000);

        assertEquals(expected, model.getUpperBorder());
    }

}