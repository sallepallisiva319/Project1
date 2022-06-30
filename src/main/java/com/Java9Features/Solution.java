package com.Java9Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        List<Arena> l=new ArrayList<>();
        l.add(new Arena(1,"siva",10,3,"xxx"));
        l.add(new Arena(2,"vasi",15,2,"fff"));
        l.add(new Arena(3,"varun",16,5,"yyy"));
        String s="YYYY";
        Arena arena = get(l, s);
        if(arena!=null) {
            System.out.println(arena.getId() + "\n" + arena.getRating());
        }else {
            System.out.println("hi");
        }
    }
    public static Arena get(List<Arena> a,String p){
        Collections.sort(a, Comparator.comparingInt(Arena::getRating));
        List<Arena> arenaStream = a.stream().filter(i -> i.getType().equalsIgnoreCase(p)).collect(Collectors.toList());
        for(Arena a1:arenaStream){
            return a1;
        }
        return null;

    }
}

class Arena{
    int id;
    String name;
    int capacity;
    int rating;
    String type;

    public Arena(int id, String name, int capacity, int rating, String type) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.rating = rating;
        this.type = type;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public int getCapacity() {
        return capacity;
    }



    public int getRating() {
        return rating;
    }



    public String getType() {
        return type;
    }

}