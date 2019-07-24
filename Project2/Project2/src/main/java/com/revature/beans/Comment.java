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
@Table(name="F_COMMENT")
public class Comment {
	 @Id
	 @SequenceGenerator(name="F_Comment_SEQ_GEN", sequenceName="F_Comment_SEQ", allocationSize=1)
	 @GeneratedValue(generator="F_Comment_SEQ_GEN", strategy=GenerationType.SEQUENCE)
	private int id;
	
	@Column(nullable=false)
	private String timestamp;
	
	 @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="userId", nullable=false)
	
	private User userId;
	
	 @ManyToOne(fetch=FetchType.EAGER)
	    @JoinColumn(name="postId", nullable=false)
	private Post postId;
	
	public Comment() {}

	public Comment(int id, String timestamp, User userId, Post postId) {
		super();
		this.id = id;
		this.timestamp = timestamp;
		this.userId = userId;
		this.postId = postId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public Post getPostId() {
		return postId;
	}

	public void setPostId(Post postId) {
		this.postId = postId;
	}
	
	

}
