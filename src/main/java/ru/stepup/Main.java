package ru.stepup;

public class Main {
    public static void main(String[] args) {

        SumAll n1 = new SumAll(2,new Fraction(3,5),2.3d); //ОР 4.9
        System.out.println(n1.getSum());

        SumAll n2 = new SumAll(3.6d,new Fraction(49,12),3,new Fraction(3,2)); //ОР ~12.18
        System.out.println(n2.getSum());

        SumAll n3 = new SumAll(new Fraction(1,3),1); //ОР ~1.33
        System.out.println(n3.getSum());
    }
}