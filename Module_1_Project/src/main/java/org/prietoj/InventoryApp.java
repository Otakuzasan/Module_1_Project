package org.prietoj;

import java.util.Scanner;
import java.util.List;


public class InventoryApp {

    public static void main(String[] args)
    {
        //scanner for user input
        Scanner scan = new Scanner(System.in);

        //Instance of InventoryManger class
        InventoryManager inventoryManager = new InventoryManager();

        //

        //Display Program Start
        System.out.println("--------------------------------------------------------");
        System.out.println("Upon Start Up, This Program Will Check For A File Named");
        System.out.println("'inventory.dat',In The Users Home Directory.");
        System.out.println("If It Does Not Exist, It Will Be Created. ");
        System.out.println("-----------------------------------------");

        //check for "inventory.dat" data file that will store the List
        String fileName = "inventory.dat";
        InventoryManager.createFile(fileName);

        System.out.println("-----------------------------------------");

        //handles menu display and user choices

        while(true) {

            displayMenu();
            //
            int menuChoice = scan.nextInt();
            scan.nextLine();

            switch(menuChoice){
                case 1:
                    viewChoice(scan);
                    break;
                case 2:
                    addChoice(scan);
                    break;
                case 3:
                    removeChoice(scan);
                    break;
                case 4:
                    updateChoice(scan);
                    break;
                case 5:
                    exitChoice(scan);
                    break;
            }

        }



    }///// end of Program Main


    public static void displayMenu(){
        System.out.println("---------------------");
        System.out.println("--Inventory and You--");
        System.out.println("---------------------");
        System.out.println(" ");
        System.out.println("PLease Make A Choice.");
        System.out.println("---Enter # 1 -> 5.---");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("1.View Current Product List");
        System.out.println("2.Add Product To List");
        System.out.println("3.Remove Item From Product List");
        System.out.println("4.Update The Product List");
        System.out.println("5.Exit Program");
        System.out.println("---------------------");
    }


    private static void viewChoice(Scanner scan){
        InventoryManager inventoryManager = new InventoryManager();
        //view the product List
        System.out.println("The Contents of Product List: ");

    }

    private static void addChoice(Scanner scan)
    {


    }

    private static void removeChoice(Scanner scan){

    }

    private static void updateChoice(Scanner scan){

    }

    private static void exitChoice(Scanner scan){
        System.out.println("Thank You For Using My Program");
        System.out.println("Goodbye!!!");
        System.exit(0);
    }



}