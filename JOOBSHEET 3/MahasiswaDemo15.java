import java.util.Scanner;

public class MahasiswaDemo15 {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);
        Mahasiswa15[] arrayofMahasiswa = new Mahasiswa15[3];
        String dummy;

        for(int i=0; i<3; i++) {
            arrayofMahasiswa[i] = new Mahasiswa15();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM : ");
            arrayofMahasiswa[i].nim = sc15.nextLine();
            System.out.print("Nama: ");
            arrayofMahasiswa[i].nama = sc15.nextLine();
            System.out.print("Kelas: ");
            arrayofMahasiswa[i].kelas = sc15.nextLine();
            System.out.print("IPK: ");
            dummy=sc15.nextLine();
            arrayofMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("------------------------------");
        }
        for(int i=0; i<3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
            System.out.println("NIM: " + arrayofMahasiswa[i].nim);
            System.out.println("Nama: " + arrayofMahasiswa[i].nama);
            System.out.println("Kelas: " + arrayofMahasiswa[i].kelas);
            System.out.println("IPK: " + arrayofMahasiswa[i].ipk);
            System.out.println("---------------------------------");
        }

    }
}