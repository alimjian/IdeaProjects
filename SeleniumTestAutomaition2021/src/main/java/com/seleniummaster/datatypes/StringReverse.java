package com.seleniummaster.datatypes;

import org.apache.commons.lang3.StringUtils;

public class StringReverse {

    public static void main(String[] args) {
        String school="United Coder SDET Coruse";
        String Language="java";
        String s1="100";

        System.out.println(StringUtils.reverse(Language));
        System.out.println(StringUtils.capitalize(Language));
        System.out.println(StringUtils.isNumeric(school)); 

        System.out.println(StringUtils.isEmpty(Language));

        System.out.println(StringUtils.reverseDelimited(school,' '));





















    }
}
