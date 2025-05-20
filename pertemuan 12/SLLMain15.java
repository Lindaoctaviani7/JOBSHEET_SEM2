/*import java.util.Scanner;

public class SLLMain13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList13 list = new SingleLinkedList13();

        for (int i = 0; i < 2; i++) {
            System.out.print("Masukkan Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Masukkan NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Masukkan Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("Masukkan IPK   : ");
            double ipk = sc.nextDouble(); sc.nextLine();

            Mahasiswa13 mhs = new Mahasiswa13(nim, nama, kelas, ipk);
            list.addLast(mhs);
        }

        list.print();
        sc.close();
    }
}
 */
public class SLLMain15 {
    public static void main(String[] args) {
        SingleLinkedList15 sll = new SingleLinkedList15();

        Mahasiswa15 mhs1 = new Mahasiswa15("21212203", "Dirga", "4D", 3.6);
        Mahasiswa15 mhs2 = new Mahasiswa15("22212202", "Cintia", "3C", 3.5);
        Mahasiswa15 mhs3 = new Mahasiswa15("23212201", "Bimon", "2B", 3.8);
        Mahasiswa15 mhs4 = new Mahasiswa15("24212200", "Alvaro", "1A", 4.0);

        //sll.print();
        sll.addFirst(mhs1); //data.print();
        //sll.addLast(mhs2);
        sll.addLast(mhs3); //data.print();
        sll.insertAfter("Dirga", mhs2);
        sll.insertAt(2, mhs3);
        //sll.insertAt(2, mhs4); //
        //sll.print();

        System.out.println("data index 1: ");
        sll.getData(1);

        System.out.println("Data mahasiswa an Bimon berada berada pada index : " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}
