package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="F_POST")
public class Post {
	@Id
	@SequenceGenerator(name="POST_SEQ_GEN", sequenceName="POST_SEQ", allocationSize=1)
	@GeneratedValue(generator="POST_SEQ_GEN", strategy=GenerationType.SEQUENCE)
	private int postId;
	@ManyToOne(fetch=FetchType.EAGER)

	@JoinColumn(name="userId", nullable=false)
	private User user;
	@Column(nullable=true)
	private String body;
	
	@Column(nullable=false)
	private String timestamp;
	
	@Column
	private int point;
	

	public Post() {}
	
	


	public Post(int postId, User user, String body, String timestamp, int point) {
		super();
		this.postId = postId;
		this.user = user;
		this.body = body;
		this.timestamp = timestamp;
		this.point = point;
	}




	public int getPostId() {
		return postId;
	}


	public void setPostId(int postId) {
		this.postId = postId;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public String getBody() {
		return body;
	}


	public void setBody(String body) {
		this.body = body;
	}


	public String getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}


	public int getPoint() {
		return point;
	}


	public void setPoint(int point) {
		this.point = point;
	}




	@Override
	public String toString() {
		return "Post [postId=" + postId + ", user=" + user + ", body=" + body + ", timestamp=" + timestamp + ", point="
				+ point + "]";
	}

	

}
