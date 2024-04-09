package com.yh1_collection;

import java.util.Objects;

/**
 * ClassName:Person
 * Package:com.yh1_collection
 *
 * @Author 86183
 * @Create 2024/4/9 15:09
 */
public class Person {
    String name;

    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    /*@Override
    public int hashCode() {
        return Objects.hash(name, age);
    }*/
}
