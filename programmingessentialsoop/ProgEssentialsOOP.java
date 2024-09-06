package programmingessentialsoop;

import java.util.Scanner;

public class ProgEssentialsOOP {
   public void run() {
      
      Scanner selectionPEOOP = new Scanner(System.in);
      boolean runningPEOOP = true;

      while (runningPEOOP) {
         System.out.println("\n==============================================================================================================================");
         System.out.println("+                                                                                                                            +");
         System.out.println("+                                          Programming Essentials to OOP Lab Codes                                           +");
         System.out.println("+                                                                                                                            +");
         System.out.println("==============================================================================================================================\n");
         System.out.println("This section is not implemented yet. Back to the Main Menu?\n");
         System.out.print("Your choice [Y]: ");

         String choicePEOOP = selectionPEOOP.next().toUpperCase();

         if (choicePEOOP.equals("Y")) {
            runningPEOOP = false;
         } else {
            System.out.println("Invalid input. Please enter Y to go back.");
         }
      }
      // Do not close the scanner here

    }
}