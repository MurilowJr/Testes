package main.Entity;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private int id;
    private String name;
    private int age;
    private List<Email> emails;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.emails = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void addEmail(Email email) {
        emails.add(email);
    }
}
