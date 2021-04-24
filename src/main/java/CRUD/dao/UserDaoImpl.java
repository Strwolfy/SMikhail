package CRUD.dao;


import CRUD.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl
    //implements UserDao
{

    @PersistenceContext
    private EntityManager entityManager;


    public List<User> getAllUsers() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }


    public void saveUser(User user) {
        entityManager.persist(user);
    }


    public User getUser(int id) {
        return entityManager.find(User.class, id);
    }


    public void editUser(User user) {
        entityManager.merge(user);
    }


    public void deleteUser(int id) {
        entityManager.createQuery("delete User where id = " + id).executeUpdate();
    }


    public User showUserByUsername(String email) {
        return entityManager
                .createQuery("select u from User u where u.email =?1", User.class)
                .setParameter(1, email)
                .getSingleResult();
    }

}
