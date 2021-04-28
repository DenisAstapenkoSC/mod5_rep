package com.skillfactory.module10.bookstore;

import java.util.Calendar;

public class Book {

    private static int count = 0;
    private String bookName;
    private String BookAuthor2;
    private int bookPrice;
    private int editionYear;
    private int bookID;
    private Calendar dateOfReceipt;


    public Book(String bookName, String bookAuthor2, int editionYear, int bookPrice) {
        this.bookName = bookName;
        this.BookAuthor2 = bookAuthor2;
        this.bookPrice = bookPrice;
        this.editionYear = editionYear;
        this.bookID = ++count;


    }

    public Book(String bookName, String BookAuthor2, int editionYear) {
        this.bookName = bookName;
        this.BookAuthor2 = BookAuthor2;
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


    public int getBookID() {

        return bookID;
    }

    public Calendar getDateOfReceipt () {

        return this.dateOfReceipt;
    }

    public String getBookAuthor2() {
        return BookAuthor2;
    }

    public void setBookAuthor2(String bookAuthor2) {
        BookAuthor2 = bookAuthor2;
    }

    public void setDateOfReceipt (){

        this.dateOfReceipt = Calendar.getInstance();

    }

    public void setDateOfReceipt (int year, int month, int day){

        this.dateOfReceipt.set(year, month-1, day);

    }
}
