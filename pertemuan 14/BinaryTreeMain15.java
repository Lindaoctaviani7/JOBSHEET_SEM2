public class BinaryTreeMain15 {
    public static void main(String[] args) {
        BinaryTree15 bst = new BinaryTree15();

        bst.addRekursif(new Mahasiswa15("244160121", "Ali", "A", 3.57));
        bst.addRekursif(new Mahasiswa15("24416221", "Badar", "B", 3.85));
        bst.addRekursif(new Mahasiswa15("244160185", "Candra", "C", 3.21));
        bst.addRekursif(new Mahasiswa15("244160220", "Dewi", "B", 3.54));

        System.out.println("\nDaftar semua Mahasiswa (In-Order Traversal):");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPencarian data mahasiswa:");
        System.out.print("Cari mahasiswa dengan IPK 3.54: ");
        System.out.println(bst.find(3.54) ? "Ditemukan" : "Tidak ditemukan");

        System.out.print("Cari mahasiswa dengan IPK 3.22: ");
        System.out.println(bst.find(3.22) ? "Ditemukan" : "Tidak ditemukan");

        bst.addRekursif(new Mahasiswa15("24416131", "Devi", "A", 3.72));
        bst.addRekursif(new Mahasiswa15("244160205", "Ehsan", "D", 3.37));
        bst.addRekursif(new Mahasiswa15("244160170", "Fizi", "B", 3.46));

        System.out.println("\nDaftar semua Mahasiswa setelah penambahan (InOrder):");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPreOrder Traversal:");
        bst.traversePreOrder(bst.root);

        System.out.println("\nPostOrder Traversal:");
        bst.traversePostOrder(bst.root);

        System.out.println("\nPenghapusan mahasiswa dengan IPK 3.57");
        bst.delete(3.57);

        System.out.println("\nData setelah penghapusan (InOrder):");
        bst.traverseInOrder(bst.root);

        System.out.println("\nMahasiswa dengan IPK terkecil:");
        bst.cariMinIPK();

        System.out.println("\nMahasiswa dengan IPK terbesar:");
        bst.cariMaxIPK();

        System.out.println("\nMahasiswa dengan IPK > 3.50:");
        bst.tampilMahasiswaIPKdiAtas(3.50);
    }
}
