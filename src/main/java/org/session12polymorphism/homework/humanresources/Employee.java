package org.session12polymorphism.homework.humanresources;

public class Employee {

    private String name;
    private EmployeeRole role;
    private String email;

    public Employee(String name, EmployeeRole role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeeRole getRole() {
        return role;
    }

    public void setRole(EmployeeRole role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee : name = " + name + ", role =" + role + ", email = " + email;
    }
}
