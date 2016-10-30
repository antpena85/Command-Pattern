package com.fdmgroup.pattern.command;

import java.util.ArrayList;
import java.util.List;

public class Select
{
//	SendCommand command;
//	
//	public Select(SendCommand command)
//	{
//		this.command = command;
//	}
//	
//	public void press()
//	{
//		command.execute(); 
//	}
	
	private List<SendCommand> sendList = new ArrayList<SendCommand>();
	
	public void takeCommand(SendCommand command)
	{
		sendList.add(command);
	}
	public void placeCommand()
	{
		for(SendCommand command: sendList)
			command.execute();
		sendList.clear();
	}
	
}
