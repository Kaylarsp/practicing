public class studikasus1 {
    public static void main(String[] args) {

        // menggunakan for loop
        for (int i = 0; i < 4 ; i++) { // outer loop
            for (int j = 0; j < 4; j++) { // inner loop
                System.out.print("*");
            }
            System.out.println();
        }

        // menggunakan while loop
        int i = 0;
        while (i < 4) { // outer loop
            int j = 0;
            while (j < 4) { // inner loop menghasilkan 4 bintang dalam 1 baris
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        // menggunakan do-while loop
        int k = 0;
        do { // outer loop
            int j = 0;
            do { // inner loop
                System.out.print("*");
                j++;
            } while (j < 4);
            System.out.println();
            k++;
        } while (k < 4);

    }
}
