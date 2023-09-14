package org.session15.onlinepractice.hash;

import java.util.HashSet;
import java.util.Set;

public class EqualsAndHashCodePractice {

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setId(1);
        emp1.setName("Alice");
        emp1.setDepartment("IT");

        Employee emp2 = new Employee();
        emp2.setId(1);
        emp2.setName("Alice");
        emp2.setDepartment("IT");

        System.out.println("emp1 equals emp2 ? " + emp1.equals(emp2)); // false if not override

        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(emp1);
        employeeSet.add(emp2);

        System.out.println("Set size > ".concat(String.valueOf(employeeSet.size()))); // 2 if hash code is not override

        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());

        System.out.println(emp1);
        System.out.println(emp2);
    }
}
