import java.util.Scanner;

public class PemilihanNilai {
    public static void main(String[] args) {

        Scanner sc15 = new Scanner(System.in);
        int nilaiTugas, nilaiQuiz, nilaiUts, nilaiUas;
        double nilaiAkhir;
        String nilaiHuruf;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan nilai Tugas: ");
        nilaiTugas = sc15.nextInt();
        System.out.print("Masukkan nilai Quiz: ");
        nilaiQuiz = sc15.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUts = sc15.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUas = sc15.nextInt();
        System.out.println("==============================");
        System.out.println("==============================");
        if (nilaiTugas < 0 || nilaiTugas > 100 || nilaiQuiz < 0 || nilaiQuiz > 100 || nilaiUts < 0 || nilaiUts > 100 || nilaiUas < 0 || nilaiUas > 100) {
            System.out.println("Nilai tidak valid.");
            return;
        }

    
        nilaiAkhir = (nilaiTugas*0.2) + (nilaiQuiz*0.2) + (nilaiUts*0.3) + (nilaiUas*0.4);

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";

        }
        else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
    
        }
        else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
    
        }
        else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
    
        }
        else if(nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
    
        }
        else if(nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
    
        }
        else {
            nilaiHuruf = "E";
    
        }
        

        System.out.println("Nilai Akhir = " + nilaiAkhir);
        System.out.println("Nilai Huruf = " + nilaiHuruf);
        System.out.println((nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) ? "LULUS" : "TIDAK LULUS");
        System.out.println("===========================");
        System.out.println("===========================");
        
    }
}
