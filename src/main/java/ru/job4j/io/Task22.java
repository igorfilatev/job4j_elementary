package ru.job4j.io;

public class Task22 {
    public static void nameInsert(String name) {
        String result = String.format("Привет, %s!", name);
        System.out.println(result);
    }

    public static void main(String[] args) {
        nameInsert("Николай");
    }
}
