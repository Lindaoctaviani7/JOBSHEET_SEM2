public class Mahasiswa1315 {
    String nim;
    String nama;
    String prodi;

    public Mahasiswa1315(String nim, String nama, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }

    public void tampilMahasiswa1315() {
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Prodi: " + prodi);
    }
}
