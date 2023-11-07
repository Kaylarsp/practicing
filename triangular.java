import java.util.Scanner;

public class triangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= number; i++) { // outer loop
            for (int j = 1; j <= i; j++) {  // inner loop
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
