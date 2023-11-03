import java.util.Scanner;

/**
 * shorterifelse
 */
public class shorterifelse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age :");
        int age = sc.nextInt();

        String result = (age < 18) ? "You are underage" : "Your age is verified";
        System.out.println(result);

    }
}