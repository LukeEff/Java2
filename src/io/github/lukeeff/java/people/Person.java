package io.github.lukeeff.java.people;

public class Person {

    private String name;
    private int age;

    private static final int OLD_AGE = 70;

    enum EyeColor {
        BROWN(),
        HAZEL(),
        BLUE(),
        GREEN();
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public boolean isOld() {
        return age >= OLD_AGE;
    }
}
