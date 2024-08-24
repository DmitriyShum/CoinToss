/*
* Author: Dmitriy S
* Date: 8/23/24
*
* CoinToss is for public use and shall not be sold by any individual nor organization, this is open source, and will stay as such. Just have fun placing bets.
* This is simply to only place bets for fun, and shall not be used in the form of gambling or making any serious or financial decisions.
* Since this is an open source project, you are free to reuse parts of this code in other projects.
*/

import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class CoinToss{
    public static boolean placeBet;

   public static void main(String[] args){
// Assigning variables or so called definitions and default values.
   Scanner keyboard = new Scanner(System.in);
   Random random = new Random();
   String[] coin = new String[] 
   {"Heads", 
   "Tails"};
   placeBet = false;
   String bet = "";
   int randSide = random.nextInt(coin.length);
   
      //input
      try{
      System.out.println("Would you like to place a bet? true/false : ");
      placeBet = keyboard.nextBoolean();
      }catch(InputMismatchException i){
         System.out.println("Bet has not been placed, please try again.");
      }
         if(placeBet == true){
      System.out.println("Place your bet : ");
      bet = keyboard.nextLine();
      keyboard.nextLine();
         }else{
            System.out.println("Exiting...");
            System.exit(0);
         }//end else

        //output
         System.out.println(coin[randSide]);
         System.out.println("");
   }//end main method
}//end class
