package com.chat.dao;
/**
 * 
 * @author wahrons
 * @Date 17/07/2015
 * @version 1.0
 */
public interface GenericClientDAO<T> {
	
	void sendMessage(String message);
	
	void sendMessage(T message);
	
	
	
}
