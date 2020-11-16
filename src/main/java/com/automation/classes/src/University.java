package src.main.java.com.automation.testProject;

import java.util.ArrayList;



public class University {


    private String universityName;
    private ArrayList<Student> studentsList;

    University(String universityName) {
        this.universityName = universityName;
        this.studentsList = new ArrayList<>();
    }

    // Метод добавления в массив
    void addStudentToUniversityList(Student student) {
        studentsList.add(student);
    }

    // Метод фильтрации массива по заданному параметру "Факультет"
    public void selectionToFaculty(String fc){
        System.out.println("Список студентов факультета " + fc + ": ");
        for (Student c : studentsList) {
            if (c.getFaculty().equals(fc)) {
                System.out.println(c);
            }
        }
        System.out.println("\n");
    }


    // Метод фильтрации массива по заданному параметру "Cписки студентов для каждого факультета и курса"
    public void selectionToFacultyAndToCourse(String fc, String crs) {
        System.out.println("Список студентов факультета: " + fc + " курса: " + crs);
        for (Student c : studentsList) {
            if (c.getFaculty().equals(fc) & c.getCourse().equals(crs)) {
                System.out.println(c);
            }
        }
        System.out.println("\n");
    }


    // Метод фильтрации массива по заданному параметру "Родившиеся после заданного года"
    public void selectionToYard(int ya) {
        System.out.println("Список студентов, родившихся после "+ ya +" года: ");
        for(Student c:studentsList) {
            if (c.getData() > ya) {
                System.out.println(c);
            }
        }
        System.out.println("\n");
    }

    // Метод фильтрации массива по заданному параметру "Группа"
    public void selectionToGroup(String gr) {
        System.out.println("Список студентов группы " + gr + ": ");
        for (Student c : studentsList) {
            if (c.getGroup().equals(gr)) {
                System.out.println(c);
            }
        }
        System.out.println("\n");
    }


}


