public class QueueLinkedList15 {
    Nodee15 front, rear;
    int size;

    public QueueLinkedList15() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(Mahasiswaaa15 data) {
        Nodee15 newNode = new Nodee15(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Antrian berhasil ditambahkan.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong. Tidak ada yang dipanggil.");
        } else {
            System.out.println("Memanggil:");
            front.data.tampil();
            front = front.next;
            size--;
            if (front == null) rear = null;
        }
    }

    public void peekFront() {
        if (!isEmpty()) {
            System.out.println("Antrian Terdepan:");
            front.data.tampil();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Antrian Paling Belakang:");
            rear.data.tampil();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar Antrian:");
            Nodee15 temp = front;
            while (temp != null) {
                temp.data.tampil();
                System.out.println("-------------------");
                temp = temp.next;
            }
        }
    }

    public void size() {
        System.out.println("Jumlah Mahasiswa yang Mengantre: " + size);
    }
}
