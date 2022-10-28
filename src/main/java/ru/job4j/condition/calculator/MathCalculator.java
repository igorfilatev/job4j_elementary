package ru.job4j.condition.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double plusAndUmn(double first, double second) {
        return plus(first, second)
                + umn(first, second);
    }

    public static double minusandDel(double first, double second) {
        return minus(first, second)
                - del(first, second);
    }

    public static double sumall(double first, double second) {
        return plus(first, second) + minus(first, second)
                + umn(first, second) + del(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + plusAndUmn(10, 20));
        System.out.println("Результат расчета равен: " + minusandDel(10, 20));
        System.out.println("Результат расчета равен: " + sumall(10, 20));
    }
}
