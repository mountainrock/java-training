package com.bri8.collections;

import java.util.Comparator;

import java.util.*;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class StudentIdComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student2.getId() - student1.getId();//Integer.compare(student1.getId(), student2.getId());
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Renu"));
        students.add(new Student(103, "Rakesh"));
        students.add(new Student(102, "Suresh"));

        // Sorting the list using a custom comparator
        Collections.sort(students, new StudentIdComparator());

        System.out.println("Students sorted by ID:");
        for (Student student : students) {
            System.out.println(student.getId() + ": " + student.getName());
        }
    }
}

