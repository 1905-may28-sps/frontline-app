package com.revature.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="F_REACTIONTYPE")
public class ReactionType {
	
	@Id
	@SequenceGenerator(name="REACTIONTYPE_GEN", sequenceName="REACTIONTYPE_SEQ", allocationSize=1)
	@GeneratedValue(generator="REACTIONTYPE_GEN", strategy=GenerationType.SEQUENCE)
	private int reactionTypeId;
	private String reactionType;
	
	public ReactionType() {}

	public ReactionType(int reactionTypeId, String reactionType) {
		super();
		this.reactionTypeId = reactionTypeId;
		this.reactionType = reactionType;
	}

	public int getReactionTypeId() {
		return reactionTypeId;
	}

	public void setReactionTypeId(int reactionTypeId) {
		this.reactionTypeId = reactionTypeId;
	}

	public String getReactionType() {
		return reactionType;
	}

	public void setReactionType(String reactionType) {
		this.reactionType = reactionType;
	}

	


	
}