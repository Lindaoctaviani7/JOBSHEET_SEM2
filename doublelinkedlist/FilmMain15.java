import java.util.Scanner;

public class FilmMain15 {
    public static void main(String[] args) throws Exception {
        Scanner sc15 = new Scanner(System.in);
        DoubleLinkedFilm15 dll = new DoubleLinkedFilm15();
        int pilih;

        do {
            System.out.println("==================================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("==================================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-DESC");
            System.out.println("10. Keluar");
            System.out.println("==================================");
            System.out.print("Pilih menu: ");
            pilih = sc15.nextInt();
            sc15.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("\nMasukkan Data Film Posisi Awal");
                    System.out.print("ID Film: ");
                    int id1 = sc15.nextInt(); sc15.nextLine();
                    System.out.print("Judul Film: ");
                    String judul1 = sc15.nextLine();
                    System.out.print("Rating Film: ");
                    double rating1 = sc15.nextDouble();
                    dll.addFirst(id1, judul1, rating1);
                    break;
                case 2:
                    System.out.println("\nMasukkan Data Film Posisi Akhir");
                    System.out.print("ID Film: ");
                    int id2 = sc15.nextInt(); sc15.nextLine();
                    System.out.print("Judul Film: ");
                    String judul2 = sc15.nextLine();
                    System.out.print("Rating Film: ");
                    double rating2 = sc15.nextDouble();
                    dll.addLast(id2, judul2, rating2);
                    break;
                case 3:
                    System.out.println("\nMasukkan Data Film");
                    System.out.print("Urutan ke-: ");
                    int index = sc15.nextInt(); sc15.nextLine();
                    System.out.print("ID Film: ");
                    int id3 = sc15.nextInt(); sc15.nextLine();
                    System.out.print("Judul Film: ");
                    String judul3 = sc15.nextLine();
                    System.out.print("Rating Film: ");
                    double rating3 = sc15.nextDouble();
                    dll.addAtIndex(id3, judul3, rating3, index);
                    break;
                case 4:
                    dll.removeFirst();
                    break;
                case 5:
                    dll.removeLast();
                    break;
                case 6:
                    System.out.print("Hapus data di urutan ke-: ");
                    int indexHapus = sc15.nextInt();
                    dll.removeAt(indexHapus);
                    break;
                case 7:
                    dll.print();
                    break;
                case 8:
                    System.out.print("Masukkan ID Film: ");
                    int cari = sc15.nextInt();
                    dll.searchById(cari);
                    break;
                case 9:
                    dll.sortDescending();
                    break;
                case 10:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih != 10);
    }
}
