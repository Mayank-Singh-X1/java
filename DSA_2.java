import java.util.*;
public class DSA_2 {

public static int printMyName(int a){
    int fact=1;
    for(int i=a;i>=1;i--){
        fact=fact*i;
    }
    return fact;
}

public static void main(String [] args){
Scanner sc=new Scanner (System.in);

int x=sc.nextInt();
int y=sc.nextInt();

System.out.println( printMyName(x));

sc.close();

}
}
