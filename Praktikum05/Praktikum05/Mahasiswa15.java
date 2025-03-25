public class Mahasiswa15 {
    public static Mahasiswa15 temp;
    String nim;
    String nama;
    String kelas;
    double ipk;

    //konstruktor default
    Mahasiswa15(){
    }

    //konstruktor berparameter(dibuat ada yang nama var parameter inputnya sama ada yang tidak)
    Mahasiswa15(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("Nim: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }
}
