package com.fdmgroup.pattern.command;

public class Suspension implements SendCommand

{
	ComfortController controller;
	
	public Suspension(ComfortController controller)
	{
		this.controller = controller;
	}
	
	
	@Override
	public void execute()
	{
		controller.suspensionStiffness();
	}


	@Override
	public void undo()
	{
		// TODO Auto-generated method stub
		
	}

}
