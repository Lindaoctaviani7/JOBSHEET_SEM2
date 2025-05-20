public class NodeAntrian15 {
    int nomorAntrian;
    String nama;
    NodeAntrian15 prev, next;

    public NodeAntrian15(NodeAntrian15 prev, String nama, NodeAntrian15 next) {
        this.prev = prev;
        this.nama = nama;
        this.next = next;
    }

    public NodeAntrian15(NodeAntrian15 prev, int nomorAntrian, String nama, NodeAntrian15 next) {
        this.prev = prev;
        this.nomorAntrian = nomorAntrian;
        this.nama = nama;
        this.next = next;
    }
}
