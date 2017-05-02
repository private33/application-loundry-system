package com.loundry.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_login")
public class Login {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="login_id")
	private int loginId;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@ManyToOne
	@JoinColumn(name="role_id", nullable=false)
	private Roles role;
	
}
