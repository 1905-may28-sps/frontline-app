package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="F_BANNED")
public class Banned {

    @Id
    private int bannedId;
    @Column(nullable=false)
    private String bannedType;
    
    public Banned() {    }
    

	public Banned(int bannedId, String bannedType) {
		super();
		this.bannedId = bannedId;
		this.bannedType = bannedType;
	}


	public int getBannedId() {
		return bannedId;
	}

	public void setBannedId(int bannedId) {
		this.bannedId = bannedId;
	}

	public String getBannedType() {
		return bannedType;
	}

	public void setBannedType(String bannedType) {
		this.bannedType = bannedType;
	}

	@Override
	public String toString() {
		return "Banned [bannedId=" + bannedId + ", bannedType=" + bannedType + "]";
	}
    
    

}