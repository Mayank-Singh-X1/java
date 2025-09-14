import java.util.*;
public class DSA {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number of values: ");
        int n=sc.nextInt();
        System.out.print("enter the number of columns: ");
        int m=sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if( i==0 || i==n || j==0 || j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
