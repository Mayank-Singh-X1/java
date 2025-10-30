import java.util.*;

public class Java_practicals {
    // 6
    // public static void fibRecursive(int a, int b,int n) {
    // if(n==0){
    // return;
    // }
    // int c= a+b;
    // System.out.println(c);
    // fibRecursive(b, c, n-1);
    // }

    // 7 print prime number upto n number provided by user
    // public static boolean isPrime(int num) {
    //     if (num < 2) {
    //         return false;
    //     }
    //     for (int i = 2; i <= Math.sqrt(num); i++) {
    //         if (num % i == 0) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 6
        // int n= 5;
        // System.out.println("1\n2");
        // fibRecursive(1, 1, n-2);

        // 7 print prime number upto n number provided by user
        // int n = 30;
        // for (int i = 2; i < n; i++) {
        //     if (isPrime(i)) {
        //         System.out.print(i + " ");
        //     }
        // }

        //8 multiply two matrices
        // System.out.println("Enter row and column for first matrix:");
        // int r1= sc.nextInt();
        // int c1= sc.nextInt();

        // System.out.println("Enter row and column for Second matrix:");
        // int r2= sc.nextInt();
        // int c2= sc.nextInt();

        // int a[][]=new int[r1][c1];
        // int b[][]=new int[r2][c2];
        // int res[][]=new int [r1][c2];
       
        // for(int i=0;i<r1;i++){
        //     for(int j=0;j<c1;j++){
        //         System.out.println("Enter value of "+i+j+" of matrix 1 : ");
        //         a[i][j]=sc.nextInt();
        //     }
        // }

        //  for(int i=0;i<r2;i++){
        //     for(int j=0;j<c2;j++){
        //         System.out.println("Enter value of "+i+j+" of matrix 2 : ");
        //         b[i][j]=sc.nextInt();
        //     }
        // }

        //  for(int i=0;i<r1;i++){
        //     for(int j=0;j<c2;j++){
        //         for(int k=0;k<c1;k++)
        //         res[i][j] +=a[i][k]*b[k][j];
        //     }
        // }

        // for(int i=0;i<r1;i++){
        //     for(int j=0;j<c2;j++){
        //         System.out.print(res[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        sc.close();
    }
}
