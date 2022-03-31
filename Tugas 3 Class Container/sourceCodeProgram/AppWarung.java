package sourceCodeProgram;

import java.util.Scanner;
//Budi membeli sate dan soto
//class: pembeli, makanan, pembelian (nota/kwitansi)

public class AppWarung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih = 0, pilih2 = 0;

        cPembelian beli = new cPembelian(3);
        cPembeli pbl = new cPembeli("");
        cMakanan menu[] = new cMakanan[5];
        menu[0] = new cMakanan("Sate", 15000);
        menu[1] = new cMakanan("Soto", 12000);
        menu[2] = new cMakanan("Gule", 20000);
        menu[3] = new cMakanan("Bakso", 10000);
        menu[4] = new cMakanan("Pecel", 8000);

        do {
            System.out.println("\nAPP WARUNG");
            System.out.println("1. Pembeli");
            System.out.println("2. Makanan");
            System.out.println("3. Transaksi");
            System.out.println("4. Selesai");
            System.out.print("Pilih = ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    //sub menu pembeli
                    System.out.print("Nama pembeli = ");
                    String nm = sc.next();
                    pbl.setNama(nm);
                    break;
                case 2:
                    //sub menu makanan
                    System.out.println("Daftar Menu Makanan");

                    for (int i = 0; i < 5; i++) {
                        System.out.println((i + 1) + ". " + menu[i].toString());
                    }
                    break;
                case 3:
                    //sub menu pembelian
                    do {
                        System.out.println("  Pembelian");
                        System.out.println("  1. Isi pembeli");
                        System.out.println("  2. Tambah makanan");
                        System.out.println("  3. Hapus makanan");
                        System.out.println("  4. Lihat makanan");
                        System.out.println("  5. Selesai");
                        System.out.print("  Pilih = ");
                        pilih2 = sc.nextInt();

                        switch (pilih2) {
                            case 1:
                                beli.isiPembeli(pbl);
                                break;
                            case 2:
                                System.out.print("  Menu = ");
                                String mn = sc.next();
                                boolean ada = false;

                                for (int i = 0; i < menu.length; i++) {
                                    if (mn.equalsIgnoreCase(menu[i].getNama())) {
                                        ada = true;
                                        beli.tambahMakanan(menu[i]);
                                        break;
                                    }
                                }

                                if (ada == false) {
                                    System.out.println("  Menu tidak ada!");
                                }
                                break;
                            case 3:
                                System.out.print("  Menu dihapus = ");
                                String h = sc.next();
                                beli.hapusMakanan(h);
                                break;
                            case 4:
                                beli.lihatMakanan();
                                break;
                            case 5:
                                System.out.println("  Kembali..");
                        }
                    } while (pilih2 != 5);
                    break;
                case 4:
                    System.out.println("Terima kasih..");
            }
        } while (pilih != 4);
    }
}