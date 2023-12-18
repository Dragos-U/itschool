package org.session17stream.homework;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem15 {

    public static void main(String[] args) {
        List<Book> books = List.of(
                Book.builder().title("To Kill a Mockingbird").author("Harper Lee").yearOfPublication(1960).build(),
                Book.builder().title("1984").author("George Orwell").yearOfPublication(1949).build(),
                Book.builder().title("Pride and Prejudice").author("Jane Austen").yearOfPublication(1813).build(),
                Book.builder().title("Emma").author("Jane Austen").yearOfPublication(1815).build(),
                Book.builder().title("The Great Gatsby").author("F. Scott Fitzgerald").yearOfPublication(1925).build(),
                Book.builder().title("The Catcher in the Rye").author("J.D. Salinger").yearOfPublication(1951).build(),
                Book.builder().title("The Da Vinci Code").author("Dan Brown").yearOfPublication(2003).build(),
                Book.builder().title("The Hunger Games").author("Suzanne Collins").yearOfPublication(2008).build());

        int year = 2000;
        List<Book> bookList = filterBooksPublishedAfterYear(books, year);
        bookList.forEach(b -> System.out.println(b.toString()));
        System.out.println();

        Map<String, List<String>> groupedBooks = groupBooksByAuthorAndTitle(bookList);
        groupedBooks.forEach((author, title) -> System.out.println(author + " " + title));


    }

    public static List<Book> filterBooksPublishedAfterYear(List<Book> input, int year) {
        return input
                .stream()
                .filter(book -> book.getYearOfPublication() < 2000)
                .toList();
    }

    public static Map<String, List<String>> groupBooksByAuthorAndTitle(List<Book> input) {
        return input
                .stream()
                .collect(Collectors.groupingBy(
                        Book::getAuthor,
                        Collectors.mapping(Book::getTitle, Collectors.toList())));
    }
}
