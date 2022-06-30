import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

record Employee(int a,int b){

}
public class Sample1 {
    public static void main(String[] args) throws Exception {
        var i=1;
        Employee employee = new Employee(1, 3);
        System.out.println(employee.a());
        String s= """
                name:siva
                name:asif
                """;
      //  System.out.println(s);
        int i1=1;
        switch (i1){
            case 1-> System.out.println("hi");
            case 2-> System.out.println("hello");
        }
//        String s1="";
//           FileReader f=new FileReader("D:\\Users\\sareddy\\Project1\\src\\main\\java\\Practice.java");
//        BufferedReader b=new BufferedReader(f);
//        String s2 = b.readLine();
//        Map<Character, List<String>> collect = null;
//        while (s2!=null){
//            List<String> split = List.of(s2.split("[;:,.'()<>{} ]"));
//            collect = split.stream().map(String::toLowerCase).filter(s4->!s4.trim().isEmpty()).collect(Collectors.groupingBy(s3 -> s3.charAt(0)));
//            s2=b.readLine();
//        }

    }

}
interface I1{
    private void m1(){}
}