public class stackSurat15 {
    surat15[] stack;
    int top;
    int size;

    public stackSurat15(int size) {
        this.size = size;
        stack = new surat15[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(surat15 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
            System.out.println("Surat berhasil diterima.");
        } else {
            System.out.println("Stack surat penuh! Tidak bisa menerima surat lagi.");
        }
    }

    public surat15 pop() {
        if (!isEmpty()) {
            surat15 surat = stack[top];
            top--;
            return surat;
        } else {
            System.out.println("Tidak ada surat yang bisa diproses.");
            return null;
        }
    }

    public surat15 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Tidak ada surat izin yang tersedia.");
            return null;
        }
    }

    public void cariSurat(String namaMahasiswa) {
        boolean ketemu = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                System.out.println("Surat ditemukan:");
                System.out.println("ID: " + stack[i].idSurat + ", Nama: " + stack[i].namaMahasiswa + 
                                   ", Kelas: " + stack[i].kelas + ", Jenis Izin: " + stack[i].jenisIzin +
                                   ", Durasi: " + stack[i].durasi + " hari");
                ketemu = true;
                break;
            }
        }
        if (!ketemu) {
            System.out.println("Surat atas nama " + namaMahasiswa + " tidak ditemukan.");
        }
    }
}
