public class Penilaian1315 {
    Mahasiswa1315 Mahasiswa;//kesimpulnnya mereka berelasi karena ingin mengambil atribut/ memanggil atribut yang ada di mahasiswa dan matkul
    Matkul1315 MataKuliah;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;

    public Penilaian1315(Mahasiswa1315 Mahasiswa, Matkul1315 MataKuliah, double nilaiTugas, double nilaiUTS, double nilaiUAS, double nilaiAkhir) {
        this.Mahasiswa = Mahasiswa;
        this.MataKuliah = MataKuliah;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
        this.nilaiAkhir = nilaiAkhir;//konstruktor untuk menambah data ke class
        hitungNilaiAkhir();//biar setiap kali data baru ditambahkan nilai akhirnya langsung keitung
        
    }

    void hitungNilaiAkhir() {
        this.nilaiAkhir = (0.3 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
    }

    public void tampilPenilaian() {
        System.out.println(" Nama: " + Mahasiswa.nama +
                " | Matkul: " + MataKuliah.namaMK + " | Nilai Akhir: " + nilaiAkhir);
    }
}

