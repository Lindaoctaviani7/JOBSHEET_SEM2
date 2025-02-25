import java.util.Scanner;
public class mataKuliah15 {
    Scanner sc15 = new Scanner(System.in);
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public mataKuliah15(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    public mataKuliah15(){

    }
    void tambahData (){
        String dummy;
        System.out.print("Kode      : ");
        this.kode = sc15.nextLine(); 
        System.out.print("Nama      : ");
        this.nama = sc15.nextLine();
        System.out.print("SKS       : ");
        dummy = sc15.nextLine();
        this.sks = Integer.parseInt(dummy);
        System.out.print("Jumlah Jam: ");
        dummy = sc15.nextLine();
        this.jumlahJam=Integer.parseInt(dummy);
    }
    void cetakInfo(){
        System.out.println("Kode       : "+ kode);
        System.out.println("Nama       : "+ nama);
        System.out.println("SKS        : "+ sks);
        System.out.println("Jumlah Jam : "+ jumlahJam);
    }
}
