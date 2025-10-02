public class Recursion {
    //SUM using recursions
    // public static void printnum(int i,int n,int sum){
    //     if (n==i){
    //         sum+=i;
    //         System.out.println(sum);
    //         return;
    //     }else{
    //         sum+=i;
    //         printnum(i+1,n,sum);
    //     }
    // }

    //factorial
    //   public static int factorial(int n) {
    //     if (n == 0 || n == 1) {
    //         return 1;
    //     }
    //     return n * factorial(n - 1);
    // }

    //Fibonacci
    // public static void fibonaaci(int a, int b, int n){
    //     if(n==0){
    //         return ;
    //     }
    //     int c=a+b;
    //     System.out.println(c);
    //     fibonaaci(b, c, n-1);
    // } 

    public static void main(String[] args) {
      int a=0;
      int b=1;
      int n=10;
      fibonaaci(a,b,n-2);
    }
    
}








