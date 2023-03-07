package newbie;
import java.util.Random;
import java.util.Scanner;


public class Guess {

  public static void main(String[] args) {
    Random Random1= new Random();
    int right=Random1.nextInt(100);
    int turns=0;
    Scanner scan=new Scanner(System.in);
    System.out.println("Guess a number between 1 to 100, You will have 10 turns!" );
    System.out.println("All the best!!!");
    
    int guess;
    int i=0;
    boolean win=false;
    while(win==false) {
      guess=scan.nextInt();
      turns++;
    
    if(guess==right) {
      win=true;
    }
    else if(i>10){
      System.out.println("You loose! the right answer was: "+right);
      return;
    }
    else if(guess<right){
      i++;
      System.out.println("Yor Guess is lower than the right guess! Remaining Turns: "+(10-i));
      
      
      
    }
    else if(guess>right) {
      i++;
      System.out.println("Your Guess Is Higher Than THe Right Guess! Remaining Turns: "+(10-i));
      
    }
    
    

  }
    System.out.println("YOu win!");
    System.out.println("Then number was "+right);
    System.out.println("You used "+turns+" turns to guess the right number");
    System.out.println("Your score is "+((11-turns)*10)+" out of 100");
    

}
}