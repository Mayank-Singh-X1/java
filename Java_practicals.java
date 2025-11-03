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

    //palindrome
    // public static boolean palindrome(String str){
    //     int f=0;
    //     int l=str.length()-1;
    //     while(l>f){
    //     if(str.charAt(f)!=str.charAt(l)){
    //         return false;
    //     }else{
    //     f++;
    //     l--;
    //     }
    // }
    //     return true;
    // }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
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

        // String m="madam";
        // if(palindrome(m)){
        //     System.out.println("palindrome");
        // }else{
        //     System.out.println("not palindrome");
        // }

        //find roots of quadratic equation
        // Scanner sc = new Scanner (System.in);
        // System.out.println("Enter a,b and c values: ");
        // double a=sc.nextDouble();
        // double b=sc.nextDouble();
        // double c=sc.nextDouble();

        // double D=b*b-4*a*c;
        // if(D>0){
        //     double x1=(-b-Math.sqrt(D))/(2*a);
        //     double x2=(-b+Math.sqrt(D))/(2*a);
        //     System.out.printf("two roots %.2f and %.2f",x1,x2);
        // }else if(D==0){
        //     double x1=-b/(2*a);
        //     System.out.printf("one real root %.2f",x1);
        // }else{
        //     System.out.println("no real roots");
        // }

            
        // Scanner scanner = new Scanner(System.in); 
        // int n = scanner.nextInt(); 
        // scanner.nextLine(); 
        // String[] names = new String[n]; 
        // for (int i = 0; i < n; i++) { 
        // names[i] = scanner.nextLine(); 
        // } 
        // Arrays.sort(names);
        // for(String i : names){
        //     System.out.println(i);   
        // }


       
    }
}
