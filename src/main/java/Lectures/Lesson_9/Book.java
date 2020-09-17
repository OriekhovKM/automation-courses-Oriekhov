package Lectures.Lesson_9;

import java.util.UUID;

public class Book {
    private String id;
    private String title;
    private String author;
    private String year;
    private String description;
    private String isbn;

    {
//        this.id = "";
//        this.title = "";
//        this.Author = Author;
//        this.year = "";
//        this.description = "";
//        this.isbn = "";isbn
    }

    public Book(String id, String title, String author, String year, String description, String isbn) {
        this.id = id;
        this.title = title;
        this.author = Author;
        this.year = year;
        this.description = description;
        this.isbn = isbn;
    }
    public Book( String title, author, String year) {
        this.id = UUID.randomUUID().toString();
        this.description = "";
        this.isbn = "";
        new Book( id,  title,  author,  year,  description,  isbn);
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if (isIsbnValid (isbn)) {
            this.isbn = isbn;
        }
    }
    private boolean isIsbnValid(String isbn){
        //check valid isbn
        return false;

    }
}
