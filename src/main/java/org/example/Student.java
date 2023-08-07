package org.example;

import java.util.Objects;

public class Student {
/*
    Напишите методы Equals and HashCode для класса
    Student, который состоит из полей String name и int age.
*/

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o){
        if (this == o)return true;
        if (o == null || this.getClass() != o.getClass())return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name,student.name);
    }

    @Override
    public int hashCode(){
        int result = age + name.hashCode();
        return result;
    }
}
