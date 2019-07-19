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
	@Column(nullable=true)
	private String image;
	@Column(nullable=false)
	private String title;
	@Column(nullable=false)
	private String timestamp;

	public Post() {}

	public Post(int postId, User user, String body, String image, String title, String timestamp) {
		super();
		this.postId = postId;
		this.user = user;
		this.body = body;
		this.image = image;
		this.title = title;
		this.timestamp = timestamp;
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "Post [postId=" + postId + ", user=" + user + ", body=" + body + ", image=" + image + ", title=" + title
				+ ", timestamp=" + timestamp + "]";
	}

	

}
