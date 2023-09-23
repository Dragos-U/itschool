package org.session17.homework;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class Product {

    private String name;
    private String category;
    private int price;
}
