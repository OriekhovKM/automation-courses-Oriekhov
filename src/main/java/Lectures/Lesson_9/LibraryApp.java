package Lectures.Lesson_9;

public class LibraryApp {
    public static void main(String[] args) {
        Author author1 = new Author("Sergey ", "Luckyanenko");
        Book book1 = new Book("", "Night Dozor", "S. Lukyanenko", "1998", "", "");
        Book book2 = new Book("Night Dozor", "S. Lukyanenko", "1998");
        Book book3 = new Book("Night Dozor", "Sergey Lukyanenko", "1998");
        Book book4 = new Book("Night Dozor", "Sergey Lukyanenko", "1998");
    }
}
