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

import org.springframework.stereotype.Component;


@Component
@Entity
public class FComment {
	 @Id
	 @SequenceGenerator(name="FComment_SEQ_GEN", sequenceName="FComment_SEQ", allocationSize=1)
	 @GeneratedValue(generator="FComment_SEQ_GEN", strategy=GenerationType.SEQUENCE)
	private int id;
	
	@Column(nullable=false)
	private String timestamp;
	
	 @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="userId", nullable=false)
	
	private FUser userId;
	
	 @ManyToOne(fetch=FetchType.EAGER)
	    @JoinColumn(name="postId", nullable=false)
	private Post postId;
	
	public FComment() {}

	public FComment(int id, String timestamp, FUser userId, Post postId) {
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

	public FUser getUserId() {
		return userId;
	}

	public void setUserId(FUser userId) {
		this.userId = userId;
	}

	public Post getPostId() {
		return postId;
	}

	public void setPostId(Post postId) {
		this.postId = postId;
	}
	
	

}
