package CRUD.service;



import CRUD.model.User;


import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void saveUser(User user);

    User getUser(long id);

    void deleteUser(long id);

    void editUser(User user);

    Object showUserByUsername(String email);


}

