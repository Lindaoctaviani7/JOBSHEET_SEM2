import java.util.Scanner;

public class AntrianVaksinasi15 {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);
        DoubleLinkedListQueue15 antrian = new DoubleLinkedListQueue15();
        int pilih;

        do {
            System.out.println("+++++++++++++++++++++++++++");
            System.out.println("DAFTAR PENERIMA VAKSIN");
            System.out.println("+++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Penerima Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("+++++++++++++++++++++++++++");
            System.out.print("Pilih menu: ");
            pilih = sc15.nextInt();
            sc15.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.println("---------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("---------------------------");
                    System.out.print("Masukkan Nama: ");
                    String nama = sc15.nextLine();
                    antrian.enqueue(nama);
                    break;

                case 2:
                    antrian.dequeue();
                    break;

                case 3:
                    antrian.printQueue();
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan vaksinasi.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 4);
    }
}
