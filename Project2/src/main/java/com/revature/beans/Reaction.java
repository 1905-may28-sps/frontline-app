package com.revature.beans;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name="F_REACTION")
public class Reaction  {

	@EmbeddedId
	private ReactionComposite reactionId;
	
	@ManyToOne
	private ReactionType reactionType;
	
	public Reaction() {}

	public Reaction(ReactionComposite reactionId, ReactionType reactionType) {
		super();
		this.reactionId = reactionId;
		this.reactionType = reactionType;
	}

	public ReactionComposite getReactionId() {
		return reactionId;
	}

	public void setReactionId(ReactionComposite reactionId) {
		this.reactionId = reactionId;
	}

	public ReactionType getReactionType() {
		return reactionType;
	}

	public void setReactionType(ReactionType reactionType) {
		this.reactionType = reactionType;
	}

	@Override
	public String toString() {
		return "Reaction [reactionId=" + reactionId + ", reactionType=" + reactionType + "]";
	}

	
	
	
}