package com.fiduciawebmovil.role.controller;

import com.fiduciawebmovil.res.Response;
import com.fiduciawebmovil.role.entity.Role;
import com.fiduciawebmovil.role.services.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
@RequiredArgsConstructor
public class RoleController {

    private final RoleService roleService;

    @PostMapping
    public ResponseEntity<Response<Role>> createRole(@RequestBody Role roleRequest ){
        return ResponseEntity.ok(roleService.createRole(roleRequest));
    }

    @PutMapping
    public ResponseEntity<Response<Role>> updateRole(@RequestBody Role roleRequest ){
        return ResponseEntity.ok(roleService.updateRole(roleRequest));
    }


    @GetMapping
    public ResponseEntity<Response<List<Role>>> getAllRoles(){
        return ResponseEntity.ok(roleService.getAllRoles());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Response<?>> deleteRole(@PathVariable Long id){
        return ResponseEntity.ok(roleService.deleteRole(id));
    }


}





