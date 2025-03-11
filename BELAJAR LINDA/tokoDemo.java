import java.util.Scanner;
public class tokoDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String idTransaksi = null, namaPelanggan = null, namaBarang = null;
        double hargaBarang = 0;
        int jumlah = 0, jumlahData = 0;
        System.out.println("Masukkan jumlah data Transaksi: ");
        jumlahData = sc.nextInt();
        sc.nextLine();
        toko[] arrayOfToko15 = new toko[jumlahData];

        for(int i = 0; i<jumlahData; i++ ) {
            System.out.println("Masukkan data transaksi ke-" + (i+1));
            System.out.println("Id Transaksi: ");
            idTransaksi = sc.nextLine();
            
            arrayOfToko15[i] = new toko(idTransaksi, namaPelanggan, namaBarang, hargaBarang, jumlah);
        
        }   
    }
}
