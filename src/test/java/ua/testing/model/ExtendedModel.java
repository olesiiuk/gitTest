package ua.testing.model;

public class ExtendedModel extends Model {

    public ExtendedModel() {
        super();
    }

    @Override
    protected int getRandomNumber() {
        return super.getRandomNumber();
    }

    public ExtendedModel(int lowerBorder, int upperBorder) {
        super(lowerBorder, upperBorder);
    }

    @Override
    protected int getRandomNumber(int min, int max) {
        return super.getRandomNumber(min, max);
    }

    @Override
    protected void setSecretNumber(int secretNumber) {
        super.setSecretNumber(secretNumber);
    }

    @Override
    public int getLowerBorder() {
        return super.getLowerBorder();
    }

    @Override
    public int getUpperBorder() {
        return super.getUpperBorder();
    }
}
