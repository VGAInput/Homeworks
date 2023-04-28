package org.example;

import java.util.Random;
import java.util.function.Supplier;

public class Task_4 {

    public static void main(String[] args) {
/*        Напишите Supplier, который возвращает случайное число из диапазона от 0 до 100.
        Реализуйте его в двух вариантах: через анонимный класс и через лямбду.*/

        int range = 100;

        // анонимный класс - метод:

        Supplier<Integer> getRandom_anon = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return new Random().nextInt(range);
            }
        };
        System.out.println(getRandom_anon.get());

        // лямбда - метод:

        Supplier<Integer> getRandom_lambda =  () -> new Random().nextInt(range);
        System.out.println(getRandom_lambda.get()); // случайное число 0 - 100ж
    }
}
