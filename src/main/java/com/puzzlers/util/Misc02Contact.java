package com.puzzlers.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shubo on 8/21/2017.
 */
public class Misc02Contact implements Cloneable{
    private String name;
    private List<Misc02Address> misc02Addresses;

    public Misc02Contact(String name, List<Misc02Address> misc02Addresses) {
        this.name = name;
        this.misc02Addresses = misc02Addresses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Misc02Address> getMisc02Addresses() {
        return misc02Addresses;
    }

    public void setMisc02Addresses(List<Misc02Address> misc02Addresses) {
        this.misc02Addresses = misc02Addresses;
    }

    public Object clone() throws CloneNotSupportedException {
        Misc02Contact misc02Contact = (Misc02Contact) super.clone();
        List<Misc02Address> addressesCopy = new ArrayList<>();
        this.misc02Addresses.stream().forEach(e -> {
            try {
                addressesCopy.add((Misc02Address)e.clone());
            } catch (CloneNotSupportedException e1) {
                e1.printStackTrace();
            }
        });
        misc02Contact.setMisc02Addresses(addressesCopy);

        return misc02Contact;
    }

    @Override
    public String toString() {
        return "Misc02Contact{" +
                "name='" + name + '\'' +
                ", misc02Addresses=" + misc02Addresses +
                '}';
    }
}
