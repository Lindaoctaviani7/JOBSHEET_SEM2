import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        // Deklarasi Array 
        String[] matkul = {
            "Pancasila", 
            "Konsep Teknologi Informasi", 
            "Critical Thinking dan Problem Solving", 
            "Matematika Dasar", 
            "Bahasa Inggris", 
            "Dasar Pemograman", 
            "Praktikum Dasar Pemograman", 
            "Kesehatan dan Keselamatan Kerja"
        };
        
        double[][] nilaiMatkul = new double[matkul.length][2];
        String[] nilaiHuruf = new String[matkul.length];
        double[] sks = new double[matkul.length];

        // Input nilai menggunakan do-while
        int i = 0;
        do {
            System.out.print("Masukkan nilai angka untuk MK " + matkul[i] + ": ");
            nilaiMatkul[i][0] = sc15.nextDouble();
            System.out.print("Masukkan bobot sks: ");
            sks[i] = sc15.nextDouble();

            // Nilai huruf menggunakan switch-case
            switch ((int) nilaiMatkul[i][0] / 10) {
                case 10: // Nilai 100
                case 9:  // Nilai 90-99
                    nilaiHuruf[i] = "A";
                    break;
                case 8:  // Nilai 80-89
                    nilaiHuruf[i] = "B+";
                    break;
                case 7:  // Nilai 70-79
                    nilaiHuruf[i] = "B";
                    break;
                case 6:  // Nilai 60-69
                    nilaiHuruf[i] = "C+";
                    break;
                case 5:  // Nilai 50-59
                    nilaiHuruf[i] = "C";
                    break;
                case 4:  // Nilai 40-49
                    nilaiHuruf[i] = "D";
                    break;
                default: // Nilai < 40
                    nilaiHuruf[i] = "E";
                    break;
            }
            i++; // Increment i
        } while (i < matkul.length); // Kondisi untuk melanjutkan loop

        // Bobot nilai menggunakan switch-case
        for (int j = 0; j < matkul.length; j++) {
            switch (nilaiHuruf[j]) {
                case "A":
                    nilaiMatkul[j][1] = 4;
                    break;
                case "B+":
                    nilaiMatkul[j][1] = 3.5;
                    break;
                case "B":
                    nilaiMatkul[j][1] = 3;
                    break;
                case "C+":
                    nilaiMatkul[j][1] = 2.5;
                    break;
                case "C":
                    nilaiMatkul[j][1] = 2;
                    break;
                case "D":
                    nilaiMatkul[j][1] = 1;
                    break;
                case "E":
                    nilaiMatkul[j][1] = 0;
                    break;
            }
        }

        // Tabel hasil konversi nilai
        System.out.println("====================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("====================");
        System.out.printf(String.format("%-50s", "Mk"));
        System.out.println("Nilai Angka\t" + "Nilai Huruf\t" + "Bobot Nilai\t");
        for (int j = 0; j < nilaiMatkul.length; j++) {
            System.out.printf(String.format("%-50s", matkul[j]));
            System.out.println(nilaiMatkul[j][0] + "\t\t" + nilaiHuruf[j] + "\t\t" + nilaiMatkul[j][1]);
        }

        // Hitung IP Semester
        double nilaiTotal = 0;
        double keseluruhanSKS = 0;
        for (int j = 0; j < matkul.length; j++) {
            nilaiTotal += (nilaiMatkul[j][1] * sks[j]);
            keseluruhanSKS += sks[j];
        }

        double IP = nilaiTotal / keseluruhanSKS;
        System.out.println("IP : " + String.format("%.2f", IP));
        
        sc15.close();
    }
}