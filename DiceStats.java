
import java.util.Scanner;
import java.util.Random;

public class DiceStats {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random randGen = new Random();
      int i = 0;          // Loop counter iterates numRolls times
      int numRolls = 0;   // User defined number of rolls
      int numTwos = 0;  // Tracks number of 2s found
      int numThrees = 0;  // Tracks number of 3s found
      int numFours = 0;  // Tracks number of 4s found
      int numFives = 0;  // Tracks number of 5s found
      int numSixes = 0;   // Tracks number of 6s found
      int numSevens = 0;  // Tracks number of 7s found
      int numEights = 0;  // Tracks number of 8s found
      int numNines = 0;  // Tracks number of 9s found
      int numTens = 0;  // Tracks number of 10s found
      int numElevens = 0;  // Tracks number of 11s found
      int numTwelves = 0;  // Tracks number of 12s found
      int die1 = 0;       // Dice values
      int die2 = 0;       // Dice values
      int rollTotal = 0;  // Sum of dice values

         System.out.println("Enter number of rolls: ");
         numRolls = scnr.nextInt();
      
      if (numRolls > 1) {
         // Roll dice numRoll times
         for (i = 0; i < numRolls; ++i) {
            die1 = randGen.nextInt(6) + 1;
            die2 = randGen.nextInt(6) + 1;
            rollTotal = die1 + die2;

            // Count number of sixs and sevens
            if (rollTotal == 2) {
               numTwos = numTwos + 1;
            }
            else if (rollTotal == 3) {
               numThrees = numThrees + 1;
            }
            else if (rollTotal == 4) {
               numFours = numFours + 1;
            }
            else if (rollTotal == 5) {
               numFives = numFives + 1;
            } 
            else if (rollTotal == 6) {
               numSixes = numSixes + 1;
            }
            else if (rollTotal == 7) {
               numSevens = numSevens + 1;
            }
            else if (rollTotal == 8) {
               numEights = numEights + 1;
            }
            else if (rollTotal == 9) {
               numNines = numNines + 1;
            }
            else if (rollTotal == 10) {
               numTens = numTens + 1;
            } 
            else if (rollTotal == 11) {
               numElevens = numElevens + 1;
            }
            else if (rollTotal == 12) {
               numTwelves = numTwelves + 1;
            }
            System.out.println("Roll " + (i+1) + " is " + 
                  rollTotal + " (" + die1 + 
                  "+" + die2 + ")");
         }

         // Print statistics on dice rolls
         System.out.println("\nDice roll statistics:");
         
         System.out.print("2s: ");
          for(int twoCool = 0;twoCool<numTwos;twoCool++){
                 System.out.print("*");
              }
         System.out.println(); 
             
         System.out.print("3s: ");
         for(int threeCool = 0;threeCool<numThrees;threeCool++){
                 System.out.print("*");
              }
         
         System.out.println(); 
             
         System.out.print("4s: " );
           for(int fourCool = 0;fourCool<numFours;fourCool++){
                 System.out.print("*");
              }
         
         System.out.println(); 
             
         System.out.print("5s: ");
           for(int fiveCool = 0;fiveCool<numFives;fiveCool++){
                 System.out.print("*");
              }
         
         System.out.println(); 
             
         System.out.print("6s: ");
           for(int sixCool = 0;sixCool<numSixes;sixCool++){
                 System.out.print("*");
              }
         
         System.out.println();     
         
         System.out.print("7s: ");
           for(int sevenCool = 0;sevenCool<numSevens;sevenCool++){
                 System.out.print("*");
              }
         
         
         System.out.println(); 
             
         System.out.print("8s: ");
           for(int eightCool = 0;eightCool<numEights;eightCool++){
                 System.out.print("*");
              }
         
         System.out.println(); 
                
         System.out.print("9s: ");
                for(int nineCool = 0;nineCool<numNines;nineCool++){
                 System.out.print("*");
              }
         System.out.println(); 
             
         System.out.print("10s: ");
                for(int tenCool = 0;tenCool<numTens;tenCool++){
                 System.out.print("*");
              }
         System.out.println(); 
             
         System.out.print("11s: ");
                 for(int elevenCool = 0;elevenCool<numElevens;elevenCool++){
                 System.out.print("*");
              }
         System.out.println(); 
             
         System.out.print("12s: ");
                 for(int twelveCool = 0;twelveCool<numTwelves;twelveCool++){
                 System.out.print("*");
              }
      } 
      else{ 
       System.out.println("Invalid rolls. Try again.");
      
      }

      return;
   }
}
