package com.automation.java_classes;

public class Student {

    private int id;
    private String name;
    private String middleName;
    private String surname;
    private int data;
    private String address;
    private String phone;
    private String faculty;
    private String course;
    private String group;


    Student(int id, String name, String middleName, String surname, int data, String address, String phone, String faculty, String course, String group) {
        this.id = id;
        this.name = name;
        this.middleName = middleName;
        this.surname = surname;
        this.data = data;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName2() {
        return middleName;
    }

    public String getSurname() {
        return surname;
    }

    public int getData() {
        return data;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }


    public String toString() {
        return "Student{" + " id " + id +
                ", name: " + name + "" +
                ", middleName: " + middleName + "" +
                ", dateOfBirth: " + data + "" +
                ", surname: " + surname + "" +
                ", phoneNumber: " + phone + "" +
                ", faculty: " + faculty + "" +
                ", course: " + course + "" +
                ", group: " + group + "" + "}";
    }
}
