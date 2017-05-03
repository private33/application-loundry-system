package com.loundry.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="emp_id")
	private int employeeId;
	
	@Column(name="emp_name")
	private String employeeName;
	
	@Column(name="emp_address")
	private String employeeAddress;
	
	@Column(name="emp_phone")
	private String employeePhone;
	
	@Column(name="emp_identity_number")
	private String employeeIdentityNumber;
	
	@Column(name="emp_DOB")
	private Date employeeDateOfBirth;
	
	@Column(name="emp_join_date")
	private Date employeeJoinDate;
	
	@OneToOne
	@JoinColumn(name="login_id", nullable=false)
	private Login login;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public String getEmployeePhone() {
		return employeePhone;
	}

	public void setEmployeePhone(String employeePhone) {
		this.employeePhone = employeePhone;
	}

	public String getEmployeeIdentityNumber() {
		return employeeIdentityNumber;
	}

	public void setEmployeeIdentityNumber(String employeeIdentityNumber) {
		this.employeeIdentityNumber = employeeIdentityNumber;
	}

	public Date getEmployeeDateOfBirth() {
		return employeeDateOfBirth;
	}

	public void setEmployeeDateOfBirth(Date employeeDateOfBirth) {
		this.employeeDateOfBirth = employeeDateOfBirth;
	}

	public Date getEmployeeJoinDate() {
		return employeeJoinDate;
	}

	public void setEmployeeJoinDate(Date employeeJoinDate) {
		this.employeeJoinDate = employeeJoinDate;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

}
