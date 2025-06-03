public class Mahasiswa1315 {
    String nim;
    String nama;
    String prodi;//atribut

    public Mahasiswa1315(String nim, String nama, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;//konstruktor
    }

    public void tampilMahasiswa1315() {//method
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Prodi: " + prodi);
    }
}
