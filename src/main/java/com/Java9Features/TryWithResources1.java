package com.Java9Features;

public class TryWithResources1 {
    public static void main(String[] args) {
        M1 m = new M1();
       try(m) {
           m.m1();
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
class M1 implements AutoCloseable{
    public M1(){
        System.out.println("Hello World");
    }
    @Override
    public void close() throws Exception {
        System.out.println("Connection Closed");
    }
    public void m1(){
        System.out.println("m1 method completed");
    }
}