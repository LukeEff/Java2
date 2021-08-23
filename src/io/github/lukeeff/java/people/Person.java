package io.github.lukeeff.java.people;

public class Person {

    private String name;
    private int age;
    private EyeColor eyeColor;

    private static final int OLD_AGE = 70;

    public enum EyeColor {
        BROWN(),
        HAZEL(),
        BLUE(),
        GREEN();
    }

    public Person(String name, int age, EyeColor eyeColor) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
    }

    public String getName() {
        return name;
    }

    public boolean isOld() {
        return age >= OLD_AGE;
    }
}
