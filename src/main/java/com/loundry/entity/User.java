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
@Table(name="tb_user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_id")
	private int userId;
	
	@Column(name="username")
	private String username;
	
	@Column(name="nama_user")
	private String namaCustomer;
	
	@Column(name="password")
	private String password;
	
	@Column(name="alamat_user")
	private String alamatUser;
	
	@Column(name="telp_user")
	private String telpUser;
	
	@ManyToOne
	@JoinColumn(name = "role_id", nullable=false)
	private Roles roles;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNamaCustomer() {
		return namaCustomer;
	}

	public void setNamaCustomer(String namaCustomer) {
		this.namaCustomer = namaCustomer;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAlamatUser() {
		return alamatUser;
	}

	public void setAlamatUser(String alamatUser) {
		this.alamatUser = alamatUser;
	}

	public String getTelpUser() {
		return telpUser;
	}

	public void setTelpUser(String telpUser) {
		this.telpUser = telpUser;
	}
	
}
