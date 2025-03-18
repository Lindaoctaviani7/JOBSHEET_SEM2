import java.util.Scanner;

public class DosenDemo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen data = new DataDosen();
        System.out.println("==============================================");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting ASC (Usia) - Bubble Sort");
            System.out.println("4. Sorting DSC (Usia) - Selection Sort");
            System.out.println("5. Sorting DSC (Usia) - Insertion Sort");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();
            System.out.println("==============================================");

            if (menu == 1) {
                sc.nextLine();
                System.out.print("Kode Dosen: ");
                String kode = sc.nextLine();
                System.out.print("Nama Dosen: ");
                String nama = sc.nextLine();
                System.out.print("Jenis Kelamin (true = L, false = P): ");
                boolean jk = sc.nextBoolean();
                System.out.print("Usia: ");
                int usia = sc.nextInt();

                Dosen dsn = new Dosen(kode, nama, jk, usia);
                data.tambah(dsn);
                System.out.println("Data dosen berhasil ditambahkan.");
            } else if (menu == 2) {
                data.tampil();
            } else if (menu == 3) {
                data.SortingASC();
                data.tampil();
                System.out.println("Data berhasil diurutkan dari usia termuda ke tertua.");
            } else if (menu == 4) {
                data.sortingDSC();
                data.tampil();
                System.out.println("Data berhasil diurutkan dari usia tertua ke termuda (Selection Sort).");
            } else if (menu == 5) {
                data.insertionSort();
                data.tampil();
                System.out.println("Data berhasil diurutkan dari usia tertua ke termuda (Insertion Sort).");
            } else if (menu == 0) {
                System.out.println("Program selesai.");
                break;
            } else {
                System.out.println("Menu tidak valid!");
            }
        }
        sc.close();
    }
}
