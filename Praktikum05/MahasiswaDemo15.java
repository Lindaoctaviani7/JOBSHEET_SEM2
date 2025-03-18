
public class MahasiswaDemo15 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int m = sc.nextInt();
        Mahasiswa15[] mhs = new Mahasiswa15[m];
        MahasiswaBerprestasi15 list = new MahasiswaBerprestasi15();
        for (int i = 0; i < m; i++) {
            System.out.print("NIM: ");
            String nim = sc.next();
            System.out.print("Nama: ");
            String nama = sc.next();
            System.out.print("Kelas: ");
            String kelas = sc.next();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            System.out.println("===========================");
            mhs[i] = new Mahasiswa15(nim, nama, kelas, ipk);
            list.tambah(mhs[i]);
        }*/
        MahasiswaBerprestasi15 list = new MahasiswaBerprestasi15();
        Mahasiswa15 m1 = new Mahasiswa15("123", "Zidan", "2A", 3.2);
        Mahasiswa15 m2 = new Mahasiswa15("124", "Ayu", "2A", 3.5);
        Mahasiswa15 m3 = new Mahasiswa15("125", "Sofi", "2A", 3.1);
        Mahasiswa15 m4 = new Mahasiswa15("126", "Sita", "2A", 3.9);
        Mahasiswa15 m5 = new Mahasiswa15("127", "Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DESC)");
        list.insertionSortDesc();
        list.tampil();
    } 
}
