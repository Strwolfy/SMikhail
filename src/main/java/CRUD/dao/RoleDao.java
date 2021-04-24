package CRUD.dao;

import CRUD.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleDao
        extends JpaRepository<Role, Long>
{
    Role getRoleByName(String name);
    List<Role> getListRole();
}
