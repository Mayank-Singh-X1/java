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
    int a[][] = {{14,2},{4,5}};
    int b[][] = {{7,8},{10,11}};
    int sum[][]={{0,0},{0,0}};
    int i,j;
    for(i=0;i<a.length;i++){
      for( j=0;j<b.length;j++){
        sum[i][j]=a[i][j]+b[i][j];
}}


    for( i=0;i<a.length;i++){
      for( j=0;j<b.length;j++){
        System.out.print(sum[i][j]+" ");
      }
      System.out.println();
    }
  }}

