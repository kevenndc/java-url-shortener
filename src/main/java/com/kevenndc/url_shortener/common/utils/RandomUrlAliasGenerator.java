package com.kevenndc.url_shortener.common.utils;

import java.util.Random;

public class RandomUrlAliasGenerator {

    private static final String ALPHANUMERIC = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final Random RANDOM = new Random();

    public static String generate() {
        return RANDOM.ints(5, 0, ALPHANUMERIC.length())
                .mapToObj(ALPHANUMERIC::charAt)
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }

}
