package com.fdmgroup.pattern.command;

public class City implements ComfortController {

	@Override
	public void suspensionStiffness() {
		System.out.println("Extremely Soft");
	}

	@Override
	public void horsePower() {
		System.out.println("Low end torque");
	}

	@Override
	public void transmissionResponse() {
		System.out.println("shift 4000rpm");
	}

}
