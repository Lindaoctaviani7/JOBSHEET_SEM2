class MataKuliah15 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilkanInformasi() {
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Jumlah SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS berhasil diubah");
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam berhasil ditambahkan");
    }

    void kurangiJam(int jam) {
        if(jumlahJam < jam) {
            System.out.println("jumlah jam tidak dapat diperbarui, karena jam tidak mencukupi");
        }
        else {
            jumlahJam -= jam;
            System.out.println("jumlah jam berhasil diperbarui menjadi " + jumlahJam);
        }
        
    }
}