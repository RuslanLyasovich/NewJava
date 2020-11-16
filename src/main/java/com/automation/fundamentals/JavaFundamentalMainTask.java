import java.util.Scanner;

public class JavaFundamentalMainTask {
    // Выполнение заданий JavaFundamentalMainTask

    public static void main(String[] args) {

        {
            // 1. Приветствовать любого пользователя при вводе его имени через командную строку
            Scanner scan = new Scanner(System.in); // Объявляем Scanner
            System.out.println("Now. What is your name?");
            String name = scan.nextLine(); // Обявляем строковую переменную со значением, введеным из консоли
            System.out.println("Hello " + name + " ! Nice to meet You!");
        }

        {
            // 2. Отобразить в окне консоли аргументы командной строки в обратном порядке
            System.out.println("Enter the arguments in a single line separated by a space, the program will output them in reverse order");
            Scanner scan = new Scanner(System.in);
            StringBuffer toll = new StringBuffer(scan.nextLine());
            toll.reverse();
            System.out.println("\nEntered arguments in reverse order: " + toll.toString());
        }

        {
            // 3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
            Scanner scan = new Scanner(System.in);
            System.out.println("How many numbers do I need to generate?");
            int size = scan.nextInt(); // Читаем с клавиатуры значение для определения значения переменной size
            int[] array = new int[size]; // Создаём массив int размером в size
            for (int i = 0; i < array.length; i++) { // Заполнение массива случайными числами
                array[i] = ((int) (Math.random() * 1000));
            }
            System.out.print("Random numbers in one line: ");
            for (int i = 0; i < size; i++) {
                System.out.print(" " + array[i]);
            }
            System.out.println("\nRandom numbers with a new line transition: \n");
            for (int i = 0; i < size; i++) {
                System.out.println(" " + array[i]);
            }
        }

        {
            // 4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
            Scanner scan = new Scanner(System.in);
            System.out.println("How many numbers will you enter?");
            int size = scan.nextInt();
            long[] arr = new long[size];
            Scanner numb = new Scanner(System.in);
            System.out.print("Enter the number ");
            for (int i = 0; i < size; i++) {
                arr[i] = numb.nextInt();
            }

            System.out.println("\nThe sum of the numbers you set = ");
            long sum = 0L;
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
            }
            System.out.print(" " + sum);

            System.out.println("\nMultiplying the numbers you set = ");
            long mlt = 1L;
            for (int i = 0; i < arr.length; i++) {
                mlt = mlt * arr[i];
            }
            System.out.print(" " + mlt);
        }

        {
            // 5. Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
            System.out.println("\nEnter any number from 1 to 12, and in response you will find the name of the month corresponding to this number:");
            Scanner scan = new Scanner(System.in);
            int month = scan.nextInt();
            String[] age = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
            if (month > 0 && month < age.length) System.out.println(age[month]);
            else System.out.println("There is no such month");
        }
    }
}

