package com.jdc.demo.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(columnDefinition="varchar(255) character set 'utf8' collate 'utf8_bin'")
	private String email;
	private String password;
	@Enumerated(EnumType.STRING)
	private Role role;
	private String name;
	private boolean active;
	private String activationKey;
	private LocalDate registDate;
	
	
	public enum Role{
		Admin,Member,Business
	}

	

	public Account() {
		super();
	}


	public Account(String password, Role role, String name, boolean active, String activationKey,
			LocalDate registDate) {
		super();
		this.password = password;
		this.role = role;
		this.name = name;
		this.active = active;
		this.activationKey = activationKey;
		this.registDate = registDate;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}


	public String getActivationKey() {
		return activationKey;
	}


	public void setActivationKey(String activationKey) {
		this.activationKey = activationKey;
	}


	public LocalDate getRegistDate() {
		return registDate;
	}


	public void setRegistDate(LocalDate registDate) {
		this.registDate = registDate;
	}
	
	

}
