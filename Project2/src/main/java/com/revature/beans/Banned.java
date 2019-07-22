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
    @SequenceGenerator(name="BANNED_SEQ_GEN", sequenceName="BANNED_U_SEQ", allocationSize=1)
    private int bannedId;
    @Column(nullable=false)
    private int bannedType;
    
    public Banned() {    }
    

	public Banned(int bannedId, int bannedType) {
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

	public int getBannedType() {
		return bannedType;
	}

	public void setBannedType(int bannedType) {
		this.bannedType = bannedType;
	}

	@Override
	public String toString() {
		return "Banned [bannedId=" + bannedId + ", bannedType=" + bannedType + "]";
	}
    
    

}