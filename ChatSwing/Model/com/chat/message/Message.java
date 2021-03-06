package com.chat.message;

import org.joda.time.LocalTime;

/**
 * 
 * @author wahrons
 * @Date 17/07/2015
 * @version 1.0
 */
public class Message {

	private String fullMessage;
	
	private LocalTime messageTime;
		
	
	public String getFullMessage() {
		return fullMessage;
	}

	public void setFullMessage(String fullMessage) {
		this.fullMessage = fullMessage;
	}

	public LocalTime getMessageTime() {
		return messageTime;
	}

	public void setMessageTime(LocalTime messageTime) {
		this.messageTime = messageTime;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		return super.equals(o);
	}

	@Override
	public String toString() {
		StringBuffer messageContent = new StringBuffer();
		messageContent.append(this.getFullMessage() + "[ "+this.getMessageTime()+" ]");
		return super.toString();
	}
	
	
	
}
