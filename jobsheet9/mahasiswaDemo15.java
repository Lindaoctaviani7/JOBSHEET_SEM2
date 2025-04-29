import java.util.Scanner;
public class mahasiswaDemo15 {
    public static void main(String[] args) {
        stackTugasMahasiswa15 stack = new stackTugasMahasiswa15(5);
        Scanner sc15 = new Scanner(System.in);
        int pilih;

        do { 
            System.out.println("\nMenu: ");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.print("Pilih: ");
            pilih = sc15.nextInt();
            sc15.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc15.nextLine();
                    System.out.print("NIM: ");
                    String nim = sc15.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc15.nextLine();
                    mahasiswa15 mhs = new mahasiswa15(nim, nama, kelas, pilih);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    mahasiswa15 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = sc15.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Tugas %s berhasil %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    break;
                case 3:
                    mahasiswa15 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                    System.out.println("Lihat tugas terbawah");
                    stack.lihatTugasTerbawah();
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilih >= 1 && pilih <= 5);
    }
}
