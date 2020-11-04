import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Main Task
Для выполнения достаточно выбрать одно задание.
Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы setТип(), getТип(), toString(). Определить дополнительно методы в классе, создающем массив объектов. Задать критерий выбора данных и вывести эти данные на консоль. В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.

1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа.

Создать массив объектов. Вывести:

a) список студентов заданного факультета;

b) списки студентов для каждого факультета и курса;

c) список студентов, родившихся после заданного года;

d) список учебной группы.

 */

public class MyUniversity {
        public static void main(String[] args) {
            University mgu = new University("Mgu");
            mgu.addStudentToUniversityList(new Student("Иван", "Иванович", "Иванов", 1999, "Минск", 12345, "Юридический", 3, "04Пр"));
            mgu.addStudentToUniversityList(new Student("Андрей", "Семенович", "Полозов", 2001, "Полоцк", 23456, "Строительный", 1, "06Ст"));
            mgu.addStudentToUniversityList(new Student("Савва", "Самуилович", "Кац", 1998, "Витебск", 78999, "Юридический", 3, "04Пр"));
            mgu.addStudentToUniversityList(new Student("Светлана", "Ивановна", "Непоседова", 1997, "Молодечно", 89897, "Юридический", 3, "04Пр"));
            mgu.addStudentToUniversityList(new Student("Игорь", "Степанович", "Конь", 2000, "Слуцк", 78997, "Строительный", 2, "05Ст"));
            mgu.addStudentToUniversityList(new Student("Бенджамин", "Франклинович", "Стоун", 2002, "Заславль", 67897, "Юридический", 2, "05Пр"));
            mgu.addStudentToUniversityList(new Student("Антон", "Иосифович", "Луцевич", 1999, "Минск", 89653, "Юридический", 2, "05Пр"));
            mgu.addStudentToUniversityList(new Student("Василий", "Васильевич", "Морозов", 1998, "Витебск", 34721, "Строительный", 3, "04Ст"));
            mgu.addStudentToUniversityList(new Student("Ольга", "Олеговна", "Чернявская", 2003, "Орша", 67834, "Юридический", 1, "06Пр"));
            mgu.addStudentToUniversityList(new Student("Наталья", "Антоновна", "Стома", 1996, "Новополоцк", 98345, "Строительный", 2, "05Ст"));
            mgu.addStudentToUniversityList(new Student("Карина", "Михайловна", "Пушистая", 2001, "Минск", 89221, "Юридический", 3, "04Пр"));


            // Вывод общего списка (ДОРАБОТАТЬ)
            System.out.println("\nStudents:");
            System.out.println(mgu);


            // Сортировка по факультету
            System.out.println("\nsort by faculty:");
            List<Student> listSortByFaculty = mgu.getListByFaculty();
            for (Student c : listSortByFaculty) {
                System.out.println(c);
            }

            // Сортировка по группе
            System.out.println("\nsort by group:");
            List<Student> listSortByGroup = mgu.getListByGroup();
            for (Student c : listSortByGroup) {
                System.out.println(c);
            }

            // список студентов заданного факультета
            System.out.println("\nlist of students of a given faculty:");
        }
    }


    class University {
        private String universityName;
        private ArrayList<Student> studentsList = new ArrayList<>();

        University(String universityName) {
            this.universityName = universityName;
        }

        void addStudentToUniversityList(Student student) {
            studentsList.add(student);
        }



        // Вызов сортировки по группе
        public List<Student> getListByGroup() {
            List<Student> list = new ArrayList<>(studentsList);
            Collections.sort(list, new Comparator<Student>() {
                public int compare(Student Student1, Student Student2) {
                    return Student1.getGroup().compareTo(Student2.getGroup());
                }
            });
            return list;
        }


        // Вызов сортировки по факультету
        public List<Student> getListByFaculty() {
            List<Student> list = new ArrayList<>(studentsList);
            Collections.sort(list, new Comparator<Student>() {
                public int compare(Student Student1, Student Student2) {
                    return Student1.getFaculty().compareTo(Student2.getFaculty());
                }
            });
            return list;
        }

    }


    class Student {
        {
            idGenerator++;
        }

        private static int idGenerator = 0;
        private int id = idGenerator;
        private String name;
        private String name2;
        private String name3;
        private int data;
        private String address;
        private int phone;
        private String faculty;
        private int course;
        private String group;


        Student(String name, String name2, String name3, int data, String address, int phone, String faculty, int course, String group) {
            this.name = name;
            this.name2 = name2;
            this.name3 = name3;
            this.data = data;
            this.address = address;
            this.phone = phone;
            this.faculty = faculty;
            this.course = course;
            this.group = group;

        }


        public String getName() {
            return name;
        }

        public String getName2() {
            return name2;
        }

        public String getName3() {
            return name3;
        }

        public int getData() {
            return data;
        }

        public String getAddress() {
            return address;
        }

        public int getPhone() {
            return phone;
        }

        public String getFaculty() {
            return faculty;
        }

        public int getCourse() {
            return course;
        }

        public String getGroup() {
            return group;
        }

        public void setFaculty(String faculty) {
            this.faculty = faculty;
        }


        //список студентов заданного факультета (ДОРАБОТАТЬ)
        public String faculty() {
            if ((this.getFaculty()).equals("Юридический")) {
                return String.format("ID: %d\t name: %s\t name2: %s\t name3 %s \t date of birth: %d\t address %s\t phone %d\t faculty %s\t course %s\t group %s\t",
                        id, name, name2, name3, data, address, phone, faculty, course, group);
            }
            return null;
        }


        public String toString() {
            return String.format("ID: %d\t name: %s\t name2: %s\t name3 %s \t date of birth: %d\t address %s\t phone %d\t faculty %s\t course %s\t group %s\t",
                    id, name, name2, name3, data, address, phone, faculty, course, group);
        }

    }
