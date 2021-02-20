package com.viral.user.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "userDtls", uniqueConstraints = {
		@UniqueConstraint(columnNames = "MOBILE_NO"),
		@UniqueConstraint(columnNames = "EMAIL_ID") })
public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userId_pk", columnDefinition = "INT")
	private Long userId;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="MOBILE_NO")
	private Long mobileNo;
	
	@Column(name="EMAIL_ID")
	private String emailId;
	
	//1. admin,  
	//2. merchant,  
	//3. endUser
	@Column(name="USER_TYPE")
	private String type;
	
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="USER_ID")
	private List<Address> address;

	public Long getUserId() {
		return userId;
	}
	
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
		
}
