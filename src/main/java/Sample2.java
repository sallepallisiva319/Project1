import java.util.Arrays;

public class Sample2 {
    public static void main(String[] args) {
        int[]a={2,1,6,7};
        int m=4;
        int s1=0;
        int c=0;
        int sum = 0;
        for(int i=0;i<a.length;i++){
            s1=m+a[i];
            sum=Arrays.stream(a).sum()-a[i];
            if(s1>sum){c++;}
        }
        if(c>0)System.out.println(c);
       else System.out.println(0);
    }
}
