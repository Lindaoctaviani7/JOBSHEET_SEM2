import java.util.Scanner;

public class ProsesSiakad1315 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa1315[] mhs = {
            new Mahasiswa1315("22001", "Ali Rahman", "Informatika"),
            new Mahasiswa1315("22002", "Budi Santoso", "Informatika"),
            new Mahasiswa1315("22003", "Citra Dewi", "Informatika")
        };

        Matkul1315[] mk = {
            new Matkul1315("MK001", "Struktur Data", 3),
            new Matkul1315("MK002", "Basis Data", 3),
            new Matkul1315("MK003", "Desain Web", 2)
        };

        Penilaian1315[] penilaians = {
            new Penilaian1315(mhs[0], mk[0], 80, 85, 90, 0),
            new Penilaian1315(mhs[0], mk[1], 60, 75, 70, 0),
            new Penilaian1315(mhs[1], mk[0], 75, 70, 80, 0),
            new Penilaian1315(mhs[2], mk[1], 85, 90, 95, 0),
            new Penilaian1315(mhs[2], mk[2], 80, 90, 65, 0)
        };

        int pilihan = -1;
        while (pilihan != 0) {
            System.out.println("\n=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Penilaian Berdasarkan Nilai Akhir (Selection Descending)");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM (Linear Search)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) {
                for (Mahasiswa1315 m : mhs) {
                    m.tampilMahasiswa1315();
                }
            } else if (pilihan == 2) {
                for (Matkul1315 mkul : mk) {
                    mkul.tampilMatakuliah();
                }
            } else if (pilihan == 3) {
                for (Penilaian1315 p : penilaians) {
                    p.tampilPenilaian();
                }
            } else if (pilihan == 4) {
                // Selection Sort Descending
                for (int i = 0; i < penilaians.length - 1; i++) {
                    int maxIdx = i;
                    for (int j = i + 1; j < penilaians.length; j++) {
                        if (penilaians[j].nilaiAkhir > penilaians[maxIdx].nilaiAkhir) {
                            maxIdx = j;
                        }
                    }
                    Penilaian1315 temp = penilaians[i];
                    penilaians[i] = penilaians[maxIdx];
                    penilaians[maxIdx] = temp;
                }
                System.out.println("Data Penilaian Setelah Diurutkan:");
                for (Penilaian1315 p : penilaians) {
                    p.tampilPenilaian();
                }
            } else if (pilihan == 5) {
                //Linear Search
                System.out.print("Masukkan NIM mahasiswa yang dicari: ");
                String cariNIM = sc.nextLine();
                boolean ditemukan = false;
                for (Mahasiswa1315 m : mhs) {
                    if (m.nim.equals(cariNIM)) {
                        System.out.println("Mahasiswa Ditemukan: ");
                        m.tampilMahasiswa1315();
                        System.out.println("Daftar Nilai:");
                        for (Penilaian1315 p : penilaians) {
                            if (p.Mahasiswa.nim.equals(cariNIM)) {
                                p.tampilPenilaian();
                            }
                        }
                        ditemukan = true;
                        break;
                    }
                }
                if (!ditemukan) {
                    System.out.println("Mahasiswa dengan NIM " + cariNIM + " tidak ditemukan.");
                }
            } else if (pilihan == 0) {
                System.out.println("Keluar dari program.");
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }

        sc.close();
    }
}
