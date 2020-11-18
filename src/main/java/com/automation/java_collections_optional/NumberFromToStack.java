package com.automation.java_collections_optional;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class NumberFromToStack {
    public static void ReversNumber() {
        System.out.println("Please insert the number: ");
        Scanner scanner = new Scanner(System.in);
        int numb = 0;
        {
            try {
                numb = scanner.nextInt();
            } catch (InputMismatchException noNumber) {
                System.out.print("\n" + "Attention! You didn't enter a number!");
            }

            Stack stack = new Stack();
            char[] numbers = String.valueOf(numb).toCharArray();
            for (char num : numbers) {
                stack.push(num);
            }

            while (!stack.empty()) {
                char stackNum;
                stackNum = (Character) stack.pop();
                System.out.print(stackNum);
            }
        }
        System.out.println( "\n");
    }
}
