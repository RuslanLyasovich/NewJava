import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JavaFundamentalOptionalTask {

    public static void main(String[] args) {

        // Ввести n чисел с консоли. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите числа через пробел: ");
        String input = scan.nextLine();
        String[] numbers = input.split(" ");
        String longNumber = "", shortNumber = input;

        for (String s : input.split(" ")) {
            if (s.length() > longNumber.length()) longNumber = s;
            if (s.length() < shortNumber.length()) shortNumber = s;
        }
        System.out.println("Самое длинное введенное число: " + longNumber);
        System.out.println("Это число состоит из: " + longNumber.length() + " символов");
        System.out.println("Самое короткое введенное число: " + shortNumber);
        System.out.println("Это число состоит из: " + shortNumber.length() + " символa(-ов)");


        // Сортировка по возрастанию и убыванию длины чисел


        class StringLengthSort implements Comparator<String> {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }

        Comparator<String> stringLengthComparator = new StringLengthSort();
        System.out.println("\nВы ввели числа:\n");
        for (String str : numbers) {
        System.out.println(str);
        }
        Arrays.sort(numbers, stringLengthComparator);
        System.out.println("\nЧисла отсортированы по возрастанию их длины:\n");
        for (String str : numbers) {
        System.out.println(str);
        }
        System.out.print("\nЧисла отсортированы по убыванию их длины:\n");
        for (int i = numbers.length - 1; i >= 0; i--) {
        System.out.println(numbers[i]);
        }
    }
}