package com.Java9Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TryWithResourceEx {
    public static void main(String[] args) {
        Employee[] e=new Employee[2];
        e[0]=new Employee(1,"siva");
        e[1]=new Employee(0,"kumar");
       Arrays.stream(e).sorted(Comparator.comparing(Employee::getId)).forEach(System.out::println);

//        int []a={2,1,3};
//        Arrays.stream(a).sorted();
//        System.out.println(a);
        MyWorker myWorker = new MyWorker();
        try(myWorker) {
            myWorker.doSomething();
        } catch (Exception e1) {
            e1.printStackTrace();
        }

    }
}
class MyWorker implements AutoCloseable{
   MyWorker(){
       System.out.println("Resource Created");
   }
    public void doSomething(){
        System.out.println("Doing Something");
    }
    @Override
    public void close() throws Exception {
        System.out.println("Resource closed");
    }
}
class Employee{
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
