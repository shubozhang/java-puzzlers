package com.guava.util;

public class BA extends Employee{

    private int id;
    private String fullName;

    public BA(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "BA{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
