package Modul1.Codelab;

public class Codelab3 {
    public int perhitunganGaji(int jamKerja, int gajiperJam){
        int gajiTotal = jamKerja * gajiperJam;
        return gajiTotal;
    }

    public static void main(String[] args) {
        Codelab3 hitung = new Codelab3();

        int gajiTotal = hitung.perhitunganGaji(40,250000);
        System.out.println("Gaji karyawan dengan 40 jam kerja = " + gajiTotal);
    }
}
