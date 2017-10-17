package com.joegomez;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
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
        System.out.println(         + " has been added to your cart. ");
    }
    public static void modifyPart(){
        System.out.print("Enter item you want to modify: ");
        System.out.println("Enter replacement item: ");
    }
    public static void removePart(){

    }
    public static void listAllParts(){

    }
    public static void searchForParts(){

    }
}
