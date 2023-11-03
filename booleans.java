import java.util.Scanner;

/**
 * booleans
 */
public class booleans {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age :");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("you are old enoung to vote");
            System.out.println("write down your choice :");
            String name = sc.next();
        } else {
            System.out.println("Sorry, you are not old enough to vote");
        }
    }
}