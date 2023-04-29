package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class Task_2 {
    /*
        Реализуйте метод, который принимает на вход список целых чисел,
        определяет в списке количество четных чисел и выводит их в консоль.
        Решите задание именно с применением Stream API.
    */
    static List<Integer> numbersList;

    public static void main(String[] args) {
        numbersList = new ArrayList<>();
        while (numbersList.size() < 25) {
            numbersList.add(new Random().nextInt(100));
        }
        // Предикат для нахождения чётных чисел.
        Predicate<Integer> getEvenNumbers = i -> i % 2 == 0;

        // Создание нового листа с чётными числами не изменияя первоначальный лист через Stram API.
        List<Integer> evenNumbersList = numbersList.stream().filter(getEvenNumbers).toList();

        System.out.println(numbersList);        /// Первоначальные лист.
        System.out.println(evenNumbersList);    /// Чётные числа первоначального листа.
    }

}
