package Java11Features;

import java.util.*;
import java.util.stream.Collectors;

public class StringAPIEx {
    public static void main(String[] args) {
        String s1=" ";
        System.out.println(s1.isBlank());// returns true the string have spaces with empty charecters
        String s2="I\nam\nthe\nWinner of the Session";
        System.out.println(s2);
        System.out.println(s2.lines().collect(Collectors.toList()));
        char c='\u2000';
        s2=c+s2;
        System.out.println(s2.trim());
       // System.out.println(s2.strip());
        System.out.println(s2.stripLeading());//this metod removes the the leading spaces
        //System.out.println(s2.stripTrailing());//this method removes spaces of ending of the string
        System.out.println("--".repeat(20));
       List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 9, 10));
       List<String> collect = integers.stream().map(s->s%2==0?"e"+s :"o"+s).collect(Collectors.toCollection(ArrayList::new));
       System.out.println(collect);
    }
}
