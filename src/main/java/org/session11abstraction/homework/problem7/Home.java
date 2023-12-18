package org.session11abstraction.homework.problem7;

import org.session11abstraction.homework.problem7.user.User;

import java.util.List;

public class Home {

    private List<User> users;
    private House house;

    public Home(List<User> users, House house){
        this.users = users;
        this.house = house;
    }
}
