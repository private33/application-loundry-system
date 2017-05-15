package com.loundry.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.loundry.entity.Roles;

@Service
public interface IRoles {

	public abstract List<Roles> findAllRoles();

	public abstract Roles findOneRoles(int roleId);
	
	public abstract void deleteOne(int roleId);

	public abstract void createRoles(Roles roles);
	
	public void updateRoles(Roles roles);

}
