import java.util.Scanner;

public class dataMataKuliah3 {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jmlMataKuliah = sc15.nextInt();
        sc15.nextLine();

        String[] namaMataKuliah = new String[jmlMataKuliah];
        int[] sks = new int[jmlMataKuliah];
        int[] semester = new int[jmlMataKuliah];
        String[] hariKuliah = new String[jmlMataKuliah];

        for (int i = 0; i < jmlMataKuliah; i++) {
            System.out.println("Mata Kuliah " + (i + 1) + ":");
            System.out.print("Nama Mata Kuliah: ");
            namaMataKuliah[i] = sc15.nextLine();
            System.out.print("SKS: ");
            sks[i] = sc15.nextInt();
            System.out.print("Semester: ");
            semester[i] = sc15.nextInt();
            System.out.print("Hari Kuliah: ");
            sc15.nextLine(); 
            hariKuliah[i] = sc15.nextLine();
        }

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal kuliah berdasarkan hari tertentu");
            System.out.println("3. Tampilkan jadwal kuliah berdasarkan semester tertentu");
            System.out.println("4. Cari mata kuliah berdasarkan nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi (1-5): ");
            int pilihan = sc15.nextInt();
            sc15.nextLine();

            if (pilihan == 1) {
                System.out.println("\nJadwal Kuliah:");
                for (int i = 0; i < jmlMataKuliah; i++) {
                    System.out.println("Mata Kuliah: " + namaMataKuliah[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hariKuliah[i]);
                }
            } else if (pilihan == 2) {
                System.out.print("Masukkan hari kuliah yang ingin ditampilkan: ");
                String hari = sc15.nextLine();
                System.out.println("\nJadwal Kuliah pada hari " + hari + ":");
                for (int i = 0; i < jmlMataKuliah; i++) {
                    if (hariKuliah[i].equalsIgnoreCase(hari)) {
                        System.out.println("Mata Kuliah: " + namaMataKuliah[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i]);
                    }
                }
            } else if (pilihan == 3) {
                System.out.print("Masukkan semester yang ingin ditampilkan: ");
                int sem = sc15.nextInt();
                System.out.println("\nJadwal Kuliah pada Semester " + sem + ":");
                for (int i = 0; i < jmlMataKuliah; i++) {
                    if (semester[i] == sem) {
                        System.out.println("Mata Kuliah: " + namaMataKuliah[i] + ", SKS: " + sks[i] + ", Hari: " + hariKuliah[i]);
                    }
                }
            } else if (pilihan == 4) {
                System.out.print("Masukkan nama mata kuliah yang dicari: ");
                String cariMataKuliah = sc15.nextLine();
                boolean ditemukan = false;
                for (int i = 0; i < jmlMataKuliah; i++) {
                    if (namaMataKuliah[i].equalsIgnoreCase(cariMataKuliah)) {
                        System.out.println("Mata Kuliah Ditemukan: " + namaMataKuliah[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hariKuliah[i]);
                        ditemukan = true;
                        break;
                    }
                }
                if (!ditemukan) {
                    System.out.println("Mata kuliah tidak ditemukan.");
                }
            } else if (pilihan == 5) {
                System.out.println("Terima kasih! Program selesai.");
                sc15.close();
                return;
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}