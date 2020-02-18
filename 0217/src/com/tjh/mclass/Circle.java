package com.tjh.mclass;

public class Circle {
	Point p_;
	int r_;
	public Circle() {
		// TODO Auto-generated method stub

	}
	
	public Circle(Point p, int r) {
		p_ = p;
		r_ = r;
	}
	
	public double getArea() {
		return (3.14 * r_ * r_);
	}
	
	public boolean isContains(int x, int y) {
		return (Math.sqrt((p_.x_ - x) * (p_.x_ - x) + (p_.y_ - y) * (p_.y_ - y)) <= r_);
	}
	public static void main(String[] args) {
		Point point = new Point(3,3);
		Circle circle = new Circle(point, 3);
		System.out.println(circle.getArea());
		System.out.println(circle.isContains(1, 5));
	}	
}
