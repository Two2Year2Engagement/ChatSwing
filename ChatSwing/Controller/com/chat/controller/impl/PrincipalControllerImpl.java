package com.chat.controller.impl;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import com.chat.controller.Controller;
import com.chat.controller.PrincipalController;
import com.google.common.base.Objects;
/**
 * 
 * @author wahrons
 * @Date 17/07/2015
 * @version 1.0
 */
public class PrincipalControllerImpl implements PrincipalController {

	List<Controller> controllers;
	
	private PrincipalControllerImpl(){
		controllers= new ArrayList<Controller>();
	}
	
	
	@Override
	public List<Controller> getControllerList() {
		return controllers;
	}
	
	@Override
	public Controller getSpecificController(Comparable panel) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	private class textAreaController implements Controller{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
	}




	


	

}
