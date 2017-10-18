package com.joegomez;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static PartList partList = new PartList();
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printMenu();
        while(!quit){
            System.out.println("Please enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    printMenu();
                    break;
                case 1:
                    partList.printPartList();
                case 2:
                    addPart();
                case 3:
                    modifyPart();
                case 4:
                    removePart();
                case 5:
                    searchForParts();
                case 6:
                    quit = true;
                    break;
            }
        }
    }
    public static void printMenu(){
        System.out.println("\nPress: ");
        System.out.println("\t 0 - Back to Menu. ");
        System.out.println("\t 1 - To add a part. ");
        System.out.println("\t 2 - Modify a item in your cart. ");
        System.out.println("\t 3 - Remove an item from your cart. ");
        System.out.println("\t 4 - Show all items in your cart. ");
        System.out.println("\t 5 - Search for an item in your cart. ");
        System.out.println("\t 6 - Quit. ");
    }
    public static void addPart(){
        System.out.println("Enter item you want to add: ");
        partList.addComputerPart(scanner.nextLine());
        System.out.println(scanner.nextLine() + " has been added to your cart. ");
    }
    public static void modifyPart(){
        System.out.print("Enter item you want to modify: ");
        String itemNo = scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        partList.modifyComputerPart(itemNo, newItem);
    }
    public static void removePart(){
        System.out.println("Enter the item you want to remove: ");
        String itemNo = scanner.nextLine();
    }

    public static void searchForParts(){
        System.out.println("Enter item name: ");

    }
}
