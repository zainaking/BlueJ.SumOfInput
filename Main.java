/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {
     

   

    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     System.out.println(" write number");
    
      int input= scanner.nextInt();
      int sum=0;
    
     
     for(int count=0; count<=input; count++){
         sum = sum + count;
        }
 
      
     
     
      System.out.println(sum+1);
      
      
      
        
        

    }
}
