package homework.oop.week2.library;

import homework.oop.week2.Address;

import java.util.ArrayList;

/**
     Основные классы: Библиотека, Книга, Читатель

     Написать программу позволяющую узнать следующую информацию:
     + 1) посмотреть список читателей
     + 2) посмотреть список доступных книг
     + 3) добавить книгу в библиотеку
     + 4) добавить читателя в список читателей
     + 5) выдать книгу читателю (если книга есть в наличии).
            Читателю запрещается брать больше 3-х книг.
     + 6) посмотреть список книг, которые находятся у читателей
     + 7) посмотреть список книг, которые находятся у конкретного читателя
     8) добавить читателя в черный список (ему нельзя выдавать книги)
     9) посмотреть книги конкретного автора
     + 10) посмотреть новые книги (год издания выше 2013)
 */

public class Library {

    private ArrayList<Reader> listOfReaders;
    private ArrayList<Book> listOfBooks;
    private ArrayList<Reader> blackListOfReaders;

    public Library() {
        this.listOfReaders = new ArrayList<>();
        this.listOfBooks = new ArrayList<>();
        this.blackListOfReaders = new ArrayList<>();
    }

    public void printListOfReaders(){
        System.out.printf("%-5s%-15s\n", "id", "name" );
        System.out.println("-----------------");

        for (Reader reader : listOfReaders){
            System.out.printf("%-5d%-15s\n", reader.getId(), reader.getName());
        }
    }

    public void printListOfAvailableBooks(){
        System.out.printf("%-5s%-25s%-15s\n", "id", "title", "writer" );
        System.out.println("----------------------------------------");

        for (Book book : listOfBooks){
            if (book.isAvailable()){
                System.out.printf("%-5s%-25s%-15s\n", book.getId(), book.getTitle(), book.getWriter());
            }
        }
    }

    public void printListOfBooks(int year){

        System.out.printf("%-5s%-25s%-20s%-15s\n", "id", "title", "writer", "year" );
        System.out.println("-----------------------------------------------------------");

        for (Book book : listOfBooks){
            if (book.getPublishingYear() >= year) {
                System.out.printf("%-5s%-25s%-20s%-15s\n", book.getId(), book.getTitle(),
                        book.getWriter(), book.getPublishingYear());
            }
        }
    }

    public int addBook(Book book){
        this.listOfBooks.add(book);
        return book.getId();
    }

    public int addReader(String name, String phone, Address address){
        Reader reader = new Reader(name, phone, address);
        listOfReaders.add(reader);
        return reader.getId();
    }

    //5 give the book to the reader
    public void giveBook(Reader reader, Book book){

        Book[] readerBooks = reader.getBooks();

        for (int i = 0; i < readerBooks.length; i++) {
            if (readerBooks[i] == null){
                book.setAvailable(false);
                readerBooks[i] = book;
                break;
            }
        }
    }

    public Reader getReaderByID(int id){
        if (id <= this.listOfReaders.size()) {
            return this.listOfReaders.get(id - 1);
        }

        return null;
    }

    //return id of the reader
    public int getReaderByName(String readerName){
        for ( Reader reader : this.listOfReaders){
            if (reader.getName() == readerName){
                return reader.getId();
            }
        }

        System.out.printf("Reader %s don`t exist\n", readerName);

        return 0;
    }

    public Book getBookByID(int id){
        if (id < this.listOfBooks.size()) {
            return this.listOfBooks.get(id - 1);
        }

        return null;
    }

    public void printListOfReadersBooks(){
        System.out.printf("%-5s%-15s%-15s%-15s\n", "id", "reader", "book id", "title");
        System.out.println("-----------------------------------------------------------");

        Book[] books;

        for (Reader reader : listOfReaders){
            if (reader.getNumberOfBooks() > 0) {
                System.out.printf("%-5d%-15s\n", reader.getId(), reader.getName());

                books = reader.getBooks();

                for (int i = 0; i < books.length; i++) {
                    if (books[i] != null) {
                        System.out.printf("%-5s%-15s%-15s%-15s\n", " ", " ", books[i].getId(), books[i].getTitle());
                    }
                }
            }
        }
    }
}
