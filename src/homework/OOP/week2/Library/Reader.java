package homework.oop.week2.library;

import homework.oop.week2.Address;

/**
 * Created by Vit on 09.07.2016.
 */

public class Reader {
    private int id;
    private String name;
    private Book[] books;
    private String phone;
    private Address address;

    static int readerID = 1;
    static final int howManyBooks = 3;

    public Reader(){}

    public Reader(String name, String phone, Address address) {
        this.id = readerID++;
        this.name = name;
        this.books = new Book[howManyBooks];
        this.phone = phone;
        this.address = address;
    }

    public int getNumberOfBooks() {
        int numberOfBooks = 0;
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i]!= null)
                numberOfBooks++;
        }
        return numberOfBooks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Book[] getBooks(){
        return this.books;
    }

    public void printBooks(){

        if (this.getNumberOfBooks() > 0){
            System.out.printf("%-5s%-15s\n", "id", "title" );
            System.out.println("-----------------");

            for (int i = 0; i < this.books.length; i++) {
                if (this.books[i] != null){
                    System.out.printf("%-5s%-15s\n", this.books[i].getId(), this.books[i].getTitle());
                }
            }
        }
        else{
            System.out.printf("\nReader %s don`t have any books.\n", this.name);
        }
    }
}
