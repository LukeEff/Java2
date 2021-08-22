package io.github.lukeeff.java;

public class StringUtil {

    public static String reverse(String original) {
        StringBuilder finished = new StringBuilder();
        for (int i = original.length() - 1; i > -1; i--) {
            finished.append(original.charAt(i));
        }
        return finished.toString();
    }

}
