import datastructurealgorithmanalysis.DataStrucAlgoAnalysis;
import java.util.InputMismatchException;
import java.util.Scanner;
import programmingessentialsoop.ProgEssentialsOOP;

public class App {
   public static void main(String[] args) {
      
      Scanner selectionMain = new Scanner(System.in); // Single scanner instance
      boolean runningMain = true;

      System.out.println("==============================================================================================================================");
      System.out.println("+                                                                                                                            +");
      System.out.println("+  Hello, I'm TheNocturnalDevGypsy, and looks like you've stumbled to one of my GitHub Repo: DuskGrimoire.                   +");
      System.out.println("+                                                                                                                            +");
      System.out.println("+  It's a Java library/source codes that I've coded and used for lecturing CS/IT subjects and topics during my career        +");
      System.out.println("+  as Assistant Professor for BSCS, BSIT and BSCOE way back late 2012 to 2015. If you want to ask some questions and         +");
      System.out.println("+  provide feedback, feel free to start a discussion or an issue at the repo, I'll try my best to answer.                    +");
      System.out.println("+                                                                                                                            +");
      System.out.println("+  GitHub Repo: https://github.com/thenocturnaldevgypsy/duskgrimoire-java-lab-exercises                                      +");
      System.out.println("+                                                                                                                            +");
      System.out.println("+  If you find this repo helpful, please don't forget to STAR the repo at GitHub, also, maybe buy me a coffee at Ko-Fi? ;)   +");
      System.out.println("+                                                                                                                            +");
      System.out.println("==============================================================================================================================");

      while (runningMain) {
         System.out.println("\nFeel free to browse the programs/apps I've coded:\n");
         System.out.println("| 1 | Programming Essentials to OOP Lab Codes");
         System.out.println("| 2 | Data Structure and Algorithm Analysis Lab Codes");
         System.out.println("| 0 | To QUIT\n");
         System.out.print("Your choice [0 to QUIT]: ");

         int choiceMain;

         // Input validation
         try {
            choiceMain = selectionMain.nextInt();
         } catch (InputMismatchException e) {
            System.out.println("\nInvalid input. Please enter a number.\n");
            selectionMain.next(); // Clear the invalid input
            continue;
         }
            
         switch (choiceMain) {
            case 1 -> {
               ProgEssentialsOOP peoop = new ProgEssentialsOOP();
               peoop.run();
            }
            case 2 -> {
               DataStrucAlgoAnalysis dsaa = new DataStrucAlgoAnalysis();
               dsaa.run();
            }
            case 0 -> {
               runningMain = false;
               System.out.println("\nGoodbye!");
            }
            default -> System.out.println("\nInvalid option. Please try again.\n");
         }
      }
      // Do not close the scanner here

    }
}