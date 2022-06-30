import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Practice{
    public static void main(String[] args) {
        Map<String, List<Integer>> map = new HashMap<>();
        map.put("Even",List.of(2,4,6,8,10));
        map.put("Odd",List.of(1,3,5,7,9));
        List<Integer> i=List.of(1,2,3,4,5,6,7,8,9,10);
        Map<String, List<Integer>> collect = i.stream().collect(Collectors.groupingBy(i1 -> i1 % 2 == 0 ? "Even" : "Odd"));
      //  System.out.println(map.equals(collect));

        String s="This document contains confidential and proprietary data and unauthorized use and disclosure of\n" +
                " such information mayresult in damage or considerable loss to Altimetrik. The term Confidential\n" +
                " Information denotes any and alltechnical andbusiness information disclosed in any manner or form\n" +
                " including, but not limited to, business strategies, methodologies, trade secrets, pricing, software\n" +
                " programs, and relationships with third parties, client lists and related information, information\n" +
                " pertaining to vendors, employees and affiliates.";
        List<String> split = List.of(s.split("[,.:;' ]"));
        Map<Character, List<String>> collect1 = split.stream().map(String::toLowerCase).filter(s1 -> !s1.trim().isEmpty()).collect(Collectors.groupingBy(s2 -> s2.charAt(0)));
        System.out.println(collect1);
    }
}