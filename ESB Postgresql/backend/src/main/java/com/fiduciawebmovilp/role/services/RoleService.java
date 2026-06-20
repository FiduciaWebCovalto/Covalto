package com.fiduciawebmovilp.role.services;

import com.fiduciawebmovilp.res.Response;
import com.fiduciawebmovilp.role.entity.Role;

import java.util.List;

public interface RoleService {

    Response<Role> createRole(Role roleRequest);

    Response<Role> updateRole(Role roleRequest);

    Response<List<Role>> getAllRoles();

    Response<?> deleteRole(Long id);

}
