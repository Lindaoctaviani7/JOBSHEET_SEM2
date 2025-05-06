public class AntrianKRS15 {
    Mahasiswa15[] data; 
    int front;         
    int rear;           
    int size;           
    int max = 10; 
    int jumlahDilayani; 
    int MaxDilayaniDpa = 30; 

    public AntrianKRS15() {
        data = new Mahasiswa15[max]; 
        size = 0;                   
        front = 0;                  
        rear = -1;                  
        jumlahDilayani = 0;       
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == max;
    }
    public void clear() {
        if (!isEmpty()) {
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("Antrian KRS berhasil dikosongkan.");
        } else {
            System.out.println("Antrian KRS memang sudah kosong.");
        }
    }
    public void tambahAntrian(Mahasiswa15 mhs) {
        if (jumlahDilayani + size >= MaxDilayaniDpa) {
            System.out.println("Kapasitas total DPA (" + MaxDilayaniDpa + ") sudah tercapai/terpenuhi. Tidak bisa menambah antrian baru.");
            return; 
        }
        if (isFull()) {
            System.out.println("Antrian sedang penuh (maks " + max + "), tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs; 
        size++;           
        System.out.println(mhs.nama + " berhasil ditambahkan ke dalam antrian KRS.");
    }
    public void prosesKRS() {
        if (isEmpty()) {
            System.out.println("Antrian KRS kosong, tidak ada mahasiswa untuk diproses.");
            return;
        }

        System.out.println("Memproses KRS untuk mahasiswa:");
        System.out.println("NIM\tNAMA\tPRODI\tKELAS");
        int jumlahDiprosesKaliIni = 0;
        for (int i = 0; i < 2 && !isEmpty(); i++) {
            if (jumlahDilayani >= MaxDilayaniDpa) {
                System.out.println("Kapasitas DPA (" + MaxDilayaniDpa + ") sudah tercapai. Proses dihentikan.");
                break; 
            }

            Mahasiswa15 mhs = data[front]; 
            mhs.tampilkanData();
            front = (front + 1) % max;
            size--;
            jumlahDilayani++;
            jumlahDiprosesKaliIni++;
        }
        System.out.println(jumlahDiprosesKaliIni + " mahasiswa telah selesai diproses KRS pada panggilan ini.");
        if (isEmpty()) {
             front = 0;
             rear = -1;
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian KRS saat ini kosong.");
            return;
        }
        System.out.println("===== Daftar Mahasiswa dalam Antrian KRS =====");
        System.out.println("No.\tNIM\tNAMA\tPRODI\tKELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ".\t");
            data[index].tampilkanData();
        }
        System.out.println("==============================================");
        System.out.println("Total Mahasiswa dalam Antrian: " + size);
    }

    public void tampilkanDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian KRS kosong, tidak ada data untuk ditampilkan.");
            return;
        }
        System.out.println("===== Dua Mahasiswa Terdepan =====");
        System.out.println("NIM\tNAMA\tPRODI\tKELAS");
        int count = 0;
        for (int i = 0; i < size && i < 2; i++) {
            int index = (front + i) % max;
            data[index].tampilkanData();
            count++;
        }
        if (count == 1) {
            System.out.println("(Hanya ada 1 mahasiswa dalam antrian)");
        }
         System.out.println("================================");
    }

    public void tampilkanPalingAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian KRS kosong, tidak ada data untuk ditampilkan.");
            return;
        }
        System.out.println("===== Mahasiswa Paling Akhir =====");
        System.out.println("NIM\tNAMA\tPRODI\tKELAS");

        data[rear].tampilkanData();
        System.out.println("================================");
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getJumlahSudahProses() {
        return jumlahDilayani;
    }

    public int getJumlahBelumProses() {
        return size;
    }
}
