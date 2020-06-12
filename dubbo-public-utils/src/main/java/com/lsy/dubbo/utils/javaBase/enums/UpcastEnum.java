package com.lsy.dubbo.utils.javaBase.enums;

import java.util.Arrays;

public class UpcastEnum {

    enum Search { HITHER,YON}

    public static void main(String[] args) {
        /**
         * HITHER
         * YON
         */
        Search[] vals = Search.values();
        Enum e = Search.HITHER;
        Arrays.stream(e.getClass().getEnumConstants()).forEach(System.out::println);
    }
}
