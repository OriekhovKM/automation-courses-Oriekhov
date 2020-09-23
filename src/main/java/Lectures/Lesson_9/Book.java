package Lectures.Lesson_9;

import java.util.Objects;
import java.util.UUID;

public class Book {
    private String id = "default ID";
    private String title = "default title";
    private Author author;
    private String year = "default year";
    private String description = "default description";
    private String isbn = "default ISBN";



    public Book(String id, String title, Author author, String year, String description, String isbn) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.description = description;
        this.isbn = isbn;
    }
    public Book( String title, Author author, String year) {
        this.id = UUID.randomUUID().toString();
        this.description = "";
        this.isbn = "";
        this.author = author; //added
        new Book( id,  title, author,  year,  description,  isbn);
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


    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
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

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", year='" + year + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(year, book.year) &&
                Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year, isbn);
    }
}
