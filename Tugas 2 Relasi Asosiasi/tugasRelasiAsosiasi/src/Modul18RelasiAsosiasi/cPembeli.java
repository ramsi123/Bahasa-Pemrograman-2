package Modul18RelasiAsosiasi;

public class cPembeli {
    private String nama;
    private String alamat;
    private cMakanan makanan; //implementasi relasi asosiasi

    public void beliMakanan(cMakanan m) {
        makanan = m;
        System.out.println("Pembelian sukses...");
    }
    public void lihatMakanan() {
        if (makanan != null) {
            System.out.println(nama + " membeli " + makanan.toString());
        } else {
            System.out.println("Belum ada makanan!");
        }
    }
    public void ubahMakanan(cMakanan m) {
        makanan = m;
        System.out.println("Pengubahan sukses...");
    }
    public void hapusMakanan() {
        makanan = null;
        System.out.println("Penghapusan sukses...");
    }

    cPembeli(String n, String a) {
        nama = n;
        alamat = a;
        System.out.println("Object " + nama + " dibuat..");
    }

    //setter
    public void setNama(String n) {
        nama = n;
    }
    public void setAlamat(String a) {
        alamat = a;
    }

    //getter
    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }

    //toString
    public String toString() {
        return nama + " [" + alamat + "]";
    }
}