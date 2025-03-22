package ru.stepup;

public class SumAll extends Fraction {
    private double sum;

    SumAll(Number... nums) {
        for (Number n : nums) {
            if (n instanceof Integer) {
                sum += n.doubleValue();
            } else if (n instanceof Double) {
                sum += n.doubleValue();
            } else if (n instanceof Float) {
                sum += n.doubleValue();
            } else if (n instanceof Long) {
                sum += n.doubleValue();
            } else if (n instanceof Fraction) {
                sum += n.doubleValue();
            } else {
                throw new IllegalArgumentException("Неизвестный числовой тип");
            }
        }

    }

    public double getSum() {
        return sum;
    }
}
