package org.interview;

import org.interview.dsa.ArrayQuestion;

public class Main {

    private static void runCode(int type) {

        switch (type) {
            case 1:
                ArrayQuestion arrayQuestion= new ArrayQuestion();
                arrayQuestion.main();
                break;
            default:
                System.out.println("nothing found");
        }

    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        runCode(1);
    }
}