package org.example;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task_1 {

    /*
    Напишите метод public static void findMinMax, который будет находить в
    стриме минимальный и максимальный элементы в соответствии
    с порядком, заданным Comparator'ом.*/

    static List<Integer> numbersList;

    public static void main(String[] args) {

        numbersList = new ArrayList<>();
        while (numbersList.size() < 15) {
            numbersList.add(new Random().nextInt(100));
        }
        findMinMax(numbersList.stream(),
                (x, y) -> x.compareTo(y),
                (x, y) -> System.out.println(String.format("min: " + x + ", max: " + y)));
    }

    public static <T> void findMinMax(
            //  Данный метод принимает на вход 3 элемента:
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        List<T> objects = stream.sorted(order).collect(Collectors.toList());
        if (!objects.isEmpty()) {
            minMaxConsumer.accept(objects.get(0), objects.get(objects.size() - 1));
        } else {
            //Если стрим не содержит элементов:
            minMaxConsumer.accept(null, null);
        }
    }

}