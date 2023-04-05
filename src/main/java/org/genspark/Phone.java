package org.genspark;

@SuppressWarnings({"unused", "FieldCanBeLocal"})
public class Phone {
    private final String mob;

    public Phone(String mob) {
        this.mob = mob;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "mob='" + mob + '\'' +
                '}';
    }
}
