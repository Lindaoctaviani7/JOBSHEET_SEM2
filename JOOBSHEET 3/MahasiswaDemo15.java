public class MahasiswaDemo15 {
    public static void main(String[] args) {
        Mahasiswa15[] arrayofMahasiswa = new Mahasiswa15[3];
        arrayofMahasiswa[0] = new Mahasiswa15();
        arrayofMahasiswa[0].nim = "244107060033";
        arrayofMahasiswa[0].nama = "AGNES TITANIA KINANTI";
        arrayofMahasiswa[0].kelas = "SIB-1E";
        arrayofMahasiswa[0].ipk = (float) 3.75;

        arrayofMahasiswa[1] = new Mahasiswa15();
        arrayofMahasiswa[1].nim = "2341720172";
        arrayofMahasiswa[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayofMahasiswa[1].kelas = "TI-2A";
        arrayofMahasiswa[1].ipk = (float) 3.36;

        arrayofMahasiswa[2] = new Mahasiswa15();
        arrayofMahasiswa[2].nim = "244107023006";
        arrayofMahasiswa[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayofMahasiswa[2].kelas = "TI-2E";
        arrayofMahasiswa[2].ipk = (float) 3.80;

        System.out.println("NIM : " + arrayofMahasiswa[0].nim);
        System.out.println("Nama : " + arrayofMahasiswa[0].nama);
        System.out.println("Kelas : " + arrayofMahasiswa[0].kelas);
        System.out.println("IPK : " + arrayofMahasiswa[0].ipk);
        System.out.println("-----------------------------------");
        System.out.println("NIM : " + arrayofMahasiswa[1].nim);
        System.out.println("Nama : " + arrayofMahasiswa[1].nama);
        System.out.println("Kelas : " + arrayofMahasiswa[1].kelas);
        System.out.println("IPK : " + arrayofMahasiswa[1].ipk);
        System.out.println("-----------------------------------");
        System.out.println("NIM : " + arrayofMahasiswa[2].nim);
        System.out.println("Nama : " + arrayofMahasiswa[2].nama);
        System.out.println("Kelas : " + arrayofMahasiswa[2].kelas);
        System.out.println("IPK : " + arrayofMahasiswa[2].ipk);
        System.out.println("-----------------------------------");
    }
}