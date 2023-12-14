package uas_prep;

import java.util.Scanner;

/**
 * cashier
 */
public class cashier {

    public static void main(String[] args) {
        
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
                
            } else {
                System.out.println();
                System.out.println("Incorrect password");
            }
        } while (true);
    }

    private static void displayMenu() {
        String [] {
            
        }
    }

}