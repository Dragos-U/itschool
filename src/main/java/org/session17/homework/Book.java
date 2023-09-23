package org.session17.homework;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class Book {
    private String title;
    private String author;
    private int yearOfPublication;
}
