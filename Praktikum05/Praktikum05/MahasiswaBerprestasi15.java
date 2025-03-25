public class MahasiswaBerprestasi15 {
    Mahasiswa15 [] listMhs;
    int idx;

    public MahasiswaBerprestasi15(int jumlahMahasiswa) {
        listMhs = new Mahasiswa15[jumlahMahasiswa];
        idx=0;
    }

    void tambah(Mahasiswa15 m) {
        if (idx<listMhs.length) {
            listMhs[idx]=m;
            idx++;
        }else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil() {
        for (int i=0; i<idx; i++) {
            listMhs[i].tampilInformasi();
            System.out.println("-----------------------------------------------");
        }
    }

    void bubbleSort() {
        for (int i=0; i<idx-1; i++){
            for (int j=1; j<idx-i; j++){
                if (listMhs[j].ipk>listMhs[j-1].ipk){
                    Mahasiswa15 tmp = listMhs[j];
                    listMhs[j]=listMhs[j-1];
                    listMhs[j-1]=tmp;
                }
            }
            System.out.println("-----------------------------------------------");
        }
    }

    void selectionSort() {
        for (int i=0; i<idx-1; i++) {
            int idxMin=i;
            for (int j=i+1; j<idx; j++) {
                if (listMhs[j].ipk<listMhs[idxMin].ipk) {
                    idxMin=j;
                }
            }
            Mahasiswa15 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void insertionSort() {
        for (int i=1; i<idx; i++) {
            Mahasiswa15 temp = listMhs[i];
            int j=i;
            while (j>0 && listMhs[j-1].ipk>temp.ipk) {
                listMhs[j]=listMhs[j-1];
                j--;
            }
            listMhs[j]=temp;
        }
    }

    void insertionSortDesc() {
        for (int i = 1; i < idx; i++) {
            Mahasiswa15 temp = listMhs[i]; 
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }

    int findBinarySearch(double cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMhs[mid].ipk) {
                return (mid);
            } else if (listMhs[mid].ipk < cari) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    int sequentialSearching(double cari) {
        int posisi = -1;
        for (int j=0; j<idx; j++) {
            if (listMhs[j].ipk==cari) {
                posisi=j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos) {
        if (pos!=-1) {
            System.out.println("data mahasiswa dengan IPK:  "+x+" ditemukan pada indeks "+pos);
        }else {
            System.out.println("data: "+x+" tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos) {
        if (pos!=-1) {
            System.out.println("Nim\t: "+listMhs[pos].nim);
            System.out.println("Nama\t: "+listMhs[pos].nama);
            System.out.println("Kelas\t: "+listMhs[pos].kelas);
            System.out.println("IPK\t: "+x);
        }else {
            System.out.println("Data mahasiswa dengan IPK  "+x+" tidak ditemukan");
        }
    }
}
