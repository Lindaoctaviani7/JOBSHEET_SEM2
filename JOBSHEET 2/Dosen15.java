public class Dosen15 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilkanInformasi() {
        System.out.println("Masukkan id Dosen: " + idDosen);
        System.out.println("Nama Dosen: " + nama);
        System.out.print("Status Aktif: ");setStatusAktif(statusAktif);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        if (statusAktif == true) {
            System.out.println("Aktif");
        }
        else {
            System.out.println("Tidak aktif");
        }
    }

    int hitungMasaKerja(int tahunSekarang) {
        int a =0;
        a=tahunSekarang-tahunBergabung;
        return a;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }

}
