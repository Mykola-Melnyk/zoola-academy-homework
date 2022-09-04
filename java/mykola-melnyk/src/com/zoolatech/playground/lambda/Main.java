package com.zoolatech.playground.lambda;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer, Integer> sqr = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer value) {
                return value * value;
            }
        };

        int count = 56;
        Function<Integer, Integer> sqr1 = value -> {
            System.out.println(count);
            return value * value;
        };

        test(sqr1);
    }

    public static void test(Function<Integer, Integer> function) {
        System.out.println(function.apply(4));
    }
}
