package com.skillfactory.module5.bookstore;

public class Book {

    private static int count = 0;
    private String bookName;
    private String BookAuthor;
    private int bookPrice;
    private int editionYear;
    private int bookID;


    public Book(String bookName, String bookAuthor, int editionYear, int bookPrice) {
        this.bookName = bookName;
        this.BookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
        this.editionYear = editionYear;
        this.bookID = ++count;
    }

    public Book(String bookName, String BookAuthor, int editionYear) {
        this.bookName = bookName;
        this.BookAuthor = BookAuthor;
        this.editionYear = editionYear;
        this.bookID = ++count;
    }

    public Book() {
        this("some book", "some Author", 2000);
        bookID++;
    }


    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public int getEditionYear() {
        return editionYear;
    }

    public void setEditionYear(int editionYear) {
        this.editionYear = editionYear;
    }

    public int getBookID() {

        return bookID;
    }

    public String getBookAuthor() {
        return BookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        BookAuthor = bookAuthor;
    }
}
