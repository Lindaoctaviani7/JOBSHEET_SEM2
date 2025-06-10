import java.util.Stack;

public class StackDemo15 {
    public static void main(String[] args) {
        book15 book1 = new book15("1234","Dasar Pemrograman");
        book15 book2 = new book15("7145","Hafalan Shalat Delisa");
        book15 book3 = new book15("3562","Muhammad Al-Fatih");

        Stack<book15> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        book15 temp = books.peek();

        if(temp != null){
            System.out.println(temp.toString());
        }
        book15 temp2 = books.pop();

        if(temp2 != null){
            System.out.println(temp2.toString());
        }
        for (book15 book : books){
            System.out.println(book.toString());
        }
        System.out.println(books);

        int pencarian = books.search(book1);
        System.out.println("Letak buku yang kamu cari "+ book1 +" dalam stack berada di element ke-"+pencarian);
    }
}