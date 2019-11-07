package com.arc.s2;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	private String fuel; //연료
	private int hp; //마력
	
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
}
