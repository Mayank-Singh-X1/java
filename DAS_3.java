import java.util.*;
public class DAS_3 {
    public static void main(String[] args) {
        //arrays
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter index "+(i+1)+" number: ");
            arr[i]=sc.nextInt();
        }

        System.out.println("enter the number you want to search: ");
        int key=sc.nextInt();
      
       
        for(int i=0;i<arr.length;i++){
        if(key==arr[i]){
            System.out.println("found at index : "+arr[i]);
        }
        }
        sc.close();
    }
}
