package edu.uic.cs398.Book.impl;

import edu.uic.cs398.Book.Book;

public class EffectiveJava implements Book {
    @Override
    public String getTitle() {
        return "Effective Java";
    }

    @Override
    public String getAuthor() {
        return "Bloch";
    }

    @Override
    public void magic() {

    }
}
