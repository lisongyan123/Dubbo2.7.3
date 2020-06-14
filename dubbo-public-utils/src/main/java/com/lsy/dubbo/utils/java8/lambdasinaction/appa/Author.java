package com.lsy.dubbo.utils.java8.lambdasinaction.appa;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Authors.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Author {

    String name();

}
