public class toko {
    public String idTransaksi;
    public String namaPelanggan;
    public String namaBarang;
    public double hargaBarang;
    public int jumlah;

    public toko(String idTransaksi, String namaPelanggan, String namaBarang, double hargaBarang, int jumlah) {
        this.idTransaksi = idTransaksi;
        this.namaPelanggan = namaPelanggan;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jumlah = jumlah;
        
    }

    public void tampilkanTransaksi() {
        System.out.println("Id Transaksi: " + idTransaksi);
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Barang: " + hargaBarang);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("================================");
    }
    
}
