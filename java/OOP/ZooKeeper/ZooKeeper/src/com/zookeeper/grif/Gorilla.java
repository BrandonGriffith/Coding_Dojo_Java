package com.zookeeper.grif;

public class Gorilla extends Mammal {
	public Gorilla() {
		
	}
	public void throwBannan() {
		this.setEnergyDown(5);
		System.out.println("Bannan thrown! -5 energy");
	}
	public void eatBannan() {
		this.setEnergyUp(10);
		System.out.println("Eating bannan + 10 energy");
	}
	public void climbUp() {
		this.setEnergyDown(10);
		System.out.println("Climbing up - 10 energy");
	}
}