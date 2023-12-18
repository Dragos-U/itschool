package org.session9oop.onlinepractice.bookmanagementsystem;

public class Book {

    private String title;
//    private List<Author> authors;
//    private int numberOfPages;
//    private String ISBN;
    private float price;
//    private int shelfLocation;
//    private float discount;
//    private String Publisher;
//    private LocalDate publishedDate;

    public Book(){}

    public Book(String title, float price){
        this.title = title;
        this.price = price;
    }
    void printBookInfo(){
        System.out.println("Book title: "+title);
        System.out.println("Book price: "+price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
