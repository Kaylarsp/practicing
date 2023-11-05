import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n-----SELAMAT DATANG DI TOKO KAMI-----");
        System.out.println("\n1. Pilihan produk\n2. Pilih proses transaksi\nMasukkan menu : ");
        int menu = sc.nextInt();
        int choice;
        String cart = ""; // variabel yang akan menyimpan produk yg telah dipilih

        do {
            switch (menu) {
                case 1: // menu 1
                    System.out.println("\nBerikut ini adalah pilihan produk dari toko kami : ");
                    System.out.println("\n1. Piring kaca\n2. Piring kertas\n3. Gelas kaca\n4. Gelas plastik\n5. Gelas kertas");
                    System.out.println("\nMasukkan pilihan anda : ");
                    choice = sc.nextInt();

                    if (choice == 1) {
                        cart += "\nPiring kaca";
                    }else if (choice == 2) {
                        cart += "\nPiring kertas";
                    }else if (choice == 3) {
                        cart += "\nGelas kaca";
                    }else if (choice == 4) {
                        cart += "\nGelas plastik";
                    }else if (choice == 5) {
                        cart += "\nGelas kertas";
                    }

                    System.out.println("\nApakah anda ingin menambah produk lain? (y/t) ");
                    String add = sc.next();
                    if (add.equalsIgnoreCase("y")) {
                        continue;
                    }

                    System.out.println("\nIsi keranjang anda saat ini : " + "\n" + cart);

                case 2: // menu 2
                    System.out.println("\nBerikut ini adalah proses transaksi yang tersedia : ");
                    System.out.println("\n1. Tunai\n2. Transfer\n3. Qris");
                    System.out.println("\nPilih proses transaksi : ");
                    int paymethod = sc.nextInt();
                    if (paymethod == 1) {
                        System.out.println("\nMasukkan total belanja : ");
                        int total = sc.nextInt();
                        System.out.println("\nMasukkan uang pelanggan : ");
                        int money = sc.nextInt();
                        if (money > total) {
                            int change = money - total;
                            System.out.println("\nKembalian : " + change);
                            System.out.println("\n=====SELAMAT!!! TRANSAKSI ANDA BERHASIL!!!=====");
                            System.exit(0);
                        } else if (total == money) {
                            System.out.println("\n=====SELAMAT!!! TRANSAKSI ANDA BERHASIL!!!=====");
                            System.exit(0);
                        } else {
                            System.out.println("\nTransaksi anda gagal, silahkan coba lagi");
                            continue;
                        }
                    } else if (paymethod == 2) {
                        System.out.println("\nMasukkan nomor rekening : ");
                        Long rekening = sc.nextLong();
                        System.out.println("\n=====SELAMAT!!! TRANSAKSI ANDA BERHASIL!!!=====");
                        System.out.println("\nPembayaran telah diterima dari rekening " + rekening);
                        System.exit(0);
                    } else if (paymethod == 3) {
                        System.out.println("\nScan barcode");
                        System.out.println("\n=====SELAMAT!!! TRANSAKSI ANDA BERHASIL!!!=====");
                        System.exit(0);
                    } else {
                        System.out.println("\nInvalid input, please try again");
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
