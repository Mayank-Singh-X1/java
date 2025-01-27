public class Method {

  // static void telljoke(int arr[]){
  // arr[2]=34;  
  // }

  // static void overloading (){
  //   System.out.println("good morning broh!!");
  // }

  // static void overloading(int a){
  //   System.out.println("good morning " +a +" broh!!");
  // }

  static int sum(int ...arr){
    int result=0;
    for(int a:arr){
      result+=a;
    }
    return result;

  }




  public static void main(String[] args){

      // int dgye[]={2,4,6,34,04};
      //  telljoke(dgye);
      //  System.out.println(dgye[2]);

  //methods overloading
      // overloading();
      // overloading(1000);

      System.out.println("The sum of 4,76, 5 is: "+sum(4,76,5));


  }
}
