public class Mahasiswa15 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa15() {
    }
    public Mahasiswa15(){
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("nim: " + nim);
        System.out.println("kelas: " + kelas);
        System.out.println("ipk: " + ipk);

    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;

    }

    void updateIpk(double ipkBaru) {
        ipk = ipkBaru;

    }

    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        }
        else if (ipk >= 3.0) {
            return "Kinerja baik";
        }
        else if (ipk >= 2.0) {
            return "Kinerja cukup";
        }
        else {
            return "Kinerja kurang";
        }
    }
}