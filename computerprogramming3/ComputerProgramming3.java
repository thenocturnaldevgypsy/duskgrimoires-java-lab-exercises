package computerprogramming3;

import java.util.Scanner;

public class ComputerProgramming3 {
   public void run() {

      Scanner selectionComProg3 = new Scanner(System.in);
      boolean runningComProg3 = true;

      while (runningComProg3) {
         System.out.println("\n==============================================================================================================================");
         System.out.println("+                                                                                                                            +");
         System.out.println("+                                             Computer Programming 3 Lab Codes                                               +");
         System.out.println("+                                                                                                                            +");
         System.out.println("==============================================================================================================================\n");
         System.out.println("This section is not implemented yet. Back to the Main Menu?\n");
         System.out.print("Your choice [Y]: ");

         String choiceComProg3 = selectionComProg3.next().toUpperCase();

         if (choiceComProg3.equals("Y")) {
            runningComProg3 = false;
         } else {
            System.out.println("Invalid input. Please enter Y to go back.");
         }
      }
      // Do not close the scanner here
      
   }
}
