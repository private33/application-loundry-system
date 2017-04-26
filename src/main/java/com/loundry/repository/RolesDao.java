package com.loundry.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.loundry.entity.Roles;

public interface RolesDao extends JpaRepository<Roles, Integer> {

}
