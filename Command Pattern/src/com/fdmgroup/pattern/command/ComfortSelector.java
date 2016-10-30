package com.fdmgroup.pattern.command;

public class ComfortSelector
{
	protected enum LEVEL {SPORT, ECONOMIC, CRUISE, CITY};
	public static ComfortController getComfortLevel(LEVEL level)
	{
			if(level == LEVEL.SPORT)
				return new Sport();
			else if (level == LEVEL.ECONOMIC)
				return new Economy();
			else if (level == LEVEL.CRUISE)
				return new Cruiser();
			else if (level == LEVEL.CITY)
				return new City();
				return null;			
	}
}
