package org.session17stream.homework;

import java.util.*;
import java.util.stream.Collectors;

public class Problem12 {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                Employee.builder().name("Jack").department("IT").salary(3000).build(),
                Employee.builder().name("Alice").department("IT").salary(4000).build(),
                Employee.builder().name("John").department("HR").salary(2800).build(),
                Employee.builder().name("Ben").department("HR").salary(3500).build(),
                Employee.builder().name("Sheila").department("PO").salary(5000).build(),
                Employee.builder().name("Ken").department("PO").salary(5500).build());
        String deptWithHighestTotalSalary = findDeptWithHighestSalaries(employees);
        System.out.println(deptWithHighestTotalSalary);
    }

    private static String findDeptWithHighestSalaries(List<Employee> employees) {
         Map<String, Integer> deptTotalSalaries = employees
                .stream()
                .collect(Collectors.toMap(
                        e -> e.getDepartment(),
                        e -> e.getSalary(),
                        (salary1, salary2) -> salary1 + salary2));

        Optional<Map.Entry<String,Integer>> dept = deptTotalSalaries
                .entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue));

        return dept.map(Map.Entry::getKey).orElse("No dept");
    }
}
