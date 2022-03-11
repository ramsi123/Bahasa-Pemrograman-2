package Modul18RelasiAsosiasi;
import java.util.Scanner;
//Budi membeli sate
//class: Budi --> pembeli, Sate --> makanan

public class AppWarung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pilih1 = 0, pilih2 = 0;
        cPembeli pbl = new cPembeli("Budi", "Rungkut");
        cMakanan mkn = new cMakanan("Sate", 15000);

        do {
            System.out.println("\nWARUNG SEDERHANA");
            System.out.println("1. Pembeli");
            System.out.println("2. Makanan");
            System.out.println("3. Pembelian");
            System.out.println("4. Selesai");
            System.out.print("Pilih = ");
            pilih1 = sc.nextInt();

            switch (pilih1) {
                case 1:
                    do {
                        System.out.println("  MENU PEMBELI");
                        System.out.println("  1. Data Baru");
                        System.out.println("  2. Lihat Data");
                        System.out.println("  3. Ubah Data");
                        System.out.println("  4. Selesai");
                        System.out.print("  Pilih = ");
                        pilih2 = sc.nextInt();

                        switch (pilih2) {
                            case 1:
                                System.out.print("  Nama   = ");
                                String n = sc.next();
                                System.out.print("  Alamat = ");
                                String a = sc.next();
                                pbl = new cPembeli(n, a);
                                break;
                            case 2:
                                String t = pbl.toString();
                                System.out.println("  Pembeli: " + t);
                                break;
                            case 3:
                                System.out.print("  Alamat Baru = ");
                                String ab = sc.next();
                                pbl.setAlamat(ab);
                                break;
                            case 4:
                                System.out.println("  Kembali...");
                        }
                    } while (pilih2 != 4);
                    break;
                case 2:
                    do {
                        System.out.println("  MENU MAKANAN");
                        System.out.println("  1. Data Baru");
                        System.out.println("  2. Lihat Data");
                        System.out.println("  3. Ubah Data");
                        System.out.println("  4. Selesai");
                        System.out.print("  Pilih = ");
                        pilih2 = sc.nextInt();

                        switch (pilih2) {
                            case 1:
                                System.out.print("  Nama   = ");
                                String n = sc.next();
                                System.out.print("  Harga  = ");
                                int h = sc.nextInt();
                                mkn = new cMakanan(n, h);
                                break;
                            case 2:
                                String t = mkn.toString();
                                System.out.println("  Makanan: " + t);
                                break;
                            case 3:
                                System.out.print("  Harga Baru = ");
                                int hb = sc.nextInt();
                                mkn.setHarga(hb);
                                break;
                            case 4:
                                System.out.println("  Kembali...");
                        }
                    } while (pilih2 != 4);
                    break;
                case 3:
                    do {
                        System.out.println("  MENU PEMBELIAN");
                        System.out.println("  1. Buat transaksi");
                        System.out.println("  2. Lihat transaksi");
                        System.out.println("  3. Ubah transaksi");
                        System.out.println("  4. Hapus transaksi");
                        System.out.println("  5. Selesai");
                        System.out.print("  Pilih = ");
                        pilih2 = sc.nextInt();

                        switch (pilih2) {
                            case 1:
                                pbl.beliMakanan(mkn);
                                break;
                            case 2:
                                pbl.lihatMakanan();
                                break;
                            case 3:
                                cMakanan mkn2 = new cMakanan("Soto", 10000);
                                pbl.ubahMakanan(mkn2);
                                break;
                            case 4:
                                pbl.hapusMakanan();
                                break;
                            case 5:
                                System.out.println("  Kembali...");
                        }
                    } while (pilih2 != 5);
                    break;
                case 4:
                    System.out.println("Terima Kasih...");
                    break;
            }
        } while (pilih1 != 4);
    }
}