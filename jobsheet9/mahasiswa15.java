public class mahasiswa15 {
    String nim;
    String nama;
    String kelas;
    int nilai;
    
    public mahasiswa15(String nim, String nama, String kelas, int nilai) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.nilai = nilai;
        nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;

    }

}