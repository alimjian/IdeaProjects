package com.seleniummaster.datastruacter;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {
    public static <set> void main(String[] args) {

        Map<String,String> websites=new HashMap<>();
        websites.put("Google","https://www.google.com");
        websites.put("Yahoo","https://www.yahoo.com");
        websites.put("Youtube","https://www.youtube.com");
        websites.put("CNN","https://www.cnn.com");
        System.out.println("total items"+websites.size());
        System.out.println(websites.get("CNN"));



        Set<String>sites=websites.keySet();

        for (String site:sites){
            System.out.println(String.format("site %s     url%s",site,websites.get(site)));
        }

        websites.replace("CNN","https://www.cnn.com","https://www.CNN.com");
        System.out.println(websites.get("CNN"));

        websites.put("cnn","https://cnn.com");
        System.out.println(websites.get("cnn"));

        websites.remove("cnn");
        System.out.println(websites.get("cnn"));


        System.out.println(websites.containsKey("CNN"));
        System.out.println(websites.containsValue("hotmail.com"));







    }
}
