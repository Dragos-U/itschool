package org.session13solid.homework.librarymanagementsystem.services;

import org.session13solid.homework.librarymanagementsystem.srcdomain.Book;
import org.session13solid.homework.librarymanagementsystem.application.Library;
import org.session13solid.homework.librarymanagementsystem.srcdomain.Member;

import java.time.LocalDate;
import java.util.Map;

public class MemberService {

    private final Library library;

    public MemberService(Library library) {
        this.library = library;
    }

    public void borrowBook(Member member, Book book, int numberOfDays) {
        if (member == null || book == null) return;
        LocalDate dueDate = LocalDate.now().plusDays(numberOfDays);
        Map<Book, LocalDate> borrowedBooks = member.getBorrowedBooks();
        member.setBorrowedBooks(borrowedBooks);
        System.out.println("> " + member.getName() + " has successfully borrowed '" + book.getTitle() + "'.");
        updateNumberOfBooksWhenBorrowed(book);
        borrowedBooks.put(book, dueDate);
    }

    public void updateNumberOfBooksWhenBorrowed(Book book) {
        int currentCopies = library.getAvailableBooks().get(book);
        int updatedCopies = Math.max(0, currentCopies - 1);
        library.getAvailableBooks().put(book, updatedCopies);
    }

    public void updateNumberOfBooksWhenReturned(Book book) {
        int currentCopies = library.getAvailableBooks().get(book);
        int updatedCopies = Math.max(0, currentCopies + 1);
        library.getAvailableBooks().put(book, updatedCopies);
    }

    public void returnBook(Member member, Book book) {
        if (member == null || book == null) return;
        Map<Book, LocalDate> borrowedBooks = member.getBorrowedBooks();
        borrowedBooks.remove(book);
        updateNumberOfBooksWhenReturned(book);
    }
}