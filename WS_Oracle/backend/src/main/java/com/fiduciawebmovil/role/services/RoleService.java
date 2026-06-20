package com.fiduciawebmovil.role.services;

import com.fiduciawebmovil.res.Response;
import com.fiduciawebmovil.role.entity.Role;

import java.util.List;

public interface RoleService {

    Response<Role> createRole(Role roleRequest);

    Response<Role> updateRole(Role roleRequest);

    Response<List<Role>> getAllRoles();

    Response<?> deleteRole(Long id);

}
