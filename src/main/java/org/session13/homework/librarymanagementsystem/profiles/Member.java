package org.session13.homework.librarymanagementsystem.profiles;

import org.session13.homework.librarymanagementsystem.librarymanagement.Book;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Member {

    private String name;
    private int ID;
    private String address;
    private String contactInfo;
    private Map<Book, LocalDate> borrowedBooks;

    public static class Builder {

        private String name;
        private int ID;
        private String address;
        private String contactInfo;
        private Map<Book, LocalDate> borrowedBooks;

        public Builder(String name) {
            this.name = name;
        }

        public Builder id(int ID) {
            this.ID = ID;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder contactInfo(String contactInfo) {
            this.contactInfo = contactInfo;
            return this;
        }


        public Builder borrowedBooks(Map<Book, LocalDate> borrowedBooks) {
            this.borrowedBooks = borrowedBooks;
            return this;
        }

        public Member build() {
            if (borrowedBooks == null) borrowedBooks = new HashMap<>();
            return new Member(this);
        }
    }

    private Member(Builder builder) {
        this.name = builder.name;
        this.ID = builder.ID;
        this.address = builder.address;
        this.contactInfo = builder.contactInfo;
        this.borrowedBooks = builder.borrowedBooks;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public int getID() {
        return ID;
    }

    public void setBorrowedBooks(Map<Book, LocalDate> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public Map<Book, LocalDate> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void displayBorrowedBooks(){
        borrowedBooks.forEach((k,v) -> System.out.printf("\n%s has borrowed the book: %s on %TD \n",name, k.getTitle(), v));
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", address='" + address + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                '}';
    }
}
