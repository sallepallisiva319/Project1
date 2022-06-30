package com.Java9Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution1 {
    public static void main(String[] args) {
        String s="Quarterly Review is to track progress from the continuous feedback mechanism. It will\n" +
                "only track progress & act as a performance indicator.\n" +
                "This also provides an opportunity to focus on the areas of improvement & be on track to\n" +
                "attain the final goal for yearend performance review. 5 scale rating will be applicable only\n" +
                "during the final Annual Performance Review/Yearend Review";
        List<String> objects = new ArrayList<>(Arrays.asList(s.split("[,.;: ]")));
        Map<Character, List<String>> collect = objects.stream().map(String::toLowerCase).filter(s2->!s2.isEmpty()).collect(Collectors.groupingBy(s1 -> s1.charAt(0)));
        System.out.println(collect);
    }
}
