package edu.uic.cs398.Book.impl;

import edu.uic.cs398.Book.AbstractBook;

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
}
