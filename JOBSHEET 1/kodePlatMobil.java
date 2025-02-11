import java.util.Scanner;

public class kodePlatMobil {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char inputKode = sc15.next().charAt(0);
        String kota;
        
        switch (Character.toUpperCase(inputKode)) {
            case 'A':
                kota = "BANTEN";
                break;
            case 'B':
                kota = "JAKARTA";
                break;
            case 'D':
                kota = "BANDUNG";
                break;
            case 'E':
                kota = "CIREBON";
                break;
            case 'F':
                kota = "BOGOR";
                break;
            case 'G':
                kota = "PEKALONGAN";
                break;
            case 'H':
                kota = "SEMARANG";
                break;
            case 'L':
                kota = "SURABAYA";
                break;
            case 'N':
                kota = "MALANG";
                break;
            case 'T':
                kota = "TEGAL";
                break;
            default:
                kota = null; 
                break;
        }

        if (kota != null) {
            System.out.println("Kota: " + kota);
        } else {
            System.out.println("Kode plat tidak ditemukan.");
        }

        sc15.close(); 
    }
}