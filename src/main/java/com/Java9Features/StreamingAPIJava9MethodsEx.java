package com.Java9Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamingAPIJava9MethodsEx {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(10, 40, 42, 5, 18, 20));
        System.out.println(integers.stream().filter(i->i%5==0).collect(Collectors.toList()));
        System.out.println(integers.stream().takeWhile(i->i%5==0).collect(Collectors.toList()));
        System.out.println(integers.stream().dropWhile(i->i%5==0).collect(Collectors.toList()));
        System.out.println(integers.stream().flatMap(x-> Stream.ofNullable(x)).collect(Collectors.toList()));
        System.out.println(integers.stream().collect(Collectors.summarizingInt(x->x)).getMin());
        var n1=1;
        switch (n1){
            case 1-> System.out.println("hi");
            case 2-> System.out.println("hello");
            default -> System.out.println("not valid");
        }
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(get(n));
    }
    public static int get(int n){
        int c=0;
        for (int i=1;i<=n;i++){
            if(i<=n){
                n=n-i;
                c++;
            }
        }
        return c;
    }
}
