package com.arc.s2;

import org.springframework.stereotype.Component;

@Component
public class Wheel {
	
	private String brand;
	private int size;
	
	public Wheel(String brand, int size) {
		this.brand = brand;
		this.size = size;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
}
