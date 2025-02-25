import java.util.Scanner;
public class mataKuliahDemo15 {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);
        mataKuliah15[] arrayOfmataKuliah15 = new mataKuliah15[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for(int i=0; i<3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" +(i+1));
            System.out.print("Kode: ");
            kode = sc15.nextLine();
            System.out.print("Nama: ");
            nama = sc15.nextLine();
            System.out.print("Sks: ");
            dummy = sc15.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam: ");
            dummy = sc15.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("------------------------------");

            arrayOfmataKuliah15[i] = new mataKuliah15(kode, nama, sks, jumlahJam);
        }
    }
}
