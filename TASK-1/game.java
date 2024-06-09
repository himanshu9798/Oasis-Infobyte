package oasis;
import java.util.*;

public class game {
  public static void main(String[] args) {
      System.out.println("****************************************************");
    System.out.println("      **---Welcome to number Guessing Game---**   ");
    System.out.println("****************************************************");
    Scanner sc=new Scanner(System.in); 
    int myNumber =(int)(Math.random()*100);
    int userNumber=0;
    do{
      System.out.println("       guess any number(1-100)    ");
       userNumber =sc.nextInt();
      if (userNumber == myNumber){
        System.out.println("WOOHOO..Correct Number!!! you Win!");
        System.out.println("Congrates!!! you Win!");
        break;
      } else if (userNumber >myNumber){
         System.out.println("your number is too large");
      } else{
        System.out.println("your number is too small");
      }
//if user want to exit the number they can input negative number//
    }while(userNumber >= 0);
    System.out.print("My number Was: ");
    System.out.println(myNumber);
    
  }
    
}

  