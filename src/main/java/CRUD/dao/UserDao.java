package CRUD.dao;



import CRUD.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao
        extends JpaRepository<User, Long>
{

    List<User> getAllUsers();

    void saveUser(User user);

    User getUser(int id);

    void editUser(User user);

    void deleteUser(int id);

    User showUserByUsername(String email);

}

