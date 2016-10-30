package com.fdmgroup.pattern.command;

public class Horsepower implements SendCommand
{

	ComfortController controller;
	
	public Horsepower(ComfortController controller)
	{
		this.controller = controller;
	}
	
	@Override
	public void execute()
	{
		controller.horsePower();
	}

	@Override
	public void undo()
	{
		// TODO Auto-generated method stub
		
	}

}
