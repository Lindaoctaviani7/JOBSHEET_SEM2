import java.util.Scanner;

public class KrsMain15 {

    public static void menu() {
        System.out.println("\n--- Sistem Antrian Persetujuan KRS ---");
        System.out.println("1. Tambah Mahasiswa ke Antrian");
        System.out.println("2. Proses KRS (Panggil 2 Mahasiswa)");
        System.out.println("3. Tampilkan Semua Antrian");
        System.out.println("4. Tampilkan 2 Antrian Terdepan");
        System.out.println("5. Tampilkan Antrian Paling Akhir");
        System.out.println("6. Cek Jumlah Antrian Saat Ini");
        System.out.println("7. Cek Jumlah Mahasiswa Sudah Proses KRS");
        System.out.println("8. Cek Jumlah Mahasiswa Belum Proses (di Antrian)");
        System.out.println("9. Kosongkan Semua Antrian Saat Ini");
        System.out.println("0. Keluar");
        System.out.println("--------------------------------------");
        System.out.print("Pilih Opsi: ");
    }

    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in); 
        AntrianKRS15 antrianKrs = new AntrianKRS15();
        int pilihan;

        do {
            menu(); 
            while (!sc15.hasNextInt()) {
                System.out.println("Input tidak valid. Masukkan angka menu.");
                System.out.print("Pilih Opsi: ");
                sc15.next(); 
            }
            pilihan = sc15.nextInt(); 
            sc15.nextLine(); 
            
            switch (pilihan) {
                case 1:
                    System.out.println("--- Tambah Mahasiswa ---");
                    System.out.print("NIM   : "); String nim = sc15.nextLine();
                    System.out.print("Nama  : "); String nama = sc15.nextLine();
                    System.out.print("Prodi : "); String prodi = sc15.nextLine();
                    System.out.print("Kelas : "); String kelas = sc15.nextLine();
                    Mahasiswa15 mhsBaru = new Mahasiswa15(nim, nama, prodi, kelas); 
                    antrianKrs.tambahAntrian(mhsBaru); 
                    break;
                case 2:
                    antrianKrs.prosesKRS(); 
                    break;
                case 3:
                    antrianKrs.tampilkanSemua();
                    break;
                case 4:
                    antrianKrs.tampilkanDuaTerdepan();
                    break;
                case 5:
                    antrianKrs.tampilkanPalingAkhir(); 
                    break;
                case 6:
                    System.out.println("Jumlah mahasiswa dalam antrian saat ini: " + antrianKrs.getJumlahAntrian());
                    break;
                case 7:
                     System.out.println("Jumlah mahasiswa yang sudah diproses KRS (total oleh DPA): " + antrianKrs.getJumlahSudahProses());
                    break;
                case 8:
                    System.out.println("Jumlah mahasiswa yang belum diproses (menunggu di antrian): " + antrianKrs.getJumlahBelumProses());
                    break;
                 case 9:
                    antrianKrs.clear(); 
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem antrian KRS.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

        } while (pilihan != 0); 
        sc15.close();
    }
}
