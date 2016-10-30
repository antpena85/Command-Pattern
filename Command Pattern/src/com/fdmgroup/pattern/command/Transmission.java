package com.fdmgroup.pattern.command;

public class Transmission implements SendCommand
{
ComfortController controller;
	
	public Transmission(ComfortController controller)
	{
		this.controller = controller;
	}
	
	
	@Override
	public void execute()
	{
		controller.transmissionResponse();
	}


	@Override
	public void undo()
	{
		// TODO Auto-generated method stub
		
	}
}
