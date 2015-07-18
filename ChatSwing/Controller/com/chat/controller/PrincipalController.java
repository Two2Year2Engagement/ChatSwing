package com.chat.controller;

import java.util.List;

/**
 * 
 * @author wahrons
 * @Date 17/07/2015
 * @version 1.0
 */
public interface PrincipalController {

	Controller getSpecificController(Comparable panel);

	List<Controller> getControllerList();
	
	
	
}
