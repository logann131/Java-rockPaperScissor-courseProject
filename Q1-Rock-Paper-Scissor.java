/* Nam Phu Nguyen (Logan)
   CS141 
   Programing Assignment
*/

import java.util.*;
class Q1{

   public static void main(String[] args){ 
   
      Random rand = new Random();  //declare object random
      Scanner console= new Scanner (System.in); //Scanner object
      System.out.print("Hello! Please type in an integer number (1) is Rock, 2) is Paper, 3) is Scissor): ");
      int num = console.nextInt(); //input from user
      
      int compNum = rand.nextInt(3)+1; // computer will choose a number randomly 
      System.out.println("The computer chose: " +compNum); 
      if (num==1){ // declare the result they choice in word
         
         System.out.println("You chose Rock!");
         
      } else if (num == 2) {
      
         System.out.println("You chose Paper!");

      
      } else {
      
         System.out.println("You chose Scissor");
      
      } 
      if (compNum==1){ // declare computer choice in word
         
         System.out.println("Computer chose Rock!");
         
      } else if (compNum == 2) {
      
         System.out.println("Computer chose Paper!");

      
      } else {
      
         System.out.println("Computer chose Scissor");
      
      }
      
      if (num == compNum){  //comparison between user and computer
         
         System.out.println("You are tie!");
      
      
      } else if (num==1 && compNum==2) { // user Rock! Comp paper
      
         System.out.println("You lose!");

      
      } else if (num==1 && compNum==3) {// user Rock! Comp Scissor
      
         System.out.println("You win!");
      
      
      } else if (num==2 && compNum==1) { // user Paper! Comp Rock
      
         System.out.println("You win!");
      
      
      } else if (num==2 && compNum==3) { // user Paper! Comp Scissor
      
         System.out.println("You lose!");
      
      
      }else if (num==3 && compNum==2) { // user Scissor! Comp paper
      
         System.out.println("You win!");
      
      }  else if (num==3 && compNum==1) { // user Scissor! Comp Paper
      
         System.out.println("You lose!");
      
      }
      
      
}
      
   



}
