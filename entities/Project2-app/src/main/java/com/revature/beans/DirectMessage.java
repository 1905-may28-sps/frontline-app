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
@Table(name="F_DIRECTMESSAGE")
public class DirectMessage {
    
    @Id
    @SequenceGenerator(name="DIRECTMESSAGE_SEQ_GEN", sequenceName="DIRECTMESSAGE_SEQ", allocationSize=1)
    @GeneratedValue(generator="DIRECTMESSAGE_SEQ_GEN", strategy=GenerationType.SEQUENCE)
    private int directMessageId;
    
    @Column(nullable=false)
    private String body;
    
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="senderId", nullable=false)
   // @Column(nullable=false)
    private User sender;
    
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="userId", nullable=false)
   // @Column(nullable=false)
    private User reciever; 
    
    public DirectMessage () {}

   
    public DirectMessage(int directMessageId, String body, User sender, User reciever) {
		super();
		this.directMessageId = directMessageId;
		this.body = body;
		this.sender = sender;
		this.reciever = reciever;
	}


	public int getDirectMessageId() {
		return directMessageId;
	}


	public void setDirectMessageId(int directMessageId) {
		this.directMessageId = directMessageId;
	}


	public String getBody() {
		return body;
	}


	public void setBody(String body) {
		this.body = body;
	}


	public User getSender() {
		return sender;
	}


	public void setSender(User sender) {
		this.sender = sender;
	}


	public User getReciever() {
		return reciever;
	}


	public void setReciever(User reciever) {
		this.reciever = reciever;
	}


	@Override
    public String toString() {
        return "DirectMessage [directMessageId=" + directMessageId + ", body=" + body + ", sender=" + sender
                + ", reciever=" + reciever + "]";
    }}
