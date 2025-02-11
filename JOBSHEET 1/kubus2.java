import java.util.Scanner;

public class kubus2 {
    static Scanner sc15 = new Scanner(System.in);
    public static void main(String[] args) {
        int choose;
        do {
            System.out.println("** MENU RUMUS PERHITUNGAN BANGUN RUANG KUBUS **");
            System.out.println("1. Menghitung Volume Kubus");
            System.out.println("2. Menghitung Luas Permukaan Kubus");
            System.out.println("3. Menghitung Keliling Kubus");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            choose = sc15.nextInt();
            sc15.nextLine();

            if (choose == 1) {
                volumeKubus();
            } else if (choose == 2) {
                luasPermukaanKubus();
            } else if (choose == 3) {
                kelilingKubus();
            } else if (choose == 4) {
                System.out.println("Terima kasih! Program selesai.");
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        } while (choose != 4);
    }

    static void volumeKubus() {
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = sc15.nextDouble();
        double volume = sisi * sisi * sisi;
        System.out.println("Volume Kubus: " + volume);
        System.out.println();
    }

    static void luasPermukaanKubus() {
        System.out.print("Masukkan panjang sisi kubus: ");
        double s = sc15.nextDouble();
        double luasPermukaan = 6 * s * s;
        System.out.println("Luas Permukaan Kubus: " + luasPermukaan);
        System.out.println();
    }

    static void kelilingKubus() {
        System.out.print("Masukkan panjang rusuk kubus: ");
        double r = sc15.nextDouble();
        double keliling = 12 * r;
        System.out.println("Keliling Kubus: " + keliling);
        System.out.println();
    }
}