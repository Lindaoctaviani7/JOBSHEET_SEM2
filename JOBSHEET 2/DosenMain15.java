public class DosenMain15 {
    public static void main(String[] args) {
        Dosen15 ds1 = new Dosen15();
        ds1.idDosen = "MA712";
        ds1.nama = "Mungki Astiningrum ST., M.Kom";
        ds1.statusAktif = true;
        ds1.tahunBergabung = 2005;
        ds1.bidangKeahlian = "algoritma dan basis data";

        ds1.tampilkanInformasi();
        int b = ds1.hitungMasaKerja(2024);
        System.out.println("Masa Kerja: " + b + " tahun");
        ds1.ubahKeahlian("daspro");
        ds1.tampilkanInformasi();
    }
}
