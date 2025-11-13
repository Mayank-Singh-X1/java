public class dfds {
    // public static int fact(int n){
    //     if(n==0){
    //         return 1;
    //     }

    //     return n * fact(n-1);        
    // }

    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b );
    }
    public static void main(String[] args) {
        int n=24;
        int m=36;
        // System.out.println(fact(n));
        System.out.println(gcd(n, m));
        
    }
    
}
