package com.Java9Features;

import java.util.Arrays;
import java.util.Comparator;

public class Solution2 {
    public static void main(String[] args) {
        Hotel[]h=new Hotel[4];
        h[0]=new Hotel(99,"RoyalHotel",5,6000,"Mumbai");
        h[1]=new Hotel(100,"EvergreenHotel",12,4755,"Delhi");
        h[2]=new Hotel(102,"OneHotel",7,4000,"Mumbai");
        h[3]=new Hotel(101,"HotelCosco",3,7500,"Mumbai");
      String s="Mumbai";
        Hotel hotel = get(h, s);
        if(hotel!=null)
        System.out.println(hotel);
        else System.out.println("No such hotel found");
        Hotel[] hotels = get1(h);
        if(hotels!=null) {
            for(Hotel h1:hotels)
            {
            System.out.println(h1.getId());}
        }else System.out.println("No such hotel found");

    }
    public static Hotel get(Hotel[] h,String s){
        Hotel[] h1=new Hotel[0];
        for (int i=0;i<4;i++){
            if(h[i].getCity().equalsIgnoreCase(s)) {
                h1 = Arrays.copyOf(h1, h1.length + 1);
                h1[h1.length-1]=h[i];
            }
        }
        Arrays.sort(h1, Comparator.comparing(Hotel::getAge));
        if(h1.length>0) return h1[h1.length-1];
        else return null;
    }
    public static Hotel[] get1(Hotel[] h){
        Arrays.sort(h,(h3,h4)->(h4.getTariff()-h3.getTariff()));
        Hotel[] h2=new Hotel[0];
        for(int i=0;i<4;i++){
            if(h[i].getTariff()%2==0) {
                h2=Arrays.copyOf(h2,h2.length+1);
                h2[h2.length-1]=h[i];

            }
        }if(h2.length>0) return h2;
        return null;
    }
}
class Hotel{
    int id;
    String name;
    int age;
    int tariff;
    String city;

    public Hotel(int id, String name, int age, int tariff, String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.tariff = tariff;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getTariff() {
        return tariff;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", tariff=" + tariff +
                ", city='" + city + '\'' +
                '}';
    }
}