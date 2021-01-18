package edu.uic.cs398.Book;

public class AbstractBook implements Book {
    private final String title;
    private final String author;

    public AbstractBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public void magic() {

    }
}
