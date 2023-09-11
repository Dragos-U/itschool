package org.session13.homework.librarymanagementsystem;

import org.session13.homework.librarymanagementsystem.librarymanagement.Book;
import org.session13.homework.librarymanagementsystem.librarymanagement.Library;
import org.session13.homework.librarymanagementsystem.profiles.Author;
import org.session13.homework.librarymanagementsystem.profiles.Member;
import org.session13.homework.librarymanagementsystem.services.LibraryServices;
import org.session13.homework.librarymanagementsystem.services.MemberServices;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Author julesVerne = new Author.Builder("Jules Verne")
                .nationality("French")
                .dateOfBirth(LocalDate.of(1828, Month.FEBRUARY, 8))
                .build();
        Author charlesDickens = new Author.Builder("Charles Dickens")
                .nationality("English")
                .dateOfBirth(LocalDate.of(1812, Month.FEBRUARY, 7))
                .build();

        Book book1jv = new Book.Builder("Five Weeks in a Balloon", julesVerne)
                .printedCopies(2000)
                .publisher("Private publisher")
                .build();

        Book book2jv = new Book.Builder("20,000 Leagues Under the Sea", julesVerne)
                .printedCopies(3000)
                .publisher("French publisher")
                .build();

        Book book1cd = new Book.Builder("The Pickwick Papers", charlesDickens)
                .printedCopies(5000)
                .publisher("Chapman & Hall")
                .build();

        julesVerne.addBook(book1jv);
        julesVerne.addBook(book2jv);
        charlesDickens.addBook(book1cd);

        Library countyLib = Library.createInstance("County Library");
        countyLib.addBooksToLibrary(book1jv, 20);
        countyLib.addBooksToLibrary(book2jv, 10);
        countyLib.addBooksToLibrary(book1cd, 5);


        Member member1 = new Member.Builder("Alice")
                .id(1)
                .address("Timisoara")
                .contactInfo("phone : 0123 456 789")
                .build();

        Member member2 = new Member.Builder("Bob")
                .id(2)
                .address("Iasi")
                .build();

        countyLib.addMember(member1);
        countyLib.addMember(member2);

        System.out.println("\nLibrary name: " + countyLib.getLibraryName());
        System.out.println("\nThe available books: ");
        countyLib.displayAvailableBooks();
        System.out.println("\nThe registered members: ");
        countyLib.displayMembers();
        countyLib.removeMember(member1);
        System.out.println("\nThe registered members: ");
        countyLib.displayMembers();

        String searchName = "Alice";
        System.out.println("\nSearch members with name: " + searchName);
        List<Member> existingMembers = LibraryServices.findMembersByName(searchName, countyLib);
        existingMembers.forEach(System.out::println);

        int searchID = 2;
        System.out.println("\nSearch member with ID number: " + searchID);
        System.out.println(LibraryServices.findMemberByID(searchID, countyLib));

        System.out.println("--------------------------------");
        System.out.println("The available books in the library: \n");
        countyLib.displayAvailableBooks();
        MemberServices.borrowBook(countyLib,member1, book1jv, 14);

        System.out.println("--------------------------------");
        System.out.println("The available books in the library: \n");
        countyLib.displayAvailableBooks();
        member1.displayBorrowedBooks();

        System.out.println("--------------------------------");
        MemberServices.returnBook(countyLib,member1,book1jv);
        System.out.println("The available books in the library: \n");
        countyLib.displayAvailableBooks();
        member1.displayBorrowedBooks();
    }
}
