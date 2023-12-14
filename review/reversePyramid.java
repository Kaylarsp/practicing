import java.util.Scanner;

public class reversePyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter rows : ");
        int rows = sc.nextInt();
        System.out.println();

        for (int i = 0; i <= rows - 1; i++) { //menentukan jumlah baris yang dicetak
            for (int j = 0; j <= i; j++) { //menetukan jumlah spasi di setiap baris
                System.out.print(" "); // mencetak spasi tanpa membuat baris baru, diulang sebanyak j kali di tiap baris
            }
            for (int k = 0; k <= rows - 1 - i; k++) { //menentukan jumlah bintang yang dicetak di tiap baris
                System.out.print("*" + " "); //mencetak bintang dan spasi, diulang sebanyak k kali di tiap baris
            }
            System.out.println();
        }
    }
}
