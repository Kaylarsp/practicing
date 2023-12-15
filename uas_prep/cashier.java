package uas_prep;

import java.util.Scanner;

/**
 * cashier
 */
public class cashier {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome to our coffeeshop!");
        loginLoop();
        System.out.println("MENU : ");
        System.out.println(" 1.  CHICKEN CREAM SOUP    15K");
        System.out.println(" 2.  CHICKEN STEAK         30K");
        System.out.println(" 3.  BEEF STEAK            40K");
        System.out.println(" 4.  SPARKLING WATER       10K");
        System.out.println(" 5.  COFFEE LATTE          15K");
        sc.close();
    }

    private static Scanner sc = new Scanner(System.in);

    private static final int PASS = 123456;

    private static void login() {
        System.out.println();
        System.out.print("Enter username : ");
        String username = sc.next();
    }

    private static int enterPass() {
        System.out.print("Enter password : ");
        return sc.nextInt();
    }
    
    private static void loginLoop() {
        do {
            login();
            int password = enterPass();

            if (password == PASS) {
                displayMenu();
            } else {
                System.out.println();
                System.out.println("Incorrect password");
            }
        } while (true);
    }

    static void displayMenu() {
        System.out.println();
        System.out.println(" MENU : ");
        System.out.println(" 1.  CHICKEN CREAM SOUP    15K");
        System.out.println(" 2.  CHICKEN STEAK         30K");
        System.out.println(" 3.  BEEF STEAK            40K");
        System.out.println(" 4.  SPARKLING WATER       10K");
        System.out.println(" 5.  COFFEE LATTE          15K");

        inputMenu();
    }

    static void displayOrder(String menu,int amount, double total) {
        System.out.println();
        System.out.println("Menu        : " + menu);
        System.out.println("Amount      : " + amount);
        System.out.println("Total       : Rp." + total);
    }
    static void inputMenu() {
        do {
            System.out.print("Enter your choice : ");
            int menu = sc.nextInt();
            double total = 0, totalAll = 0;
            String menuItem = (" ");
            switch (menu) {
                case 1:
                    menuItem = "Chicken cream soup";
                    System.out.print("Enter amount : ");
                    int amount1 = sc.nextInt();
                    total = 15000 * amount1;
                    break;
                    case 2:
                    menuItem = "Chicken steak";
                    System.out.print("Enter amount : ");
                    int amount2 = sc.nextInt();
                    total = 30000 * amount2;
                    break;
                    case 3:
                    menuItem = "Beef steak";
                    System.out.print("Enter amount : ");
                    int amount3 = sc.nextInt();
                    total = 40000 * amount3;
                    break;
                    case 4:
                    menuItem = "Sparkling water";
                    System.out.print("Enter amount : ");
                    int amount4 = sc.nextInt();
                    total = 10000 * amount4;
                    break;
                    case 5:
                    menuItem = "Coffee latte";
                    System.out.print("Enter amount : ");
                    int amount5 = sc.nextInt();
                    total = 15000 * amount5;
                    break;
                    default:
                    System.out.println("Invalid menu");
                    break;
                    
                }

                if (!menuItem.equals("")) {
                    displayOrder(menuItem, menu, total);
                    totalAll += total;
                }
                System.out.println("Total of all orders : " + totalAll);
                
            } while (true);
        }

        static void count() {
            
        }
}