package org.session9oop.onlinepractice.bookmanagementsystem;

public class BookManagementSystem {

    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter",50);
        book1.printBookInfo();

        Book book2 = new Book();
        book2.setTitle("Animal Farm");
        book2.setPrice(30);
        book2.printBookInfo();
        System.out.println(book2.getTitle());

    }
}
