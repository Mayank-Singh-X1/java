public class Arrrayset {
  public static void main(String[] args) {

//Addition of array elements

    // float a[] = {32, 45.4f, 84.2f, 100.50f, 100.50f};
    // float sum = 0; // Variable to hold the sum
    // for (int i = 0; i < a.length; i++) {    
    //     sum =sum + a[i]; // Add each element to sum
    // }
    // System.out.println("Sum of all numbers: " + sum); // Print the sum

//to check whether number is present in array or not

    // float a[] = {32, 45.4f, 84.2f, 100.50f, 100.50f};
    // boolean b=false;
    // float c=32;
    //   for (int i = 0; i < a.length; i++) {
    //     if(a[i]==c){
    //     b=true;
    //     break;
    //     }}
    //     if(b==true){
    //       System.out.println("Number is present in array");
    //     }
    //     else{
    //       System.out.println("Number is not present in array");
    //     }

//Average of array elements

    // float a[] = {50, 100.4f, 50.2f, 100.50f, 50.50f};
    // float sum = 0;
    // for (int i = 0; i < a.length; i++) {    
    //     sum =sum + a[i];
    // }
    // System.out.println("Sum of all numbers: " + sum/a.length);
          
//Addition of two matrix

    //     int a[][] = {{14,2},{4,5}};
    //     int b[][] = {{7,8},{10,11}};
    //     int sum[][]={{0,0},{0,0}};
    //     int i,j;
    //     for(i=0;i<a.length;i++){
    //       for( j=0;j<b.length;j++){
    //         sum[i][j]=a[i][j]+b[i][j];
    //       }}
    //     for( i=0;i<a.length;i++){
    //       for( j=0;j<b.length;j++){
    //         System.out.print(sum[i][j]+" ");
    //       }
    //       System.out.println();
    //     }

//reverse an array

    //   int[] array = {1, 2, 3, 4, 5}; // Example array
    //   int n = array.length;
    
    //   // Reverse the array
    // for (int i = 0; i < n / 2; i++) {
    // int temp = array[i];
    // array[i] = array[n - i - 1];
    // array[n - i - 1] = temp;
    // }
    
    // // Print the reversed array
    // System.out.print("Reversed array: ");
    // for (int i : array) {
    // System.out.print(i + " ");
    // }
  
//Smart way to print array

    // int a[]={2,4,6,8,4,6,9};
    // for(int i:a){
    //   System.out.print(i+" ");
    // }

//maximum & minimum value of an array   

    // int a[]={37,5,87,85,25,53};
    // int max=0;
    // int min=a[0]; // 0 not valid because it will become smallest value resulting uotput "0"
    // for(int i:a){
    //   if(i>max)
    //   max=i;
    //   if(i<min)
    //   min=i;
    //   }
    //   System.out.println("Maximum value is: "+max);
    //   System.out.println("Minimum value is: "+min);

//is array is in assecding order

    int a[]={3,4,43,142,434};
    boolean b=true;
    for (int i=0;i<a.length-1;i++){
      if(a[i]>a[i+1]){
        b=false;
        break;
      }}

      if(b){
        System.out.println("Array is in assecding order");
      }
      else{
        System.out.println("Array is not in assecding order");
      } 
    
  }}

