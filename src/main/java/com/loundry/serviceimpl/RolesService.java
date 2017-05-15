package com.loundry.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import com.loundry.entity.Roles;
import com.loundry.repository.RolesDao;
import com.loundry.service.IRoles;

@Service
public class RolesService implements IRoles {

	@Autowired
	private RolesDao rolesDao; 
	
	@Override
	public List<Roles> findAllRoles() {
		return this.rolesDao.findAll();
	}

	@Override
	public Roles findOneRoles(int roleId) {
		return this.rolesDao.findOne(roleId);
	}

	@Override
	public void deleteOne(int roleId) {
		this.rolesDao.delete(roleId);
	}

	@Override
	public void createRoles(Roles roles) {
		this.rolesDao.save(roles);
	}

	@Override
	@Modifying
	public void updateRoles(Roles roles) {
		Roles rolesUpdate = this.rolesDao.findOne(roles.getRoleId());
		rolesUpdate.setRoleId(roles.getRoleId());
		rolesUpdate.setRoleName(roles.getRoleName());
		rolesUpdate.setRoleDescription(roles.getRoleDescription());
		this.rolesDao.saveAndFlush(roles);
	}
}
