import java.util.Scanner;

public class cafeDemo15 {
    Scanner sc15 = new Scanner(System.in);
    String namaCafe, lokasi, menuAndalan;
    int jmlHadir;

    public void tampilkanInfo() {
        System.out.println("==== Informasi Cafe ====");
        System.out.println("Nama Café  : " + namaCafe);
        System.out.println("Lokasi     : " + lokasi);
        System.out.println("Jumlah Meja: " + jmlHadir);
        System.out.println("Menu Andalan: " + menuAndalan);
        System.out.println("=======================");
    }

    // Method reservasi meja
    public void reservasiMeja(int jumlah) {
        if (jumlah > jmlHadir) {
            System.out.println("Maaf, tidak cukup meja untuk reservasi.");
        } else {
            jmlHadir -= jumlah;
            System.out.println(jumlah + " meja berhasil dipesan.");
            System.out.println("Sisa meja tersedia: " + jmlHadir);
        }
    }

    // Method mengganti menu andalan
    public void gantiMenuAndalan(String menuBaru) {
        menuAndalan = menuBaru;
        System.out.println("Menu andalan telah diganti menjadi: " + menuAndalan);
    }

       public static void main(String[] args) {
        //objek cafe dengan atribut baru
        cafe15 cafe1 = new cafe15("Kopi Senja", "Jakarta", 10, "Espresso");

        // Menampilkan informasi awal
        cafe1.tampilkanInfo();

        // Melakukan reservasi meja
        cafe1.reservasiMeja(3);

        // Menampilkan informasi setelah reservasi
        cafe1.tampilkanInfo();

        // Mengganti menu andalan
        cafe1.gantiMenuAndalan("Cappuccino");

        // Menampilkan informasi setelah mengganti menu
        cafe1.tampilkanInfo();
    }
}
