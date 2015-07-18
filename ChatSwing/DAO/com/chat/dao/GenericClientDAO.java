package com.chat.dao;

public interface GenericClientDAO<T> {

	
	
	void sendMessage(String message);
	
	void sendMessage(T message);
	
	
	
}
