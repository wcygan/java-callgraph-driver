package edu.uic.cs398.Book.impl;

import edu.uic.cs398.Book.AbstractBook;
import edu.uic.cs398.Book.Book;

public class EffectiveJava extends AbstractBook {

    public EffectiveJava() {
        super("Effective Java", "Bloch");
    }

    @Override
    public String getAuthor() {
        return "Bloch";
    }

    @Override
    public void magic() {
        System.out.println("secrets!");
    }

    private String specialFunction(int a, Integer b, Book book) {
        book.magic();
        return String.format("%d ... %d", a, b);
    }
}
