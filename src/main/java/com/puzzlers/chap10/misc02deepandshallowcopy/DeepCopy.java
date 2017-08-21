package com.puzzlers.chap10.misc02deepandshallowcopy;

import com.puzzlers.util.Misc02Address;
import com.puzzlers.util.Misc02Contact;
import com.puzzlers.util.Misc02Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1. Deep copy of an object will have exact copy of all the fields of original object
 * just like shallow copy. But in additional, if original object has any references to
 * other objects as fields, then copy of those objects are also created by calling shallowClone()
 * method on them. That means shallowClone object and original object will be 100% disjoint.
 * They will be 100% independent of each other. Any changes made to shallowClone object will not be
 * reflected in original object or vice-versa.
 *
 * 2. To create a deep copy of an object, you have to override the shallowClone() method
 */
public class DeepCopy {

    private static final String[] courses = {"Math", "PE", "Biology"};
    private static final String[] newCourses = {"CS","Robotics"};

    public static void main(String[] args) throws CloneNotSupportedException {
        deepClone01();

        deepClone02();
    }

    // Only deep copy Student's List<String>
    private static void deepClone01() throws CloneNotSupportedException {
        System.out.println("deep clone 01");
        List<String> courseList = new ArrayList<>();
        Arrays.stream(courses).forEach(courseList::add);

        Misc02Student student1 = new Misc02Student(100, "John", courseList);
        Misc02Student student2 = (Misc02Student)student1.deepClone01();

        System.out.println("Student1: " + student1);
        System.out.println("Student2: " + student2);

        // Modify student1
        System.out.println("Modify student1=======================");
        Arrays.stream(newCourses).forEach(courseList::add);
        student1.setId(200);
        student1.setName("John II");
        student1.setCourses(courseList);

        System.out.println("Student1: " + student1);
        System.out.println("Student2: " + student2);
    }

    // Deep copy Student's List<String> and List<Contacts>
    private static void deepClone02() throws CloneNotSupportedException {
        System.out.println("deep clone 02");
        List<String> courseList = new ArrayList<>();
        Arrays.stream(courses).forEach(courseList::add);

        Misc02Address dadAddress = new Misc02Address("Main st","LA","CA");
        Misc02Address momAddress = new Misc02Address("Park ave","MIA","FL");
        List<Misc02Address> parentsAddress = new ArrayList<>();
        parentsAddress.add(dadAddress);
        parentsAddress.add(momAddress);


        Misc02Address friendAddress1 = new Misc02Address("1st","NYC", "NY");
        Misc02Address friendAddress2 = new Misc02Address("2st","Boston", "MA");
        List<Misc02Address> friendsAddress = new ArrayList<>();
        friendsAddress.add(friendAddress1);
        friendsAddress.add(friendAddress2);

        Misc02Contact parentsContact = new Misc02Contact("parents", parentsAddress);
        Misc02Contact friendsContact = new Misc02Contact("friends", friendsAddress);

        List<Misc02Contact> contacts = new ArrayList<>();
        contacts.add(parentsContact);
        contacts.add(friendsContact);



        Misc02Student student1 = new Misc02Student(100, "John", courseList,contacts);
        Misc02Student student2 = (Misc02Student)student1.deepClone02();

        System.out.println("Initial=================");
        System.out.println("Student1: " + student1);
        System.out.println("Student2: " + student2);

        // Modify student1
        Arrays.stream(newCourses).forEach(courseList::add);
        student1.setId(200);
        student1.setName("John II");
        student1.setCourses(courseList);
        student1.getContacts().get(0).getMisc02Addresses().get(0).setStreet("Set a new street");

        System.out.println("After modified student1=======================");
        System.out.println("Student1: " + student1);
        System.out.println("Student2: " + student2);
    }
}
