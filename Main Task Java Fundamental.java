import java.util.Scanner;

public class Training {
    // Выполнение заданий Java Fundamental Main Task

    public static void main(String[] args) {
        {
            // 1. Приветствовать любого пользователя при вводе его имени через командную строку

            Scanner sc = new Scanner(System.in); // Объявляем Scanner
            System.out.println("Как к Вам можно обратиться?");
            String name = sc.nextLine(); // Обявляем строковую переменную со значением, введеным из консоли
            System.out.println("Здравствуйте " + name + " ! Приятно с Вами познакомится!");

        }

        {
            // 2. Отобразить в окне консоли аргументы командной строки в обратном порядке
            System.out.println("Введите аргументы в одну строку, программа выведет их в обратном порядке");
            Scanner sc = new Scanner(System.in);
            StringBuffer toll = new StringBuffer(sc.nextLine());
            toll.reverse();
            System.out.println("\nВведенная Вами строка в обратном порядке: " + toll.toString());

        }

        {
            // 3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

            Scanner a = new Scanner(System.in);
            System.out.println("Программа для операций с числами. Сколько чисел Вы введете?");
            int size = a.nextInt(); // Читаем с клавиатуры значение для определения значения переменной size
            int[] arr = new int[size]; // Создаём массив int размером в size
            Scanner s = new Scanner(System.in);
            System.out.print("Введите числа "); //Заполнение массива/
            for (int i = 0; i < size; i++) {
                arr[i] = s.nextInt();
            } // Заполняем массив элементами, введёнными с клавиатуры
            System.out.print("Заданные Вами числа в одну строку: ");
            for (int i = 0; i < size; i++) {
                System.out.print(" " + arr[i]);
            }
            System.out.println("\nЗаданные Вами числа с переходом на новую строку: \n");
            for (int i = 0; i < size; i++) {
                System.out.println(" " + arr[i]);
            }
        }

        {
            // 4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
            Scanner a = new Scanner(System.in);
            System.out.println("Сколько целых чисел Вы введете?");
            int size = a.nextInt();
            long[] arr = new long[size];
            Scanner s = new Scanner(System.in);
            System.out.print("Введите числа ");
            for (int i = 0; i < size; i++) {
                arr[i] = s.nextInt();
            }
            {
                System.out.println("Сумма заданных Вами чисел = ");
                long sum = 0;
                for (int i = 0; i < arr.length; i++) {
                    sum = sum + arr[i];
                }
                System.out.print(" " + sum);
            }
            {
                System.out.println("\nПроизведение заданных Вами чисел = ");
                long mlt = 1;
                for (int i = 0; i < arr.length; i++) {
                    mlt = mlt * arr[i];
                }
                System.out.print(" " + mlt);
            }
        }

        {
            // 5. Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
            String[] age = {"январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "ноябрь", "декабрь"};
            Scanner a = new Scanner(System.in);
            System.out.println("\nВведите любое число от 1 до 12, а в ответ Вы узнаете название месяца, соотвествующего данному числу");
            {
                try { // Пробую использовать возможности исключения
                    int month = a.nextInt() - 1;
                    if (month > 0 && month < age.length);
                        System.out.println(age[month]);
                } catch (ArrayIndexOutOfBoundsException e) { // Введенное значение не принадлежит массиву
                    System.out.println("\nМесяца с таким порядковым номером не существует!");
                }
            }
        }

    }
}

