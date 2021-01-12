package edu.uic.cs398.Book.impl;

import edu.uic.cs398.Book.Book;

public class FluentPython implements Book {
    @Override
    public String getTitle() {
        return "Fluent Python";
    }

    @Override
    public String getAuthor() {
        return "Ramalho";
    }

    @Override
    public void magic() {

    }
}
