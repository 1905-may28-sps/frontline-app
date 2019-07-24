package com.revature.beans;

import java.io.Serializable;

import javax.persistence.Embeddable;
@Embeddable
public class FollowComposite implements Serializable {
	private int followerId;
	private int followedId;
	
	public FollowComposite() {}

	public FollowComposite(int followerId, int followedId) {
		super();
		this.followerId = followerId;
		this.followedId = followedId;
	}

	public int getFollowerId() {
		return followerId;
	}

	public void setFollowerId(int followerId) {
		this.followerId = followerId;
	}

	public int getFollowedId() {
		return followedId;
	}

	public void setFollowedId(int followedId) {
		this.followedId = followedId;
	};
	
	
	

}
