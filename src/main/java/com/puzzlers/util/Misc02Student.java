package com.puzzlers.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shubo on 8/21/2017.
 */
public class Misc02Student  implements Cloneable{

    private int id;
    private String name;

    private List<String> courses;
    private List<Misc02Contact> contacts;

    public Misc02Student(int id, String name, List<String> courses) {
        this.id = id;
        this.name = name;
        this.courses = courses;
    }

    public Misc02Student(int id, String name, List<String> courses, List<Misc02Contact> contacts) {
        this.id = id;
        this.name = name;
        this.courses = courses;
        this.contacts = contacts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }



    public List<Misc02Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Misc02Contact> contacts) {
        this.contacts = contacts;
    }

    public Object shallowClone() throws CloneNotSupportedException {
        return super.clone();
    }


    public Object deepClone01() throws CloneNotSupportedException {
        Misc02Student misc02Student = (Misc02Student) super.clone();
        List<String> coursesCopy = new ArrayList<>();
        coursesCopy.addAll(this.courses);
        misc02Student.setCourses(coursesCopy);
        return misc02Student;
    }

    public Object deepClone02() throws CloneNotSupportedException {
        Misc02Student misc02Student = (Misc02Student) super.clone();
        List<String> coursesCopy = new ArrayList<>();
        coursesCopy.addAll(this.courses);
        misc02Student.setCourses(coursesCopy);

        List<Misc02Contact> contactsCopy = new ArrayList<>();
        this.contacts.stream().forEach(e -> {
            try {
                contactsCopy.add((Misc02Contact) e.clone());
            } catch (CloneNotSupportedException e1) {
                e1.printStackTrace();
            }
        });
        misc02Student.setContacts(contactsCopy);
        return misc02Student;
    }

    @Override
    public String toString() {
        return "Misc02Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", courses=" + courses +
                ", contacts=" + contacts +
                '}';
    }
}
