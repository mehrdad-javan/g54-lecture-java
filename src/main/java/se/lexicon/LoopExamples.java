package se.lexicon;

import java.util.Scanner;

public class LoopExamples {

    public static void main(String[] args) {

        // While loop
        boolean isAdult = true;

        while (isAdult) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("How old are you?");
            int age = scanner.nextInt(); // takes ind number from the console

            if (age >= 18) {
                System.out.println("You are an adult");
            } else {
                System.out.println("You are a child");
                isAdult = false;
            }
        }


        boolean isContinue = false;
        do {
            System.out.println("## Calculator App ##");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("0. Exit");
        } while (isContinue);


        for (int i = 1; i <= 10; i++) {
            if (i == 5){
                continue;
            }
            System.out.println("Iteration: " + i); // 1,2,3,4,5,6,7,8,9, 10
        }


    }

}
