package com.Java9Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Solution5 {
    public static void main(String[] args) {
        String s="ma";

//      String s1=s.charAt(0)+"";
//         s1 = s1.toUpperCase();
//
//        String replace = s.replace(s.charAt(0) + "", s1);
//        System.out.println(replace);

        System.out.println(s.substring(0,1).toUpperCase()+s.substring(1,s.length()));


       List<String> l=new ArrayList<>(Arrays.asList("ms","va","dd"));
        List<String> collect = l.stream().map(s3 -> s3.substring(0, 1).toUpperCase() + s.substring(1, s3.length())).collect(Collectors.toList());
        System.out.println(collect);
    }
}
