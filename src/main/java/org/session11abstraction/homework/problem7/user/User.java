package org.session11abstraction.homework.problem7.user;

public class User {

    private String name;

    private AdminRights adminRights;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AdminRights getAdminRights() {
        return adminRights;
    }

    public void setAdminRights(AdminRights adminRights) {
        this.adminRights = adminRights;
    }

    public User(String name, AdminRights adminRights) {
        this.name = name;
        this.adminRights = adminRights;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", adminRights=" + adminRights +
                '}';
    }
}
