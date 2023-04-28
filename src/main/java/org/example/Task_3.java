package org.example;

import java.util.function.Function;

public class Task_3 {
    /*Реализуйте функциональный интерфейс Function, который принимает на вход вещественное
    число типа Double, а возвращает его округленный вариант типа Long.
    Реализуйте его в двух вариантах: через анонимный класс и через лямбду*/

    public static void main(String[] args) {

        // анонимный класс - метод:

        Function<Double,Long> rounding_anon = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return (Long)Math.round(aDouble) ;
            }
        };

        System.out.println(rounding_anon.apply(456.75));    //457
        System.out.println(rounding_anon.apply(100.500));   //101

        // лямбда - метод:
        Function<Double,Long> rounding_lambda = i -> (Long)Math.round(i);

        System.out.println(rounding_lambda.apply(4569.45)); //4569
        System.out.println(rounding_lambda.apply(59.05));   //59
    }
}
