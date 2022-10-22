package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }

    public static void main(String[] args) {
        double result = Point.distance(2, 1, 6, 4);
        System.out.println("result (2, 1) to (6, 4) " + result);
        result = distance(7, 3, 12, 4);
        System.out.println("result (7, 3) to (12, 4) " + result);
        result = distance(21, 21, 89, 54);
        System.out.println("result (21, 21) to (89, 54) " + result);
    }
}
