package com.lsy.dubbo.utils.java8.lambdasinaction.appa;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Authors {

    Author[] value();

}
