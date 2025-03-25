import java.util.Scanner;

public class MahasiswaDemo15 {
    public static void main(String[] args) {
        MahasiswaBerprestasi15 list = new MahasiswaBerprestasi15(1000);
        Scanner sc15 = new Scanner(System.in);
        System.out.print("Masukkan jumlah Mahasiswa: ");
        int jumMhs=sc15.nextInt();
        sc15.nextLine();

        for(int i=0; i<jumMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("NIM: ");
            String nim = sc15.nextLine();
            System.out.print("Nama: ");
            String nama = sc15.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc15.nextLine();
            System.out.print("IPK: ");
            String ip = sc15.nextLine();
            double ipk = Double.parseDouble(ip);
            System.out.println("------------------------------------------");
            list.tambah(new Mahasiswa15(nim, nama, kelas, ipk));
        }
        list.tampil();
        //melakukan pencarian data binary
        System.out.println("------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("------------------------------------------");
        System.out.println("Masukkan IPK mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc15.nextDouble();
        System.out.println("------------------------------------------");
        System.out.println("Menggunakan binary search");
        System.out.println("------------------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

        System.out.println("------------------------------------------");
        System.out.println("Menggunakan sequential searching");
        System.out.println("------------------------------------------");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
    }
}































        /*Mahasiswa15 m1 = new Mahasiswa15("123", "Zidan", "2A", 3.2);
        Mahasiswa15 m2 = new Mahasiswa15("124", "Ayu", "2A", 3.5);
        Mahasiswa15 m3 = new Mahasiswa15("125", "Sofi", "2A", 3.1);
        Mahasiswa15 m4 = new Mahasiswa15("126", "Sita", "2A", 3.9);
        Mahasiswa15 m5 = new Mahasiswa15("127", "Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();*/

        /*System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DESC)");
        list.insertionSortDesc();
        list.tampil();
    } */

