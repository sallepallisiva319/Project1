package com.Java10Featuers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UnmoodifiableListEx {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        List<Integer> collect = l.stream().filter(i -> i % 3 == 0).collect(Collectors.toList());
        collect.add(8);
        System.out.println(collect);
        List<Integer> collect1 = l.stream().filter(i -> i % 3 == 0).collect(Collectors.toUnmodifiableList());
        collect1.add(10); //throws UnsupportedOperationException because the fillering list is UnmodifiableList
        System.out.println(collect1);
        l.stream().collect(Collectors.summarizingInt(l1->l1));
    }
}
