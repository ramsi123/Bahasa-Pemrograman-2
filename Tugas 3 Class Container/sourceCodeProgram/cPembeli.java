package sourceCodeProgram;

public class cPembeli {
    private String nama;

    cPembeli(String n) {
        nama = n;
        System.out.println("Objek " + nama + " dibuat..");
    }

    public void setNama(String n) {
        nama = n;
    }

    public String getNama() {
        return nama;
    }

    public String toString() {
        return "Pembeli: " + nama;
    }
}