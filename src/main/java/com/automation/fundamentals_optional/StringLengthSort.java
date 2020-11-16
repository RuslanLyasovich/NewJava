
import java.util.Arrays;
import java.util.Comparator;

public class StringLengthSort implements Comparator<String> {


    public static void theLongAndShortNombers(String input) {
        String longNumber = "", shortNumber = input;

        for (String s : input.split(" ")) {
            if (s.length() > longNumber.length()) longNumber = s;
            if (s.length() < shortNumber.length()) shortNumber = s;
        }
        System.out.println("Самое длинное введенное число: " + longNumber);
        System.out.println("Это число состоит из: " + longNumber.length() + " символов");
        System.out.println("Самое короткое введенное число: " + shortNumber);
        System.out.println("Это число состоит из: " + shortNumber.length() + " символa(-ов)");
    }

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


    public static void allNumbers(String[] numbers) {
        System.out.println("\nВы ввели числа:\n");
        for (String str : numbers) {
            System.out.println(str);
        }

    }


    public static void toLongNumbers(String[] numbers) {
        Comparator<String> stringLengthComparator = new StringLengthSort();
        Arrays.sort(numbers, stringLengthComparator);
        System.out.println("\nЧисла отсортированы по возрастанию их длины:\n");
        for (String str : numbers) {
            System.out.println(str);
        }


    }

    public static void toShortNumbers(String[] numbers) {
        Comparator<String> stringLengthComparator = new StringLengthSort();
        Arrays.sort(numbers, stringLengthComparator);
        System.out.print("\nЧисла отсортированы по убыванию их длины:\n");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }


}





