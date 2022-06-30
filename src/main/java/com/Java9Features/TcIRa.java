package com.Java9Features;

import java.util.Arrays;
import java.util.Comparator;

public class TcIRa {
    public static void main(String[] args) {
        Theatre[] t=new Theatre[4];
        t[0]=new Theatre(1,"hi",4,300,"Movie");
        t[1]=new Theatre(2,"hi1",3,400,"Movie");
        t[2]=new Theatre(3,"hi2",2,500,"Sangeeth");
        t[3]=new Theatre(4,"hi3",5,600,"MagicShow");
        String s="drama";
        Theatre theatre = get(t, s);
        if(theatre==null) {
            System.out.println("No such Theatre");
        }else{
            System.out.println(theatre.name()+"\n"+theatre.capacity());
        }
    }
    public static Theatre get(Theatre[]t,String s){
        Theatre[]t1=new Theatre[0];
        for(int i=0;i<t.length;i++) {
            if (t[i].type().equalsIgnoreCase(s)) {
                t1 = Arrays.copyOf(t1, t1.length + 1);
                t1[t1.length - 1] = t[i];
            }
        }
        Arrays.sort(t1, Comparator.comparing(Theatre::rating));
        if(t1.length==1) return t[0];
        else if(t1.length>1) return t[1];
        else return null;

    }
}
record Theatre(int no,String name,int rating,int capacity,String type){}