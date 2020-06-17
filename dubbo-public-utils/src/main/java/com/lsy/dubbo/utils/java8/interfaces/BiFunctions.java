package com.lsy.dubbo.utils.java8.interfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * BiFunctions接收两个参数
 */
public class BiFunctions {

    public int compute(int a, int b, BiFunction<Integer, Integer, Integer> biFunction, Function<Integer, Integer> function) {
        return biFunction.andThen(function).apply(a, b);
    }

    public static void main(String[] args) {
        BiFunctions test = new BiFunctions();
        System.out.println(test.compute(2, 3, (v1, v2) -> v1 + v2, v2 -> v2 * v2));
    }
}
