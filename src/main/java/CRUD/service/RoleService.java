package CRUD.service;


import CRUD.model.Role;


import java.util.List;

public interface RoleService {
    Role getRoleByName(String name);
    List<Role> getListRole();
}
