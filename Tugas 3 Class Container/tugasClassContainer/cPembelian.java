package tugasClassContainer;

public class cPembelian {
    private cPembeli pembeli;
    private cMakanan makanan[]; //array of object
    private int jmkn, maksmkn, total;

    cPembelian(int maks) {
        maksmkn = maks;
        makanan = new cMakanan[maksmkn];
        jmkn = 0;
        total = 0;
    }

    public void isiPembeli(cPembeli p) {
        pembeli = new cPembeli(p.getNama());
        System.out.println("Isi pembeli sukses..");
    }
    public void tambahMakanan(cMakanan m) {
        if (jmkn >= maksmkn) {
            System.out.println("Keranjang penuh!");
        } else {
            makanan[jmkn] = new cMakanan(m.getNama(), m.getHarga());
            jmkn++;
            System.out.println("Penambahan sukses..");
        }
    }
    public void lihatMakanan() {
        if (pembeli != null) {
            System.out.println(pembeli.toString());
        } else {
            System.out.println("Pembeli belum ada!");
        }
        System.out.println("Daftar Makanan");
        if (jmkn <= 0) {
            System.out.println("Keranjang kosong!");
        } else {
            for (int i = 0; i < jmkn; i++) {
                System.out.println((i + 1) + ". " + makanan[i].toString());
            }
        }
    }
    public void hapusMakanan(String hapus) {
        if (jmkn <= 0) {
            System.out.println("Keranjang kosong!");
        } else {
            //temukan yg akan dihapus
            //lakukan penghapusan
            boolean ada = false;

            for (int i = 0; i < jmkn; i++) {
                if (hapus.equalsIgnoreCase(makanan[i].getNama())) {
                    ada = true;
                    makanan[i] = null;
                    //penggeseran elemen array yg di belakang --> maju
                    for (int j = i; j < jmkn; j++) {
                        if (j == jmkn-1) {
                            makanan[j] = null;
                        } else {
                            makanan[j] = makanan[j + 1]; //geser maju
                        }
                    }
                    jmkn--;
                    System.out.println("Penghapusan sukses..");
                    break;
                }
            }

            if (ada == false) {
                System.out.println("Makanan tidak ada!");
            }
        }
    }
}