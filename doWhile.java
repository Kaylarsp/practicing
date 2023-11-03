import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("1. Pilihan produk\n2. Pilih proses transaksi\nMasukkan menu : ");
        int menu = sc.nextInt();
        int choice;
        String cart = ""; // variabel yang akan menyimpan produk yg telah dipilih

        do {
            switch (menu) {
                case 1: // menu 1
                    System.out.println("Berikut ini adalah pilihan produk dari toko kami");
                    System.out.println("1. Piring kaca\n2. Piring kertas\n3. Gelas kaca\n4. Gelas plastik\n5. Gelas kertas");
                    System.out.println("Masukkan pilihan anda : ");
                    choice = sc.nextInt();

                    if (choice == 1) {
                        cart += "\nPiring kaca\n";
                    }else if (choice == 2) {
                        cart += "\nPiring kertas\n";
                    }else if (choice == 3) {
                        cart += "\nGelas kaca\n";
                    }else if (choice == 4) {
                        cart += "\nGelas plastik\n";
                    }else if (choice == 5) {
                        cart += "\nGelas kertas\n";
                    }

                    System.out.println("Apakah anda ingin menambah produk lain? (y/t) ");
                    String add = sc.next();
                    if (add.equalsIgnoreCase("y")) {
                        continue;
                    }

                    System.out.println("Isi keranjang anda saat ini : " + "\n" + cart);

                case 2: // menu 2
                    System.out.println("Proses transaksi : ");
                    System.out.println("1. Tunai\n2. Transfer\n3. Qris");
                    int paymethod = sc.nextInt();
                    if (paymethod == 1) {
                        System.out.println("Masukkan total belanja : ");
                        int total = sc.nextInt();
                        System.out.println("Masukkan uang pelanggan : ");
                        int money = sc.nextInt();
                        if (money > total) {
                            int change = money - total;
                            System.out.println("Kembalian : " + change);
                            System.out.println("=====SELAMAT!!! TRANSAKSI ANDA BERHASIL!!!=====");
                            System.exit(0);
                        } else if (total == money) {
                            System.out.println("=====SELAMAT!!! TRANSAKSI ANDA BERHASIL!!!=====");
                            System.exit(0);
                        } else {
                            System.out.println("Transaksi anda gagal, silahkan coba lagi");
                            continue;
                        }
                    } else if (paymethod == 2) {
                        System.out.println("Masukkan nomor rekening : ");
                        Long rekening = sc.nextLong();
                        System.out.println("=====SELAMAT!!! TRANSAKSI ANDA BERHASIL!!!=====");
                        System.out.println("Pembayaran telah diterima dari rekening " + rekening);
                        System.exit(0);
                    } else if (paymethod == 3) {
                        System.out.println("Scan barcode");
                        System.out.println("=====SELAMAT!!! TRANSAKSI ANDA BERHASIL!!!=====");
                        System.exit(0);
                    } else {
                        System.out.println("Invalid input, please try again");
                        continue;
                    } break;
                default:
                System.out.println("Mohon maaf, untuk menu lainnya masih dalam proses perkembangan");
                System.exit(0);
                    break;
            }
        } while (true);
    }
}
