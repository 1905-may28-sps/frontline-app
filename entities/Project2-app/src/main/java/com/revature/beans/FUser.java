package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import org.springframework.stereotype.Component;


@Component
@Entity
public class FUser {
 
    
    @Id
    @SequenceGenerator(name="USER_SEQ_GEN", sequenceName="USER_SEQ", allocationSize=1)
    @GeneratedValue(generator="USER_SEQ_GEN", strategy=GenerationType.SEQUENCE)
    private int userId;
    
    @Column(nullable=false, unique=true)
    private String username;
    
    @Column(nullable=false)
    private String firstName;
    
    @Column(nullable=false)
    private String lastName;
    
    @OneToOne
    //@Column(nullable=false)
    private Role roleId;
    
    @Column(nullable=true)
    private String image;
    
    @OneToOne
   
    private Banned bannedId;
    @OneToOne
    //@Column(nullable=false)
    private Theme themeId;
    
    
    
    public FUser() {}


	public FUser(int userId, String username, String firstName, String lastName, Role roleId, String image,
			Banned bannedId, Theme themeId) {
		super();
		this.userId = userId;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.roleId = roleId;
		this.image = image;
		this.bannedId = bannedId;
		this.themeId = themeId;
	}


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


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Role getRoleId() {
		return roleId;
	}


	public void setRoleId(Role roleId) {
		this.roleId = roleId;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public Banned getBannedId() {
		return bannedId;
	}


	public void setBannedId(Banned bannedId) {
		this.bannedId = bannedId;
	}


	public Theme getThemeId() {
		return themeId;
	}


	public void setThemeId(Theme themeId) {
		this.themeId = themeId;
	}
    


}
