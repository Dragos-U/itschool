package org.session13.homework.librarymanagementsystem.services;

import org.session13.homework.librarymanagementsystem.librarymanagement.Book;
import org.session13.homework.librarymanagementsystem.librarymanagement.Library;
import org.session13.homework.librarymanagementsystem.profiles.Member;

import java.time.LocalDate;
import java.util.Map;

public class MemberServices {

    private MemberServices() {
        throw new IllegalStateException("This class should not be instantiated.");
    }

    public static void borrowBook(Library library, Member member, Book book, int numberOfDays) {
        if (member == null || book == null) return;
        LocalDate dueDate = LocalDate.now().plusDays(numberOfDays);
        Map<Book, LocalDate> borrowedBooks = member.getBorrowedBooks();
        member.setBorrowedBooks(borrowedBooks);
        System.out.println("> " + member.getName() + " has successfully borrowed '" + book.getTitle() + "'.");
        updateNumberOfBooksWhenBorrowed(library, book);
        borrowedBooks.put(book, dueDate);
    }

    public static void updateNumberOfBooksWhenBorrowed(Library library, Book book) {
        int currentCopies = library.getAvailableBooks().get(book);
        int updatedCopies = Math.max(0, currentCopies - 1);
        library.getAvailableBooks().put(book, updatedCopies);
    }

    public static void updateNumberOfBooksWhenReturned(Library library, Book book) {
        int currentCopies = library.getAvailableBooks().get(book);
        int updatedCopies = Math.max(0, currentCopies + 1);
        library.getAvailableBooks().put(book, updatedCopies);
    }

    public static void returnBook(Library library, Member member, Book book) {
        if (member == null || book == null) return;
        Map<Book, LocalDate> borrowedBooks = member.getBorrowedBooks();
        borrowedBooks.remove(book);
        updateNumberOfBooksWhenReturned(library, book);
    }
}