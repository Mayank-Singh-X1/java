import java.util.Scanner;//5sub
public class marks{
  public static void main(String[] args){
Scanner s=new Scanner(System.in);
s.close();                                              //yellow line eproblem solution
System.out.println("Enter the sub1 marks; ");
int a = s.nextInt();
System.out.println("Enter the sub2 marks; ");
int b = s.nextInt();
System.out.println("Enter the sub3 marks; ");
int c = s.nextInt();
System.out.println("Enter the sub4 marks; ");
int d = s.nextInt();
System.out.println("Enter the sub5 marks; ");
int e = s.nextInt();
if(a<=100 && b<=100 && c<=100 && d<=100 && e<=100 )
{
float total=a+b+c+d+e;
float per=total/500*100;
System.out.println("Your total is "+total+" and precentage is "+per);
}
else{
  System.out.println("100 k eupar mt daal,5 laude");
}
}
}