import java.util.Scanner;

/**
 * lat01
 */
public class identitas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, absen, kelas, prodi, jurusan, print;

        do {
            System.out.print("==========IDENTITAS DIRI==========");
            System.out.println();
            System.out.print("Nama            :");
            nama = sc.nextLine();
            System.out.print("Absen           :");
            absen = sc.next();
            System.out.print("Kelas           :");
            kelas = sc.next();
            System.out.print("Prodi           :");
            prodi = sc.next();
            System.out.print("Jurusan         :");
            jurusan = sc.next();
            System.out.println("Apakah anda ingin mencetak identitas diri anda (y/t)?");
            print = sc.next();
            if (print.equalsIgnoreCase("y")) {
                System.out.println("==========IDENTITAS DIRI==========");
                System.out.println("Nama        : " + nama);
                System.out.println("Absen       : " + absen);
                System.out.println("Kelas       :" + kelas);
                System.out.println("Prodi       :" + prodi);
                System.out.println("Jurusan     :" + jurusan);
                System.out.println("==================================");
            } else {
                break;
            }
        } while (true);
    }
}