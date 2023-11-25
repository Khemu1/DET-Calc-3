package DET;

public class Calculator {
    protected double accumulator;

    public Calculator() {
        this.accumulator = 0;
    }

    public void add(double value) {
        accumulator += value;
    }

    public void subtract(double value) {
        accumulator -= value;
    }

    public void multiply(double value) {
        accumulator *= value;
    }

    public void divide(double value) {
        if (value != 0) {
            accumulator /= value;
        }
    }
}
