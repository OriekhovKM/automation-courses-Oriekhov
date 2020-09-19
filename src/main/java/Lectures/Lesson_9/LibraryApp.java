package Lectures.Lesson_9;

public class LibraryApp {
    public static void main(String[] args) {
        Author author1 = new Author("Sergey", "Luckyanenko");
        Author author2 = new Author("Isaac", "Asimov");
        Author author3 = new Author("I", "Asimov");
        Author author4 = new Author("Isaa", "Asimov");
        Author author5 = new Author("Isa", "Asimov");
        Book book1 = new Book("", "Night Watch", author1, "1998", "", "");
        Book book2 = new Book("Day Watch", author2, "2000");
        Book book3 = new Book("Night Watch", author5, "1998");
        Book book4 = new Book("Profession", author4, "1957");
        Book book5 = new Book("", "Night Watch", author5, "1998", "", "");


        Book[] books = {book1, book2, book3, book4, book5};


 int countSameParameters = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = i+1; j < 5; j++) {
                if (books[i].getAuthor().equals(books[j].getAuthor())) {
                    countSameParameters++;
                    //System.out.println("You have the same authors in the book list");
                        break;
                    }
                }
            }
        if (countSameParameters>1){
            System.out.println("You have the same authors in the book list");
        } else System.out.println("You don't have the same authors in the book list");
        }
    }



