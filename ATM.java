import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 50000000, withdraw, deposit;

        while (true) {
            System.out.println("\n***AUTOMATED TELLER MACHINE***");
            System.out.println("\n1. Withdraw");
            System.out.println("\n2. Deposit");
            System.out.println("\n3. Check balance");
            System.out.println("\n4. EXIT");
            System.out.print("\nChoose the operation you want to perform : ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("\nEnter money to be withdrawn : ");
                    withdraw = sc.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("\n=================================================");
                        System.out.println("\nWe're collecting your money, please wait a minute");
                        System.out.println("\n------------Please collect your money------------");
                        System.out.println("\n=================================================");
                    } else {
                        System.out.println("Insufficient balence");
                    }
                    System.out.print("\nBack to menu? (0 = yes, 1 = no)   ");
                    String back = sc.next();
                    if (back.equalsIgnoreCase("0")) {
                        continue;
                    } else {
                        System.exit(1);
                    }
                case 2:
                    System.out.print("\nEnter money to be deposited : ");
                    deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("\n================================================\n");
                    System.out.println("---Your money has been successfully deposited---");
                    System.out.println("\n================================================\n");
                    System.out.print("\nBack to menu? (0 = yes, 1 = no)   ");
                    back = sc.next();
                    if (back.equalsIgnoreCase("0")) {
                        continue;
                    } else {
                        System.exit(1);
                    }
                case 3:
                    System.out.println("\nBalance     :   " + balance);
                    System.out.println("");
                    System.out.print("\nBack to menu? (0 = yes, 1 = no)   ");
                    back = sc.next();
                    if (back.equalsIgnoreCase("0")) {
                        continue;
                    } else {
                        System.exit(1);
                    }
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
