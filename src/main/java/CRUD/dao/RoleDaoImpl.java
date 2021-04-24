package CRUD.dao;

import CRUD.model.Role;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RoleDaoImpl {
    @PersistenceContext
    EntityManager entityManager;

    public Role getRoleByName(String name) {
        return entityManager.createQuery("select role from  Role role where role.role =: name",Role.class)
                .setParameter("name",name)
                .getSingleResult();
    }

    public List getListRole() {
        return entityManager.createQuery("from Role").getResultList();
    }
}
