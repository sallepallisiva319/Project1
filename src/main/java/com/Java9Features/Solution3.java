package com.Java9Features;

public class Solution3 {
    public static void main(String[] args) {
        int a=3,b=4,c=6;
        if(a>=b && b>=c && a>=c){
            System.out.println(c+","+b+","+a);
        }else if(a<=b && b<=c && a<=c){
            System.out.println(a+","+b+","+c);
        }
    }
}
