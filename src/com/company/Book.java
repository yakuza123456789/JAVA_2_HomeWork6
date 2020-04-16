package com.company;

public class Book <R extends Number> implements Readable<R> {

    R numberOfBooks;
    R numberOfPages;

    public Book(R numberOfBooks, R numberOfPages) {
        this.numberOfBooks = numberOfBooks;
        this.numberOfPages = numberOfPages;
    }


    @Override
    public R read() {
        System.out.println("Количество книг на полке: " + numberOfBooks +";" + " Количество страниц: " + numberOfPages);
        return null;
    }
}
