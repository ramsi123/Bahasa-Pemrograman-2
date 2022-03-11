package Modul18RelasiAsosiasi;

public class cMakanan {
    private String nama;
    private int harga;

    cMakanan(String n, int h) {
        nama = n;
        harga = h;
        System.out.println("Object " + nama + " dibuat..");
    }

    //setter
    public void setHarga(int h) {
        harga = h;
    }

    //getter
    public int getHarga() {
        return harga;
    }

    //toString
    public String toString() {
        return nama + " [" + harga + "]";
    }
}