package com.fdmgroup.pattern.command;

import com.fdmgroup.pattern.command.ComfortSelector.LEVEL;


public class CommandPatternTest
{

	
	public static void main(String[] args)
	{
		ComfortController controller;
		
		
		controller = ComfortSelector.getComfortLevel(LEVEL.CITY);
		Suspension setSuspension = new Suspension(controller);
		Horsepower setHorsepower = new Horsepower(controller);
		Transmission setTransmission = new Transmission(controller);
		Select select = new Select();
		select.takeCommand(setSuspension);
		select.takeCommand(setHorsepower);
		select.takeCommand(setTransmission);
		
		select.placeCommand();

	}

}
