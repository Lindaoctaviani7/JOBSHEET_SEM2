import java.util.Scanner;
public class dosenDemo15 {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);
        String kode, nama;
        String jenisKelamin;
        int usia, jumlahData;
        System.out.print("Masukkan jumlah data: ");
        jumlahData = sc15.nextInt();
        sc15.nextLine();
        dosen15[] arrayOfDosen15 = new dosen15[jumlahData];

        for(int i=0 ; i<arrayOfDosen15.length ; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i+1));
            System.out.print("Kode: ");
            kode = sc15.nextLine();
            System.out.print("Nama: ");
            nama = sc15.nextLine();
            System.out.println("True  = Perempuan");
            System.out.println("False = Laki-laki");
            System.out.print("Jenis Kelamin: ");
            jenisKelamin = sc15.nextLine();
            System.out.print("Usia: ");
            usia = sc15.nextInt();
            System.out.println("--------------------------------");
            sc15.nextLine();

            arrayOfDosen15[i] = new dosen15(kode, nama, jenisKelamin, usia);
        }
        System.out.println("\nData Dosen:");
        for (dosen15 dosen : arrayOfDosen15) {
            System.out.println("Kode: " + dosen.kode);
            System.out.println("Nama: " + dosen.nama);
            System.out.println("Jenis Kelamin: " + dosen.jenisKelamin);
            System.out.println("Usia: " + dosen.usia);
            System.out.println("----------------------");
        }
    }
}