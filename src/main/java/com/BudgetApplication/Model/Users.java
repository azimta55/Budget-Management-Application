package com.BudgetApplication.Model;

import java.util.Arrays;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.BudgetApplication.Address.HomeAddress;





@Entity
@Table(name = "Users")
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long userId;
	String name;
	

	@Embedded
	private HomeAddress homeAddress;
	
	
	@Lob
	private byte[] userimage;


	public Users(Long userId, String name, HomeAddress homeAddress, byte[] userimage) {
		super();
		this.userId = userId;
		this.name = name;
		this.homeAddress = homeAddress;
		this.userimage = userimage;
	}


	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}


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


	public HomeAddress getHomeAddress() {
		return homeAddress;
	}


	public void setHomeAddress(HomeAddress homeAddress) {
		this.homeAddress = homeAddress;
	}


	public byte[] getUserimage() {
		return userimage;
	}


	public void setUserimage(byte[] userimage) {
		this.userimage = userimage;
	}


	@Override
	public String toString() {
		return "Users [userId=" + userId + ", name=" + name + ", homeAddress=" + homeAddress + ", userimage="
				+ Arrays.toString(userimage) + "]";
	}
	
	
	
	
	
	
	

}
