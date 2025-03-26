package com.mg.java11problems;

public class BlankLineCounter {
    public static void main(String[] args) {
        String text = "Java 11 is awesome!\n\n  \nStreams are powerful.\n\n    \n";
        long blankLineCount = text.lines()
                .filter(String::isBlank)
                .count();
        System.out.println(blankLineCount);
    }
}
