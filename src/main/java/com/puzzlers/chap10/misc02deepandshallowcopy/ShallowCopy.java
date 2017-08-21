package com.puzzlers.chap10.misc02deepandshallowcopy;

import com.puzzlers.util.Misc02Student;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1. Default version of shallowClone() method. It creates shallow copy of an object.
 *
 * 2. Shallow copy: only copy the field, but share the references
 *
 * Example:
 * class Student implements Cloneable {
 *     int name;
 *     Course course;
 * }
 *
 * student2 = (Student)student1.shallowClone();
 * // student2 only has a copy of name filed, but still share the course with student1
 * // student1.setName("John"), student2 will not change anything
 * // student.setCourse("Math"), student2 will have the same change
 *
 */
public class ShallowCopy {

    public static void main(String[] args) throws CloneNotSupportedException {
        List<String> courseList = new ArrayList<>();
        String[] courses = {"Math", "PE", "Biology"};
        Arrays.stream(courses).forEach(courseList::add);

        Misc02Student student1 = new Misc02Student(100, "John", courseList);
        Misc02Student student2 = (Misc02Student)student1.shallowClone();

        System.out.println("Student1: " + student1);
        System.out.println("Student2: " + student2);

        // Modify student1
        System.out.println("Modify student1=======================");
        String[] newCourses = {"CS","Robotics"};
        Arrays.stream(newCourses).forEach(courseList::add);
        student1.setId(200);
        student1.setName("John II");
        student1.setCourses(courseList);

        System.out.println("Student1: " + student1);
        System.out.println("Student2: " + student2);

    }

}
