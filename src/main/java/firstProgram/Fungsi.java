package firstProgram;

import firstProgram.NamaKu;

public class Fungsi {
    public static void main (String[]args) {
        int x = 2;
        int y = 5;
        int z = 10;

        NamaKu.Norma();
        tambah(x,y);
        tambah(x,z);
        tambah(y,z);
        tambah(z,y);
    }

    public static int tambah (int a, int b) {
        int hasilTambah = a+b;
        System.out.println("Hasil tambah "+a+" dan "+b+" adalah " +hasilTambah);
        return hasilTambah;
    }
}
