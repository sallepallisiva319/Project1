package com.Java9Features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class TcIra3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Company[]c=new Company[4];
        for(int i=0;i<c.length;i++){
            int j=s.nextInt();
            s.nextLine();
            String s1=s.nextLine();
            int k=s.nextInt();
            s.nextLine();
            double d=s.nextDouble();
            c[i]=new Company(j,s1,k,d);
        }
        double d1=s.nextDouble();
        int k1=s.nextInt();
        int count = getCount(c, d1);
        if(count>0){
            System.out.println(count);
        }else {
            System.out.println("no such company found");
        }
        Company search = search(c, k1);
        if(search!=null){
            System.out.println(search.getName()+"\n"+search.getAnnualTurnOver());
        }else {
            System.out.println("no such company found");
        }
    }
    public static int getCount(Company[]c,double d1){
        int c1=0;
        for (int i=0;i<c.length;i++){
            if(c[i].getAnnualTurnOver()>d1){
               c1+=c[i].getCount();
            }
        }if(c1>0) return c1;
        else return 0;
    }
    public static Company search(Company[]c,int j){
        Company[]c1=new Company[0];
        for(int i=0;i<c.length;i++){
            if(c[i].getCount()>j){
               c1= Arrays.copyOf(c1,c1.length+1);
                c1[c1.length-1]=c[i];
            }
        }double[]d=new double[0];
        for(int k=0;k<c1.length;k++){
            d = Arrays.copyOf(d, d.length + 1);
            d[d.length-1]=d[k];
        }
        Arrays.sort(d);
        for(int m=0;m<c1.length;m++){
            if(c1[m].getAnnualTurnOver()==d[d.length-2]){
                return c[m];
            }
        }return null;
        //Arrays.sort(c1, Comparator.comparingDouble(Company::getAnnualTurnOver));
//        if(c1.length>0) return c1[c1.length-2];
//        else return null;
    }
}

class Company{
    int id;
    String name;
    int count;
    double annualTurnOver;

    public Company(int id, String name, int count, double annualTurnOver) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.annualTurnOver = annualTurnOver;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public double getAnnualTurnOver() {
        return annualTurnOver;
    }
}