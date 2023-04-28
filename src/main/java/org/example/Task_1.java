package org.example;

import java.util.function.Predicate;

public class Task_1 {
    public static void main(String[] args) {

    /*
    Напишите реализации функционального интерфейса Predicate, которые проверяют,
    является ли число положительным. Если число положительное, то предикат должен возвращать
    true, в противном случае — false.
    */

        //анонимный класс - метод

        Predicate<Integer> predicate_anon = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 0;
            }
        };
        System.out.println(predicate_anon.test(45));           //true
        System.out.println(predicate_anon.test(-45));          //false

        //лямбда - метод

        Predicate<Integer> predicate_lambda = i -> i > 0;

        System.out.println(predicate_lambda.test(9863));       //true
        System.out.println(predicate_lambda.test(-15));        //false
    }

}