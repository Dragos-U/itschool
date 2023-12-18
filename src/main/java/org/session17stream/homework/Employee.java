package org.session17stream.homework;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class Employee {

    private String name;
    private String department;
    private int salary;
}
