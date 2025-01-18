import java.util.Scanner;
import java.util.Random;

    public class game {
      public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        Random r =new Random();


        while(true){
          
        System.out.println("Choose your move ( rock, paper,scissor ) :");
        String usermove=sc.nextLine();


        
              String moves[]={"rock","paper","scissor"};
              String compmove=moves[r.nextInt(moves.length)];
              System.out.println("Computer move : "+compmove);
          
              if(usermove.equals(compmove)){
                System.out.println("Its a tie,");
              }
              else if((usermove.equals("rock" )  &&  compmove.equals("scissor")) || 
                      (usermove.equals("paper" )  &&  compmove.equals("rock")) ||
                      (usermove.equals("scissor" )  &&  compmove.equals("paper"))    
              ){
                System.out.println("7 crore, computer ki mkc");
              }
              else{
                System.out.println(" computer se haar gaya");
              }
              System.out.println("Do you want to play again? Type 'yes' or 'no' ");
              String playAgain = sc.nextLine();
              if (!playAgain.equalsIgnoreCase("yes"))
              {
                  break;
              }
        
        }
        
    sc.close();
    }
 }