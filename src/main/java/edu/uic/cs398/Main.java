package edu.uic.cs398;

import edu.uic.cs398.Book.Book;
import edu.uic.cs398.Book.BookFactory;

public class Main {

    public static void main(String[] args) {
        Book book = BookFactory.getBook(1);
        book.magic();
        foo(2);
    }

    public static boolean foo(int n) {
        if (n < 0 || n == 0) {
            return true;
        }
        return foo(n/2);
    }
}
