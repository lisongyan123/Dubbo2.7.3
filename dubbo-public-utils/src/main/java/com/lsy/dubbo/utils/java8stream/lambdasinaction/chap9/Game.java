package com.lsy.dubbo.utils.java8stream.lambdasinaction.chap9;


import java.util.Arrays;
import java.util.List;

public class Game {

    public static void main(String...args){
        List<Resizable> resizableShapes =
                Arrays.asList(new Square(),
                        new Triangle(), new Ellipse());
        Utils.paint(resizableShapes);
    }
}

