import model.Book;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("The greatest", "F. Scott", "1925");

//        System.out.println(book);

        Book book1 = new Book("The greatest", "F. Scott", "1925");
        Book book2 = new Book("The greatest", "F. Scott", "1925");
        Book book3 = new Book("The greatest", "F. Scott", "1925");

        /// Cum definim un array de carti?
        Book [] books = new Book[0];

        ///  Observatie: Array-urile au dimensiune fixa, de aia punem Book[1]

//        books[0] = book;

        books = addBook(books, book1);
        books = addBook(books, book2);
        books = addBook(books, book3);

        /// Clasa Arrays
        System.out.println(Arrays.toString(books));

        int [] arr = {5, 2, 0, 1, 3};
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        ///  E.C. Nice: incearca sa adaugi posibilitatea de a compara doua carti
//        Arrays.sort(books);
//        System.out.println(books);
    }

    private static Book [] addBook(Book [] books, Book book) {
        Book [] newBooks = new Book[books.length + 1];
        ///  Manual array copy
//        for (int i = 0; i < books.length; i++) {
//            newBooks[i] = books[i];
//        }
        ///  Alternativa
        System.arraycopy(books, 0, newBooks, 0, books.length);

        newBooks[newBooks.length - 1] = book;
        return newBooks;
    }
}


