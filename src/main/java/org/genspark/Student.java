package org.genspark;

import java.util.List;

@SuppressWarnings({"unused", "FieldCanBeLocal"})
public class Student {
    private int id;
    private String name;
    private List<Phone> ph;
    private Address add;

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ph=" + ph +
                ", add=" + add +
                '}';
    }
}
