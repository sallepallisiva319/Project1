package com.Java9Features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Tira2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Truck[] t = new Truck[n];
        for(int i=0;i<t.length;i++){
            int j=s.nextInt();
            s.nextLine();
            String k=s.nextLine();
            int l=s.nextInt();
            s.nextLine();
            int m=s.nextInt();
            t[i]=new Truck(j,k,l,m);
        }
        int o=s.nextInt();
        int p=s.nextInt();
        s.nextLine();
        String q=s.nextLine();
        int count = getCount(t, o, p);
        if(count>0){
            System.out.println(count);
        }else {
            System.out.println("No Truck Found");
        }
        Truck truck = getTruck(t, q);
        if(truck!=null){
            System.out.println(truck.id+"\n"+truck.getOwnerName()+"\n"+truck.getCapacity()+"\n"+truck.getRate());
        }else {
            System.out.println("No Truck Found");
        }
    }
    public static int getCount(Truck[]t,int m,int n){
        int c=0;
        for(int i=0;i<t.length;i++){
            if(t[i].getCapacity()>=m && t[i].getRate()<=n){
                c++;
            }
        }return c;
    }
    public static Truck getTruck(Truck[]t,String s){
        Truck[]t1=new Truck[0];
        for (int i=0;i<t.length;i++){
            if(t[i].getOwnerName().equalsIgnoreCase(s)){
                t1= Arrays.copyOf(t1,t1.length+1);
                t1[t1.length-1]=t[i];
            }
        }Arrays.sort(t1, Comparator.comparingInt(Truck::getCapacity));
        if(t1.length>0) return t1[1];
        else return null;
    }
}
class Truck{
    int id;
    String ownerName;
    int capacity;
    int rate;

    public Truck(int id, String ownerName, int capacity, int rate) {
        this.id = id;
        this.ownerName = ownerName;
        this.capacity = capacity;
        this.rate = rate;
    }

    public int getId() {
        return id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRate() {
        return rate;
    }
}
//Sample Input 1
//        5
//        101
//        Ron
//        2
//        1500
//        102
//        Preetha
//        4
//        2000
//        103
//        Ron
//        3
//        3000
//        104
//        Alex
//        3
//        2000
//        105
//        Ron
//        5
//        4000
//        3
//        2000
//        Ron

// Sample Output1
//        2
//        103
//        Ron
//        3
//        3000

//Sample Input2
//        4
//        501
//        Alex
//        4
//        2000
//        502
//        Meera
//        6
//        3500
//        503
//        Prasanth
//        5
//        2500
//        504
//        Saurabh
//        3
//        2000
//        5
//        2000
//        Ron
// Sample Output2
//        No Truck Found
//        No Truck Found