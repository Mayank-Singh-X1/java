import java.util.*;
public class DSA_2 {

    public static void  returnCount(int x){
       int p=0,n=0,z=0;
        if(x<0){     
           n++; 
        }else if(x>0){          
            p++;
        }else{         
            z++;
        }
        System.out.println("pos:"+p+" neg:"+n+" zero:"+z);
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        
        boolean Action= true;
        int x;
        
        while(Action){
            
            System.out.println("Enter number or type \"quit\" to exit: ");
            x=sc.nextInt();
            if(x=="quit"){
                break;
            }
           returnCount(x); 
        }


    }
}

