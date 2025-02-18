public class MahasiswaMain15 {
    public static void main(String[] args) {
        Mahasiswa15 mhs1 = new Mahasiswa15();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "244107020002";
        mhs1.kelas = "TI 1A";
        mhs1.ipk = 3.56;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("TI 1I");
        mhs1.updateIpk(3.90);
        mhs1.tampilkanInformasi();

        Mahasiswa15 mhs2 = new Mahasiswa15("Annisa Nabila","2141720160",3.25,"TI 2L");
        mhs2.updateIpk(3.60);
        mhs2.tampilkanInformasi();
    }

}