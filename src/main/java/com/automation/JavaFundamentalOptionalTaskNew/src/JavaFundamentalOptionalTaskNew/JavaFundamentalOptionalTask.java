package JavaFundamentalOptionalTaskNew;

import java.util.Scanner;

public class JavaFundamentalOptionalTask {

    public static void main(String[] args) {

        // Ввести n чисел с консоли
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите числа через пробел: ");
        String input = scan.nextLine();

        // Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
        StringLengthSort.theLongAndShortNombers (input);


        // Сортировка по возрастанию и убыванию длины чисел
        String[] numbers = input.split(" ");
        StringLengthSort.allNumbers(numbers);
        StringLengthSort.toLongNumbers(numbers);
        StringLengthSort.toShortNumbers(numbers);
    }
}