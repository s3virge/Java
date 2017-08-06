package homework.oop.week2.library;

import homework.oop.week2.Address;

/**
 * Created by Vit on 09.07.2016.
 */
public class TestLibrary {
    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book("George R. R. Martin", "A Game of thrones", 1996));
        library.addBook(new Book("Данте Алигьери", "Божественная комедия", 1321));

        int MobyID = library.addBook(new Book("Герман Мелвилл", "Моби Дик", 	1851));
        int BuddenID = library.addBook(new Book("Томас Манн", "Будденброки", 1901));

        library.addBook(new Book("Лу Синь", "Записки сумасшедшего", 1918));

        System.out.println("\nList of books");
        library.printListOfBooks(0);

        library.addReader("Victor", "3-151-020", new Address("UA", "Megacity", "Megastreet", "12", "11" ));
        library.addReader("Petya", "5-222-020", new Address("UA", "Qtown", "Qstreet", "66", "1" ));
        library.addReader("Asdfg", "3-345-000", new Address("UA", "Dtown", "DStreet", "123", "234" ));

        int readerID = library.addReader("Kobzar V", "050-683-12-26", new Address("UA", "CCity", "Cstreet", "1122", "aa25" ));

        System.out.println("\nList of readers");
        library.printListOfReaders();

        Book book = library.getBookByID(2);

        if (book.isAvailable()){

            Reader reader = library.getReaderByID(2);

            if (reader.getNumberOfBooks() < 3) {
                library.giveBook(reader, book);
            }

            System.out.printf("\nReader %s take the book %s\n", reader.getName(), book.getTitle());
        }

        System.out.println("\nList of available books");
        library.printListOfAvailableBooks();

        Reader kobzarv = library.getReaderByID(readerID);

        if (kobzarv != null){
            kobzarv.printBooks();
        }

        library.giveBook(kobzarv, library.getBookByID(MobyID));
        library.giveBook(kobzarv, library.getBookByID(BuddenID));

        System.out.println("\nList of books by readers");
        library.printListOfReadersBooks();

        System.out.printf("\nReader \"Asdfg\" has id: %d\n", library.getReaderByName("Asdfg"));

        System.out.println("\nList of books since 1900");
        library.printListOfBooks(1900);
    }
}
