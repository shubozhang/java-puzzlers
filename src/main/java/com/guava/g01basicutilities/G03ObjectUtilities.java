package com.guava.g01basicutilities;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.util.Date;

public class G03ObjectUtilities {

    public static void main(String[] args) {
        objectEquals();
        System.out.println(hash(100,"name",new Date()));
        new G03ObjectUtilities().testToString();
    }

    public static void objectEquals() {
        System.out.println(Objects.equal("a", "a"));
        System.out.println(Objects.equal(null, "a"));
        System.out.println(Objects.equal("a", null));
        System.out.println(Objects.equal(null, null));
    }

    public static int hash(int id, String name, Date date) {
        return Objects.hashCode(id,name,date);
    }

    public void testToString() {
        TestModel testModel = new TestModel(100,"name");
        System.out.println(MoreObjects.toStringHelper(testModel).add("x", 1).toString());
    }
    class TestModel {
        private int id;
        private String name;

        public TestModel(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }
}
