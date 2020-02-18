package com.tjh.mperson;

public class Vechicle {
	String name_ ;
	int speed_;
	int size_;
	
	public Vechicle() {
		// TODO Auto-generated constructor stub
	}
	public Vechicle(String name, int speed, int size) {
		name_ = name;
		speed_ = speed;
		size_ = size;
	}
	
	public void getSpeed()
	{
		System.out.println(name_ + " 当前时速：" + speed_ + "千米/时");
	}
	public void setSpeed(int speed) {
		speed_ = speed;
		System.out.println(name_ + " 当前时速：" + speed_ + "千米/时");
	}
}
