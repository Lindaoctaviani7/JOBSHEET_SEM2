import java.util.Scanner;

public class suratDemo15 {
    public static void main(String[] args) {
        stackSurat15 stackSurat = new stackSurat15(10); 
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n==== Menu Surat Izin ====");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat berdasarkan Nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.nextLine().charAt(0);
                    System.out.print("Durasi Izin (hari): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();
                    surat15 surat = new surat15(id, nama, kelas, jenis, durasi);
                    stackSurat.push(surat);
                    break;

                case 2:
                    surat15 suratDiproses = stackSurat.pop();
                    if (suratDiproses != null) {
                        System.out.println("Surat dari " + suratDiproses.namaMahasiswa + " telah diproses.");
                    }
                    break;

                case 3:
                    surat15 suratTerakhir = stackSurat.peek();
                    if (suratTerakhir != null) {
                        System.out.println("Surat Terakhir:");
                        System.out.println("ID: " + suratTerakhir.idSurat + ", Nama: " + suratTerakhir.namaMahasiswa);
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cariNama = sc.nextLine();
                    stackSurat.cariSurat(cariNama);
                    break;

                case 5:
                    System.out.println("Terima kasih telah menggunakan sistem surat izin!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 5);

        sc.close();
    }
}
