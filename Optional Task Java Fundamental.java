import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JavaTask {
        public static void main(String[] args) {
            // Создание массива
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите числа через пробел: ");
            String input = sc.nextLine();
            String[] numbers = input.split(" ");
            System.out.println("Спасибо! Вы ввели числа: ");
            System.out.println(String.join(", ", numbers));// Поиск самого длинного числа
            int maxLengthString = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i].length() > maxLengthString) {
                    maxLengthString = numbers[i].length();
                }
            }
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i].length() == maxLengthString) {
                    System.out.println("Самое длинное введенное число: " + numbers[i]);
                    System.out.println("Это число состоит из: " + numbers[i].length() + " символов");
                }
            }

            // Поиск самого короткого числа
            int minLengthString = maxLengthString;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i].length() < minLengthString) {
                    minLengthString = numbers[i].length();
                }
            }
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i].length() == minLengthString) {
                    System.out.println("Самое короткое введенное число: " + numbers[i]);
                    System.out.println("Это число состоит из: " + numbers[i].length() + " символов");
                }
            }

            // Сортировка по возрастанию и убыванию длины чисел
            class StringLengthSort implements Comparator<String> {
                @Override
                public int compare(String o1, String o2) {
                    if (o1.length() > o2.length()) {
                        return 1;
                    } else {
                        if (o1.length() < o2.length()) {
                            return -1;
                        } else {
                            return 0;
                        }
                    }
                }
            }
            {
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
                for (int i = numbers.length - 1; i >= 0; i--){
                    System.out.println(numbers[i]);
                }
            }

        }
    }