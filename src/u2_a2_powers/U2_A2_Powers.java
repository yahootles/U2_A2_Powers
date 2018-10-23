/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u2_a2_powers;

/**
 *
 * @author antho6229
 */
import java.util.Scanner;

public class U2_A2_Powers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kinput = new Scanner(System.in);

        //declare variables
        String choiceIn = "0";
        boolean exit = false;

        while (!exit) {
            //declare local variables
            int userNum = 0;
            int power = 1;

            System.out.println("\n~~Powers~~\n");
            System.out.println("Would you like to...");
            System.out.println("1. Find the square of a number?\n2. Find the cube of a number?\n3. Find a different power of a number?\n4. Exit?");

            choiceIn = kinput.nextLine();


                switch (choiceIn) {
                    case "1":
                        //prompt use and get input
                        System.out.println("Enter the number you wish to square:");

                        userNum = Integer.parseInt(kinput.nextLine());

                        //do the calculation
                        for (int i = 0; i < 2; i++) {
                            power *= userNum;
                        }

                        System.out.println(userNum + " squared is " + power + "!");

                        break;
                    case "2":
                        //prompt use and get input
                        System.out.println("Enter the number you wish to cube:");

                        userNum = Integer.parseInt(kinput.nextLine());

                        //do the calculation
                        for (int i = 0; i < 3; i++) {
                            power *= userNum;
                        }

                        System.out.println(userNum + " cubed is " + power + "!");
                        break;
                    case "3":
                        int exponent = 0;

                        System.out.println("Enter the number you wish to raise to an exponent:");
                        userNum = Integer.parseInt(kinput.nextLine());

                        System.out.println("Enter the exponent you would like to raise it to:");
                        exponent = Integer.parseInt(kinput.nextLine());

                        for (int i = 0; i < exponent; i++) {
                            power *= userNum;
                        }

                        System.out.println(userNum + " to the exponent " + exponent + " is " + power + "!");
                        break;
                    case "4":
                        System.out.println("");
                        exit = true;
                        break;
                    default:
                        System.out.println("\n\n\n\n\nThat is not a valid input.\n\n\n\n\n\n");
                }
        }
        System.out.println("Exited");
    }

}
