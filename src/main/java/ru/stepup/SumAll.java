package ru.stepup;

public class SumAll extends Fraction {
    private double sum;

    SumAll(Number... nums) {
        for (Number n : nums) {
            sum += n.doubleValue();
        }

    }

    public double getSum() {
        return sum;
    }
}
