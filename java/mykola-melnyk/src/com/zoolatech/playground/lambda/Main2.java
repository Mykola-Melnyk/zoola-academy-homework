package com.zoolatech.playground.lambda;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main2 {
    public static void main(String[] args) {
        String str = "Hello";

        Function<String, String> objectConcatFunction = str::concat;
        System.out.println(objectConcatFunction.apply(" world!"));

        Function<String, String> decompileObjectConcatFunction = x -> str.concat(x);

        BiFunction<String, String, String> classConcatFunction = String::concat;
        BiFunction<String, String, String> decompiledClassConcatFunction = (x, y) -> x.concat(y);
        System.out.println(decompiledClassConcatFunction.apply("Hello", " world!"));

        Function<Double, Double> staticFunction = Math::sqrt;
        Function<Double, Double> decompiledStaticFunction = x -> Math.sqrt(x);
        System.out.println(staticFunction.apply(4d));

        Runnable aNew = Object::new;
        Supplier aNewSupplier = Object::new;
        System.out.println(aNewSupplier.get());
        aNew.run();

        Consumer consumer = System.out::println;
        consumer.accept("Hello!");
        Consumer consumer1 = (x) -> System.out.println(x);



    }
}
