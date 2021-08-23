package io.github.lukeeff.java;

import io.github.lukeeff.java.people.Person;
import io.github.lukeeff.java.people.Person.EyeColor;

public class Java {

    public static void main(String[] args) {
        Person person = new Person("Luke", 20, EyeColor.BROWN);
        String reversedName = StringUtil.reverse(person.getName());

        System.out.println(reversedName);
        System.out.println(person.getName());
    }
}
