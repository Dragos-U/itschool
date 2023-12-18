package org.session13solid.homework.librarymanagementsystem.srcdomain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Author {

    private String name;
    private String nationality;
    private LocalDate dateOfBirth;
    private List<Book> writtenBooks;

    public static class Builder {
        private String name;
        private String nationality;
        private LocalDate dateOfBirth;
        private List<Book> writtenBooks;

        public Builder(String name) {
            this.name = name;
        }

        public Builder nationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public Builder dateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder writtenBooks(List<Book> writtenBooks) {
            this.writtenBooks = writtenBooks;
            return this;
        }

        public Author build() {
            if (writtenBooks == null) writtenBooks = new ArrayList<>();
            return new Author(this);
        }
    }

    private Author(Builder builder) {
        this.name = builder.name;
        this.nationality = builder.nationality;
        this.dateOfBirth = builder.dateOfBirth;
        this.writtenBooks = builder.writtenBooks;
    }

    public void addBook(Book book) {
        writtenBooks.add(book);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", writtenBooks=" + writtenBooks +
                '}';
    }
}
