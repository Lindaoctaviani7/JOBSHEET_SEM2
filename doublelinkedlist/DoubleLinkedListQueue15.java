public class DoubleLinkedListQueue15 {
    NodeAntrian15 head, tail;
    int size;
    int nomorTerakhir = 0;

    public DoubleLinkedListQueue15() {
        head = tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(String nama) {
        nomorTerakhir++;
        NodeAntrian15 newNode = new NodeAntrian15(null, nomorTerakhir, nama, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
        System.out.println(nama + " berhasil ditambahkan ke dalam antrian.");
        System.out.println("Nomor Antrian: " + newNode.nomorAntrian);
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong. Tidak ada yang divaksinasi.");
        } else {
            System.out.println(head.nama + " (No. " + head.nomorAntrian + ") telah selesai divaksinasi.");
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            size--;
        }
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("+++++++++++++++++++++++++++");
            System.out.println("DAFTAR PENGANTRI VAKSIN");
            System.out.println("+++++++++++++++++++++++++++");
            System.out.println("|No.\t|Nama\t|");

            NodeAntrian15 current = head;
            while (current != null) {
                System.out.println("|" + current.nomorAntrian  + "\t|" + current.nama +"\t|" );
                current = current.next;
            }
            System.out.println("Sisa Antrian : " + size);
        }
    }
}
