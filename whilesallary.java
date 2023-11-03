import java.util.Scanner;

public class whilesallary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlKaryawan, jmlJamLembur;
        double gajiLembur = 0, totalGajiLembur = 0;
        String jabatan;

        System.out.println("Masukkan jumlah karyawan :");
        jmlKaryawan = sc.nextInt();

        int i = 0;
        while (i < jmlKaryawan) {
            System.out.println("Pilihan jabatan - direktur, manager, karyawan");
            System.out.print("Masukkan jabatan karyawan ke -" + (i+1) + ": ");
            jabatan = sc.next();
            System.out.print("Masukkan jam lembur : ");
            jmlJamLembur = sc.nextInt();
            i++;
            if (jabatan.equalsIgnoreCase("direktur")) {
                
            }
        }


    }
}
