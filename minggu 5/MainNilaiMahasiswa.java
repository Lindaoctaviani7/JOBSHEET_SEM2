public class MainNilaiMahasiswa {
    public static void main(String[] args) {
        NilaiMahasiswa[] arrayOfNilaiMahasiswa = {
            new NilaiMahasiswa("Ahmad", 78, 82),
            new NilaiMahasiswa("Budi", 85, 88),
            new NilaiMahasiswa("Cindy", 90, 87),
            new NilaiMahasiswa("Dian", 76, 79),
            new NilaiMahasiswa("Eko", 92, 95),
            new NilaiMahasiswa("Fajar", 88, 85),
            new NilaiMahasiswa("Gina", 80, 83),
            new NilaiMahasiswa("Hadi", 82, 84)
        };

        int jumlah = arrayOfNilaiMahasiswa.length;
        int[] uts = new int[jumlah];
        int[] uas = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            uts[i] = arrayOfNilaiMahasiswa[i].uts;
            uas[i] = arrayOfNilaiMahasiswa[i].uas;
        }

        int nilaiMaxUTS = AnalisaNilai.MaxUTS(uts, 0, jumlah - 1);
        int nilaiMinUTS = AnalisaNilai.MinUTS(uts, 0, jumlah - 1);

        double rataRataUAS = AnalisaNilai.hitungRataUAS(uas);

        System.out.println("Nilai UTS Tertinggi : " + nilaiMaxUTS);
        System.out.println("Nilai UTS Terendah  : " + nilaiMinUTS);
        System.out.println("Rata-rata Nilai UAS : " + rataRataUAS);
    }
}
