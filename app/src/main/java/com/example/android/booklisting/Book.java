package com.example.android.booklisting;

import java.util.ArrayList;

/**
 * An {@link Book} object contains information related to a single book.
 */
public class Book {

    private String mTitle;
    private ArrayList<String> mAuthor;
    private String mYear;
    private String mUrl;

    /**
     * Constructs a new {@link Book} object.
     *
     * @param title  of the book
     * @param author of the book
     * @param year   of the book
     * @param url    of the book
     */
    public Book(String title, ArrayList<String> author, String year, String url) {

        mTitle = title;
        mAuthor = author;
        mYear = year;
        mUrl = url;
    }

    public String getTitle() {
        return mTitle;
    }
    public ArrayList<String> getAuthor() {
        return mAuthor;
    }
    public String getYear() {
        return mYear;
    }
    public String getUrl() {
        return mUrl;
    }
}
