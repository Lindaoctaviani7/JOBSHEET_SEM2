public class MainNilaiMahasiswa {
    public static void main(String[] args) {
        int[] nilaiUTS = {78, 85, 90, 76, 92, 88, 80, 82};
        int[] nilaiUAS = {82, 88, 87, 79, 95, 85, 83, 84};

        int maxUTS = NilaiMahasiswa.MaxDC(nilaiUTS, 0, nilaiUTS.length - 1);
        System.out.println("Nilai UTS tertinggi: " + maxUTS);

        int minUTS = NilaiMahasiswa.MinDC(nilaiUTS, 0, nilaiUTS.length - 1);
        System.out.println("Nilai UTS terendah: " + minUTS);

        double rataUAS = NilaiMahasiswa.hitungRataBF(nilaiUAS);
        System.out.println("Rata-rata nilai UAS: " + rataUAS);
    }
}

/*import java.util.Scanner;

public class MainNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc15.nextInt();

        int[] nilaiUTS = NilaiMahasiswa.inputNilai(jmlMhs, "nilai UTS");
        
        int[] nilaiUAS = NilaiMahasiswa.inputNilai(jmlMhs, "nilai UAS");

        int maxUTS = NilaiMahasiswa.cariMaxDC(nilaiUTS, 0, nilaiUTS.length - 1);
        System.out.println("\nNilai UTS tertinggi: " + maxUTS);

        int minUTS = NilaiMahasiswa.cariMinDC(nilaiUTS, 0, nilaiUTS.length - 1);
        System.out.println("Nilai UTS terendah: " + minUTS);

        double rataUAS = NilaiMahasiswa.hitungRataBruteForce(nilaiUAS);
        System.out.println("Rata-rata nilai UAS: " + rataUAS);

        sc15.close();
    }
}*/
