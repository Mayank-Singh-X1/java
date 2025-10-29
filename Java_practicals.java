import java.util.*;

public class Java_practicals {

    public static void fibRecursive(int a, int b,int n) {
       if(n==0){
        return;
       }
       int c= a+b;
       System.out.println(c);
       fibRecursive(b, c, n-1);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= 5;
        System.out.println("1\n2");
        fibRecursive(1, 1, n-2);


        
        sc.close();

    }
}
