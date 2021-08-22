package io.github.lukeeff.java;

import io.github.lukeeff.java.people.Person;

public class Java {

    public static void main(String[] args) {
        Person person = new Person("Luke", 20);
        String reversedName = StringUtil.reverse(person.getName());

        System.out.println(reversedName);
        System.out.println(person.getName());
    }
}
