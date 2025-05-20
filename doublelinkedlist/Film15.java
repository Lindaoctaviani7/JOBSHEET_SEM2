public class Film15 {
    int id;
    String judul;
    double rating;
    Film15 prev, next;

    public Film15(Film15 prev, int id, String judul, double rating, Film15 next) {
        this.prev = prev;
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.next = next;
    }
}
