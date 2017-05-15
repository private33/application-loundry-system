package com.loundry.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.loundry.entity.Roles;

@Repository
public interface RolesDao extends JpaRepository<Roles, Integer> {

//	@Query("select * from tb_roles")
//	public List<Roles> findAllRoles();
//	
//	@Query("insert into tb_roles (role_id, name_role, role_description) value(?,?,?,?)")
//	public void createRoles(Roles roles); 

/*	@Modifying
	@Query("update Roles r set r.role_name = ?roleName, r.role_description = ?roleDescription where r.role_id = ?roleId")
	void updateRolesById(Roles roles);*/
}
