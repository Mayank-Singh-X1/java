public class Recursion2 {
    // public static void towerOfHanoi(int n, String src, String helper, String
    // dest) {
    // if (n == 1) {
    // System.out.println("move disk " + n + " from " + src + " to " + dest);
    // return;
    // }
    // towerOfHanoi(n - 1, src, dest, helper);
    // System.out.println("move disk " + n + " from " + src + " to " + dest);
    // towerOfHanoi(n - 1, helper, src, dest);
    // }

    // public static void reverse(String str,int index){
    // if(index ==0){
    // System.out.print(str.charAt(index));
    // return;
    // }
    // System.out.print(str.charAt(index));
    // reverse(str, index-1);
    // }

    // find first and last occurrence of character
    // public static int first=-1;
    // public static int last=-1;
    // public static void findchar(String str,char key,int index){
    // if(index==str.length()){
    // System.out.println("First occurrence: " + first);
    // System.out.println("Last occurrence: " + last);
    // return;
    // }
    // char currentChar=str.charAt(index);
    // if(currentChar==key){
    // if(first==-1){
    // first=index;
    // }else{
    // last=index;
    // }
    // }
    // findchar(str, key, index + 1); // Changed index++ to index + 1
    // }

    // check whether array is strictly increasing or not
    // public static boolean Strictinc(int[] arr, int index){
    // if(index == arr.length-1){
    // return true;
    // }
    // if(arr[index] < arr[index+1]){
    // return Strictinc(arr, index+1);
    // }else{
    // return false;
    // }
    // }

    // Move a given cahracter to end of string
    public static void moveallX(String str, int idx, int count, String newstr) {
        if (idx == str.length()) {
            for (int i = 0; i <= count; i++) {
                newstr += 'x';
            }
            System.out.println(newstr);
            return;
        }

        char currentChar = str.charAt(idx);
        if (currentChar == 'x') {
            count++;
            moveallX(str, idx + 1, count, newstr);
        } else {
            newstr += currentChar;
            moveallX(str, idx + 1, count, newstr);
        }
    }

    public static void main(String[] args) {

        // Tower Of Hanoi
        // int n = 3;
        // towerOfHanoi(n, "S", "H", "D");

        // Print word in reverse
        // String a="leh reh lund keh";
        // reverse(a,a.length()-1);

        // Find first and last index of character
        // String a="Sanat Clausahk";
        // findchar(a, 'a', 0);

        // check whether array is strictly increasing or not
        // int arr[]={1,2,3,4,5};
        // boolean isStrictlyIncreasing = Strictinc(arr, 0);
        // System.out.println("Is array strictly increasing? " + isStrictlyIncreasing);

        // Move a given cahracter to end of string
        String str = "axbxxcd";
        moveallX(str, 0, 0, "");
    }

}
