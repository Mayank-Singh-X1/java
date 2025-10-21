public class Recursion2 {

    // public static void towerOfHanoi(int n, String src, String helper, String dest) {
    //     if (n == 1) {
    //         System.out.println("move disk " + n + " from " + src + " to " + dest);
    //         return;
    //     }
    //     towerOfHanoi(n - 1, src, dest, helper);
    //     System.out.println("move disk " + n + " from " + src + " to " + dest);
    //     towerOfHanoi(n - 1, helper, src, dest);
    // }

    // public static void reverse(String str,int index){
    //     if(index ==0){
    //         System.out.print(str.charAt(index));
    //         return;
    //     }
    //     System.out.print(str.charAt(index));
    //     reverse(str, index-1);
    // }
    public static int first=-1;
    public static int last=-1;
    public static void findchar(String str,char key,int index){
        if(index==str.length()){
            System.out.println("First occurrence: " + first);
            System.out.println("Last occurrence: " + last);
            return;
        }
        char currentChar=str.charAt(index);
        if(currentChar==key){
            if(first==-1){
                first=index;
            }else{
                last=index;
            }
        }
        findchar(str, key, index + 1);  // Changed index++ to index + 1
    }

    public static void main(String[] args) {

        //Tower Of Hanoi
        // int n = 3;
        // towerOfHanoi(n, "S", "H", "D");

        //Print word in reverse
        // String a="leh reh lund keh";
        // reverse(a,a.length()-1);

        //Find first and last index of character
        String a="Sanat Clausahk";
        findchar(a, 'a', 0);
   
    }

}
