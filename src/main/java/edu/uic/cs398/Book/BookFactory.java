package edu.uic.cs398.Book;

import edu.uic.cs398.Book.impl.*;

public class BookFactory {
    public static Book getBook(int isbn) {
        switch (isbn) {
            case 1:
                return new HowDemocraciesDie();
            case 2:
                return new EffectiveJava();
            case 3:
                return new ArguingWithZombies();
            case 4:
                return new FluentPython();
            case 5:
                return new Freakonomics();
            case 6:
                return new DesigningDataIntensiveApplications();
            default:
                throw new Error("Unknown ISBN");
        }
    }
}
