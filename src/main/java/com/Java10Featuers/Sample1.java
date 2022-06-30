package com.Java10Featuers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

public class Sample1 {
    public static void main(String[] args) {
        var map=new HashMap<String,List<Integer>>();
        for(var map1:map.entrySet()){//Map.Entry<K,V> int var place
            var value = map1.getValue();
        }
        //var won't works in Lambda Expressions
         Consumer<Integer> n= i -> System.out.println(i);
        n.accept(2);

       // var n1=null; //Cannot infer type: variable initializer is 'null'

        var k=new ArrayList<>();//we declare var for any collection.we must provide type of list in right side of the list.other wise it will add all types
        k.add(1);
        k.add("siva");
        System.out.println(k);
    }
}
