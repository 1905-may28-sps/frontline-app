package com.revature.beans;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;


@Entity
public class Follow {
	
	@EmbeddedId
	private FollowComposite followId;
	
}
