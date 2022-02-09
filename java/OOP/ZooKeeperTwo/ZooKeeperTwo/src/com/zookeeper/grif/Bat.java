package com.zookeeper.grif;

public class Bat extends Mammal {
	public Bat() {
		this.setEnergyUp(200);
	}
	public void fly() {
		this.setEnergyDown(50);
		System.out.println("flap flap! -50 energy");
	}
	public void eatHumans() {
		this.setEnergyUp(25);
		System.out.println("Eating humans + 25 energy");
	}
	public void attackTown() {
		this.setEnergyDown(100);
		System.out.println("the sound of burning - 100 energy");
	}
}