public class DoubleLinkedListMain15 {
    public static void main(String[] args) throws Exception {
        DoubleLinkedList15 dll = new DoubleLinkedList15();
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("===========================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("===========================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("===========================");
        dll.clear();
        dll.print();
        System.out.println("Size: " + dll.size());
        //praktikum2
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("===========================");
        dll.removeFirst();
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("===========================");
        dll.removeLast();
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("===========================");
        dll.remove(1);
        dll.print();
        System.out.println("Size: " + dll.size());
        dll.remove(0);
        //praktikum3
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("===========================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size: " + dll.size);
        System.out.println("===========================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size: " + dll.size);
        System.out.println("===========================");
        System.out.println("Data awal pada Linked List adalah: " + dll.getFirst());
        System.out.println("Data akhir pada Linked List adalah: " + dll.getLast());
        System.out.println("Data indeks ke-1 pada Linked Lists adalah: " + dll.get(1));
    }
}
