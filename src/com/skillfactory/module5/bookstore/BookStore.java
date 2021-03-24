package com.skillfactory.module5.bookstore;

public class BookStore {
    public static void main(String[] args) {

        Book[] bookList = new Book[99];

        printAllBookList(bookList);

        Book book0 = new Book();

        addBook(bookList, book0);

        Book book1 = new Book("Hobbit", "Tolkin", 1937, 99);

        addBook(bookList, book1);

        Book book2 = new Book("Hobbit2", "Tolkin", 1937);
        Book book3 = new Book("Hobbit3", "Tolkin", 1937);
        Book book4 = new Book("Kolobok", "Narod", 1701);
        Book book5 = new Book("Marcian", "Narod", 2010);


        addBook(bookList, book2);
        addBook(bookList, book3);
        addBook(bookList, book4);
        addBook(bookList, book5);

        printAllBookList(bookList);

        findAndPrintBook(bookList, "Hobbit");
    }

    public static boolean checkBook(Book[] bookList, Book book) {

        for (Book item : bookList) {


            if (item != null && item.getBookName().equals(book.getBookName()) && item.getEditionYear() == book.getEditionYear()) {

                System.out.println("Данная книга уже есть в картотеке");
                return true;
            }
        }

        System.out.println("Данной книги нет в картотеке");
        return false;
    }

    public static void addBook(Book[] bookList, Book book) {

        if (!checkBook(bookList, book)) {

            for (int i = 0; i < bookList.length; i++) {
                if (bookList[i] == null) {
                    bookList[i] = book;
                    System.out.println("Книга добавлена в картотеку");
                    break;
                }
                if (i == bookList.length - 1) {
                    System.out.println("Картотека переволнена");
                }
            }

        }

    }

    public static void printAllBookList(Book[] bookList) {

        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i] == null && i == 0) {

                System.out.println("Booklist is empty");
            } else if (bookList[i] == null) {

                System.out.println("Booklist is ending");
                break;

            } else if (bookList[i].getBookName() == "some book") {

                System.out.printf("книга №%d: название: \"%s\" \n",
                        i + 1, bookList[i].getBookName());
            } else {

                System.out.printf("книга №%d: название: \"%s\", год издания: %dг., цена - %dusd \n",
                        i + 1, bookList[i].getBookName(), bookList[i].getEditionYear(), bookList[i].getBookPrice());

            }
        }
    }

    public static void findAndPrintBook(Book[] bookList, String book) {


        int count = 0;
        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i] != null && bookList[i].getBookName().contains(book)) {
                count++;
                System.out.printf("книга №%d: название: \"%s\", автор: \"%s\", год издания: %dг., ID книги -  %d\n",
                        count, bookList[i].getBookName(), bookList[i].getBookAuthor2(), bookList[i].getEditionYear(), bookList[i].getBookID());
            }
        }
    }

}
