package com.loundry.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.loundry.entity.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
