public class BinaryTree15 {

    public Node15 root;

    public BinaryTree15() {
        root = null;
    }
    public boolean isEmpty() {
        return root == null;
    }
    public void add(Mahasiswa15 mahasiswa) {
        Node15 newNode15 = new Node15(mahasiswa);
        if (isEmpty()) {
            root = newNode15;
        } else {
            Node15 current = root;
            Node15 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode15;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode15;
                        return;
                    }
                }
            }
        }
    }
    public void addRekursif(Mahasiswa15 mhs) {
        root = insertRekursif(root, mhs);
    }
    public Node15 insertRekursif(Node15 current, Mahasiswa15 mhs) {
        if (current == null) {
            return new Node15(mhs);
        }

        if (mhs.ipk < current.mahasiswa.ipk) {
            current.left = insertRekursif(current.left, mhs);
        } else {
            current.right = insertRekursif(current.right, mhs);
        }

        return current;
    }
    public void cariMinIPK() {
        if (isEmpty()) {
            System.out.println("Tree kosong.");
            return;
        }
        Node15 current = root;
        while (current.left != null) {
            current = current.left;
        }
        current.mahasiswa.tampilInformasi();
    }
    public void cariMaxIPK() {
        if (isEmpty()) {
            System.out.println("Tree kosong.");
            return;
        }
        Node15 current = root;
        while (current.right != null) {
            current = current.right;
        }
        current.mahasiswa.tampilInformasi();
    }
    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        System.out.println("Mahasiswa dengan IPK di atas " + ipkBatas + ":");
        tampilIPKdiAtas(root, ipkBatas);
    }
    public void tampilIPKdiAtas(Node15 node, double ipkBatas) {
        if (node != null) {
            tampilIPKdiAtas(node.left, ipkBatas);
            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilInformasi();
            }
            tampilIPKdiAtas(node.right, ipkBatas);
        }
    }
    public boolean find(double ipk) {
        boolean result = false;
        Node15 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }
    public void traverseInOrder(Node15 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }
    public void traversePreOrder(Node15 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    public void traversePostOrder(Node15 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }
    public void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }

        Node15 parent = root;
        Node15 current = root;
        boolean isLeftChild = false;

        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node15 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }
    public Node15 getSuccessor(Node15 del) {
        Node15 successor = del.right;
        Node15 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }

        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }

        return successor;
    }
}
