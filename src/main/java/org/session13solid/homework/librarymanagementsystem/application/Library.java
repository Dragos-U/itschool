package org.session13solid.homework.librarymanagementsystem.application;

import org.session13solid.homework.librarymanagementsystem.srcdomain.Book;
import org.session13solid.homework.librarymanagementsystem.srcdomain.Member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {

    private String libraryName;
    private List<Member> members;
    private Map<Book, Integer> availableBooks;

    private Library(String libraryName) {
        this.libraryName = libraryName;
        members = new ArrayList<>();
        availableBooks = new HashMap<>();
    }

    public static Library createInstance(String libraryName) {
        return new Library(libraryName);
    }

    public String getLibraryName() {
        return libraryName;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void addMember(Member member) {
        if (member == null) return;
        if (!members.contains(member)) members.add(member);
    }

    public void removeMember(Member member) {
        if (member == null) return;
        if (members.contains(member)) members.remove(member);
    }

    public void displayMembers() {
        members.forEach(System.out::println);
    }

    public void addBooksToLibrary(Book book, int numberOfCopies) {
        if (book == null || numberOfCopies <= 0) return;
//        if (!areMoreCopiesThanStored(book)) return;
        if (availableBooks.containsKey(book)) {
            int currentCopies = availableBooks.get(book);
            availableBooks.put(book, currentCopies + numberOfCopies);
        } else {
            book.setPrintedCopies(0);
            availableBooks.put(book, numberOfCopies);
        }
    }

    public void removeBooksFromLibrary(Book book, int numberOfCopiesToRemove) {
        if (book == null || numberOfCopiesToRemove <= 0) return;
        if (availableBooks.containsKey(book)) {
            int currentCopies = availableBooks.get(book);
            int updatedCopies = Math.max(0, currentCopies - numberOfCopiesToRemove);
            availableBooks.put(book, updatedCopies);
            if (updatedCopies == 0) {
                availableBooks.remove(book);
            }
        }
    }

    public Map<Book, Integer> getAvailableBooks() {
        return availableBooks;
    }

    public boolean areMoreCopiesThanStored(Book book) {
        return book.getPrintedCopies() >= availableBooks.get(book);
    }

    public void displayAvailableBooks() {
        availableBooks.forEach((book, copies) -> System.out.println("Title :" + book.getTitle() + ", copies : " + copies));
    }
}
