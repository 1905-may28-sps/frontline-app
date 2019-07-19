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
    private FUser sender;
    
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="userId", nullable=false)
   // @Column(nullable=false)
    private FUser reciever; 
    
    public DirectMessage () {}

   
    public DirectMessage(int directMessageId, String body, FUser sender, FUser reciever) {
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


	public FUser getSender() {
		return sender;
	}


	public void setSender(FUser sender) {
		this.sender = sender;
	}


	public FUser getReciever() {
		return reciever;
	}


	public void setReciever(FUser reciever) {
		this.reciever = reciever;
	}


	@Override
    public String toString() {
        return "DirectMessage [directMessageId=" + directMessageId + ", body=" + body + ", sender=" + sender
                + ", reciever=" + reciever + "]";
    }}
