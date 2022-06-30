package Java11Features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sample {
    public static void main(String[] args) {
        int n=10;
        int r1=11;
        int r2=9;
        int r3=8;
        int c=0;
        while (true){
            if (n>=r1&&n>=r2) break;
           else if(n>=r1){
                n=(n-r1);
                c++;
            }else if(n>=r2){
                n=(n-r2);
                c++;
            }
            n=n+r3;
        }
        System.out.println(c);
       Employee[]e={new Employee(1,2),new Employee(2,1)};
        List<Employee> max = Arrays.stream(e).sorted(Comparator.comparing(Employee::b)).collect(Collectors.toList());
        System.out.println(max);
    }

}
record  Employee(Integer a,Integer b){}

