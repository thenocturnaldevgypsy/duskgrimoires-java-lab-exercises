package computerprogramming1;

import java.util.Scanner;

public class ComputerProgramming1 {
   public void run() {

      Scanner selectionComProg1 = new Scanner(System.in);
      boolean runningComProg1 = true;

      while (runningComProg1) {
         System.out.println("\n==============================================================================================================================");
         System.out.println("+                                                                                                                            +");
         System.out.println("+                                             Computer Programming 1 Lab Codes                                               +");
         System.out.println("+                                                                                                                            +");
         System.out.println("==============================================================================================================================\n");
         System.out.println("This section is not implemented yet. Back to the Main Menu?\n");
         System.out.print("Your choice [Y]: ");

         String choiceComProg1 = selectionComProg1.next().toUpperCase();

         if (choiceComProg1.equals("Y")) {
            runningComProg1 = false;
         } else {
            System.out.println("Invalid input. Please enter Y to go back.");
         }
      }
      // Do not close the scanner here

   }
}
