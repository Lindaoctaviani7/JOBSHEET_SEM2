public class book15 {
    public String isbn;
    public String title;

    public book15() {

    }

    public book15(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public String toString() {
        return "ISBN: " + this.isbn + " Tittle; " + this.title;
    }
}