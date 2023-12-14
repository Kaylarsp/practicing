import java.util.Scanner;

public class studikasus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter number : ");
        // int number = sc.nextInt();

        // menggunakan for loop
        // for (int i = 0; i < 10; i++) {
        //     for (int j = 0; j < i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // menggunakan while loop
        int i = 0;
        while (i < 10) {
            int j = 0;
            while (j <= i) { // inner loop menghasilkan satu baris bintang yang jmlhny menyesuaikan dg nilai/nomor baris pd baris i
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
