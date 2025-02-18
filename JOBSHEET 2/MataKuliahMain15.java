public class MataKuliahMain15 {
    public static void main(String[] args) {
        MataKuliah15 mkm1 = new MataKuliah15();
        mkm1.kodeMK = "ALSD";
        mkm1.nama = "Algoritma dan Struktur Data";
        mkm1.sks = 3;
        mkm1.jumlahJam = 4;

        mkm1.tampilkanInformasi();
        mkm1.ubahSKS(2);
        mkm1.tambahJam(2);
        mkm1.kurangiJam(2);
        mkm1.tampilkanInformasi();

    }

}
