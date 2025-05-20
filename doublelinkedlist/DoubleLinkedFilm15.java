public class DoubleLinkedFilm15 {
    Film15 head;
    int size;

    public void addFirst(int id, String judul, double rating) {
        Film15 newNode = new Film15(null, id, judul, rating, head);
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
        size++;
    }

    public void addLast(int id, String judul, double rating) {
        if (head == null) {
            addFirst(id, judul, rating);
            return;
        }
        Film15 current = head;
        while (current.next != null) {
            current = current.next;
        }
        Film15 newNode = new Film15(current, id, judul, rating, null);
        current.next = newNode;
        size++;
    }

    public void addAtIndex(int id, String judul, double rating, int index) {
        if (index < 0 || index > size) {
            System.out.println("Indeks di luar batas.");
            return;
        }
        if (index == 0) {
            addFirst(id, judul, rating);
        } else if (index == size) {
            addLast(id, judul, rating);
        } else {
            Film15 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            Film15 newNode = new Film15(current.prev, id, judul, rating, current);
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
            System.out.println("Data film ini akan masuk di urutan ke- " + index);
        }
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("List kosong.");
            return;
        }
        head = head.next;
        if (head != null) head.prev = null;
        size--;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("List kosong.");
            return;
        }
        if (head.next == null) {
            head = null;
        } else {
            Film15 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.prev.next = null;
        }
        size--;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Indeks di luar batas.");
            return;
        }
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Film15 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
        }
    }

    public void print() {
        if (head == null) {
            System.out.println("Data kosong.");
            return;
        }
        System.out.println("\nCetak Data");
        Film15 current = head;
        while (current != null) {
            System.out.println("ID: " + current.id);
            System.out.println("Judul Film: " + current.judul);
            System.out.println("ipk: " + current.rating);
            current = current.next;
        }
    }

    public void searchById(int id) {
        Film15 current = head;
        while (current != null) {
            if (current.id == id) {
                System.out.println("ID Film: " + current.id);
                System.out.println("Judul Film: " + current.judul);
                System.out.println("Rating Film: " + current.rating);
                return;
            }
            current = current.next;
        }
        System.out.println("Film dengan ID tersebut tidak ditemukan.");
    }

    public void sortDescending() {
        if (head == null || head.next == null) return;
        for (Film15 i = head; i != null; i = i.next) {
            for (Film15 j = i.next; j != null; j = j.next) {
                if (i.rating < j.rating) {
                    int idTemp = i.id;
                    String judulTemp = i.judul;
                    double ratingTemp = i.rating;

                    i.id = j.id;
                    i.judul = j.judul;
                    i.rating = j.rating;

                    j.id = idTemp;
                    j.judul = judulTemp;
                    j.rating = ratingTemp;
                }
            }
        }
        System.out.println("Data berhasil diurutkan berdasarkan rating (DESC).");
    }
}
