package homework.oop.week2.library;

/**
 * Created by Vit on 09.07.2016.
 */
public class Book {
    private int id;
    private String writer;
    private String title;
    private int publishingYear;
    private boolean available;

    static int bookNumber = 1;

    public Book( String writer, String title, int publishingYear) {
        this.id = bookNumber++;
        this.writer = writer;
        this.title = title;
        this.publishingYear = publishingYear;
        this.available = true;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public int getId() {
        return id;
    }

    public String getWriter() {
        return writer;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable(){
        return this.available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
