package computerprogramming2;

import java.util.Scanner;

public class ComputerProgramming2 {
   public void run() {

      Scanner selectionComProg2 = new Scanner(System.in);
      boolean runningComProg2 = true;

      while (runningComProg2) {
         System.out.println("\n==============================================================================================================================");
         System.out.println("+                                                                                                                            +");
         System.out.println("+                                             Computer Programming 2 Lab Codes                                               +");
         System.out.println("+                                                                                                                            +");
         System.out.println("==============================================================================================================================\n");
         System.out.println("This section is not implemented yet. Back to the Main Menu?\n");
         System.out.print("Your choice [Y]: ");

         String choiceComProg2 = selectionComProg2.next().toUpperCase();

         if (choiceComProg2.equals("Y")) {
            runningComProg2 = false;
         } else {
            System.out.println("Invalid input. Please enter Y to go back.");
         }
      }
      // Do not close the scanner here
      
   }
}
