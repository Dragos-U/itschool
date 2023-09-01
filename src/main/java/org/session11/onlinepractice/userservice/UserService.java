package org.session11.onlinepractice.userservice;

public interface UserService {

    /**
    * Create a user
    * @param user
    */
    void createUser(User user);

    User findUserById(long id);

    void deleteUser(long id);

}
