package org.session13.homework.librarymanagementsystem.srcdomain;

public class Book {

    private String title;
    private Author author;
    private String ISBN;
    private String publisher;
    private int printedCopies;

    public static class Builder {

        private String title;
        private Author author;
        private String ISBN;
        private String publisher;
        private int printedCopies;

        public Builder(String title, Author author) {
            if(title == null || author == null) throw new IllegalStateException("Title and author shall not be null.");
            this.title = title;
            this.author = author;
        }

        public Builder isbn(String ISBN) {
            this.ISBN = ISBN;
            return this;
        }

        public Builder publisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Builder printedCopies(int printedCopies) {
            this.printedCopies = printedCopies;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }

    private Book(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.publisher = builder.publisher;
        this.ISBN = builder.ISBN;
    }

    public String getTitle() {
        return title;
    }

    public int getPrintedCopies() {
        return printedCopies;
    }

    public void setPrintedCopies(int printedCopies) {
        this.printedCopies = printedCopies;
    }

    @Override
    public String toString() {
        return "Book{:" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", publisher='" + publisher + '\'' +
                ", numberOfCopies=" + printedCopies +
                '}';
    }
}
