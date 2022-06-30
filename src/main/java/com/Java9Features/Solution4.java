package com.Java9Features;

public class Solution4 {
    public static void main(String[] args) {
        String s="ababcbacd";
        while (s.length()>0){
            char c = s.charAt(0);
            String replace = s.replace(c + "", "");
            int c1=s.length()-replace.length();
            System.out.print(c+"="+c1+",");
            s=s.replace(c+"","");
        }
        int[]a={1,2,3};

    }
}
