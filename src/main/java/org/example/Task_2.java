package org.example;

import java.util.function.Consumer;

public class Task_2 {
    public static void main(String[] args) {

    /*
    Создайте функциональный интерфейс Consumer, который принимает на
    вход имя человека и выводит в консоль приветствие в его адрес
   */
        // анонимный класс - метод:

        Consumer<String> greet_anon = new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println("Hello, " + name + ", nice to meet you.");
            }
        };
        greet_anon.accept("Billy");

        // лямбда - метод:

        Consumer<String> greet_lambda = name -> System.out.println("Hello, " + name + ", nice to meet you.");
        greet_lambda.accept("Jimmy");

    }
}