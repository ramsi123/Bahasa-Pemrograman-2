package tugasClassContainer;

public class cMakanan {
    private String nama;
    private int harga;

    cMakanan(String n, int h) {
        nama = n;
        harga = h;
        System.out.println("Objek " + nama + " dibuat..");
    }

    public void setNama(String n) {
        nama = n;
    }
    public void setHarga(int h) {
        harga = h;
    }

    public String getNama() {
        return nama;
    }
    public int getHarga() {
        return harga;
    }

    public String toString() {
        return "Menu: " + nama + " [" + harga + "]";
    }
}