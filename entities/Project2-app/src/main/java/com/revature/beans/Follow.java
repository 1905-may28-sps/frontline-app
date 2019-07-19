package com.revature.beans;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="F_FOLLOW")
public class Follow {
	
	@EmbeddedId
	private FollowComposite followId;
	
}
