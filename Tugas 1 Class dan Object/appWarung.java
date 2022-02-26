import java.util.Scanner;

class cPembeli {
    private String[] namaPembeli = new String[10];

    cPembeli() {
        this.namaPembeli[0] = null;
    }
    
    public String[] getNamaPembeli() {
        return namaPembeli;
    }

    public void setNamaPembeli(String newName, int urutan) {
        this.namaPembeli[urutan] = newName;
    }
}

class cMakanan {
    private String[] namaMakanan = new String[10];
    private int[] hargaMakanan = new int[10];

    cMakanan() {
        this.namaMakanan[0] = "Rawon";          this.hargaMakanan[0] = 7000;
        this.namaMakanan[1] = "Sate Ayam";      this.hargaMakanan[1] = 10000;
        this.namaMakanan[2] = "Nasi Goreng";    this.hargaMakanan[2] = 9000;
        this.namaMakanan[3] = "Ayam Goreng";    this.hargaMakanan[3] = 12000;
        this.namaMakanan[4] = "Bebek Goreng";   this.hargaMakanan[4] = 15000;
    }
    
    public String[] getNamaMakanan() {
        return namaMakanan;
    }

    public int[] getHargaMakanan() {
        return hargaMakanan;
    }

    public void setNamaMakanan(String newFood, int urutanMakanan) {
        this.namaMakanan[urutanMakanan] = newFood;
    }

    public void setHargaMakanan(int newPrice, int urut) {
        this.hargaMakanan[urut] = newPrice;
    }
}

class cWarung {
    private String namaWarung;
    private String alamatWarung;

    cWarung() {
        namaWarung = "";
        alamatWarung = "";
        System.out.println("Default object created..");
    }
    cWarung(String nm, String al) {
        namaWarung = nm;
        alamatWarung = al;
        System.out.println("Objek Warung " + namaWarung + " dibuat..");
    }

    public void setNamaWarung(String n) {
        namaWarung = n;
    }
    public void setAlamatWarung(String a) {
        alamatWarung = a;
    }

    public String getNamaWarung() {
        return namaWarung;
    }

    public String getAlamatWarung() {
        return alamatWarung;
    }

    public String lihatData() {
        return "Warung " + namaWarung + "[" + alamatWarung + "]";
    }
}

public class appWarung {
    public static void main(String[] args) {
        cPembeli pmb1 = new cPembeli();
        cMakanan mkn = new cMakanan();
        cWarung wrg1 = new cWarung();
        Scanner sc = new Scanner(System.in);

        int pilih = 0;

        do { //sub menu
            System.out.println("\nWarung " + wrg1.getNamaWarung());
            System.out.println("1. Buat Warung");
            System.out.println("2. Lihat Warung");
            System.out.println("3. Ubah Warung");
            System.out.println("4. Menu Pembeli");
            System.out.println("5. Menu Makanan");
            System.out.println("6. Selesai");
            System.out.print("Pilih = ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Nama Warung = ");
                    String nm = sc.next();
                    System.out.print("Alamat      = ");
                    String al = sc.next();
                    wrg1 = new cWarung(nm, al);
                    break;
                case 2:
                    String w = wrg1.lihatData();
                    System.out.println("Data: " + w);
                    break;
                case 3:
                    System.out.print("Alamat Baru = ");
                    String a = sc.next();
                    wrg1.setAlamatWarung(a);
                    break;
                case 4:
                    int pilih2 = 0;

                    do {
                        System.out.println("\n1. Lihat Pembeli");
                        System.out.println("2. Tambah Pembeli");
                        System.out.println("3. Ubah Pembeli");
                        System.out.println("4. Keluar");
                        System.out.print("Pilih = ");
                        pilih2 = sc.nextInt();

                        switch (pilih2) {
                            case 1:
                                String[] daftar = new String[pmb1.getNamaPembeli().length];
                                daftar = pmb1.getNamaPembeli();

                                System.out.println("DAFTAR PEMBELI");
                                for (int i = 0; i < daftar.length; i++) {
                                    if (daftar[i] != null) {
                                        System.out.println(i + 1 + ". " + daftar[i]);
                                    }
                                }
                                break;
                            case 2:
                                daftar = pmb1.getNamaPembeli();

                                System.out.print("Masukkan Nama = ");
                                sc = new Scanner(System.in);
                                String masukkanNama = sc.nextLine();

                                int posisi = -1;
                                for (int i = 0; i < daftar.length; i++) {
                                    if (daftar[i] == null) {
                                        posisi = i;
                                        break;
                                    }
                                }
                                pmb1.setNamaPembeli(masukkanNama, posisi);
                                System.out.println("Nama Berhasil ditambahkan..");
                                break;
                            case 3:
                                daftar = pmb1.getNamaPembeli();

                                System.out.print("Masukkan Nama yang Ingin diubah = ");
                                sc = new Scanner(System.in);
                                masukkanNama = sc.nextLine();
                                posisi = -1;
                                for (int i = 0; i < daftar.length; i++) {
                                    if (daftar[i] != null && daftar[i].compareToIgnoreCase(masukkanNama) == 0) {
                                        posisi = i;
                                        break;
                                    }
                                }

                                if (posisi >= 0) {
                                    System.out.print("Masukkan Nama Baru = ");
                                    sc = new Scanner(System.in);
                                    masukkanNama = sc.nextLine();
                                    pmb1.setNamaPembeli(masukkanNama, posisi);
                                    System.out.println("Nama Berhasil dirubah..");
                                } else {
                                    System.out.println("Nama Tidak ditemukan..");
                                }
                                break;
                            case 4:
                                break;
                        }
                    } while (pilih2 != 4);
                    break;
                case 5:
                    pilih2 = 0;    

                    do {
                        System.out.println("\n1. Lihat Menu Makanan");
                        System.out.println("2. Tambah Makanan");
                        System.out.println("3. Ubah Makanan");
                        System.out.println("4. Keluar");
                        System.out.print("Pilih = ");
                        pilih2 = sc.nextInt();

                        switch (pilih2) {
                            case 1:
                                String[] daftarMakanan = new String[mkn.getNamaMakanan().length];
                                daftarMakanan = mkn.getNamaMakanan();
                                int[] daftarHarga = new int[mkn.getHargaMakanan().length];
                                daftarHarga = mkn.getHargaMakanan();

                                System.out.println("MENU\t\tHARGA");
                                for (int i = 0; i < daftarMakanan.length; i++) {
                                    if (daftarMakanan[i] != null) {
                                        System.out.println(i + 1 + ". " + daftarMakanan[i] + "\t" + daftarHarga[i]);
                                    }
                                }
                                break;
                            case 2:
                                daftarMakanan = mkn.getNamaMakanan();
                                daftarHarga = mkn.getHargaMakanan();

                                System.out.print("Masukkan Nama Makanan = ");
                                sc = new Scanner(System.in);
                                String makanan = sc.nextLine();
                                System.out.print("Masukkan Harga = ");
                                int hrg = sc.nextInt();

                                int posisi = -1;
                                for (int i = 0; i < daftarMakanan.length; i++) {
                                    if (daftarMakanan[i] == null) {
                                        posisi = i;
                                        break;
                                    }
                                }
                                mkn.setNamaMakanan(makanan, posisi);
                                mkn.setHargaMakanan(hrg, posisi);
                                System.out.println("Menu Berhasil ditambahkan..");
                                break;
                            case 3:
                                daftarMakanan = mkn.getNamaMakanan();
                                daftarHarga = mkn.getHargaMakanan();

                                System.out.print("Masukkan Nama Menu yang ingin diubah = ");
                                sc = new Scanner(System.in);
                                makanan = sc.nextLine();

                                posisi = -1;
                                for (int i = 0; i < daftarMakanan.length; i++) {
                                    if (daftarMakanan[i] != null && daftarMakanan[i].compareToIgnoreCase(makanan) == 0) {
                                        posisi = i;
                                        break;
                                    }
                                }

                                if (posisi >= 0) {
                                    System.out.print("Masukkan Nama Menu Baru = ");
                                    sc = new Scanner(System.in);
                                    makanan = sc.nextLine();
                                    System.out.print("Masukkan Harga Baru = ");
                                    hrg = sc.nextInt();

                                    mkn.setNamaMakanan(makanan, posisi);
                                    mkn.setHargaMakanan(hrg, posisi);
                                    System.out.println("Menu Berhasil dirubah..");
                                } else {
                                    System.out.println("Menu Tidak ditemukan..");
                                }
                                break;
                            case 4:
                                break;
                        }
                    } while (pilih2 != 4);
                    break;
                case 6:
                    System.out.println("Terima Kasih..");
                    break;
            }
        } while (pilih != 6);
    }
}