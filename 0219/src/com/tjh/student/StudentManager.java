package com.tjh.student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
	ArrayList<Student> slArrayList;
	int ID = 0;
	public StudentManager() {
		// TODO Auto-generated constructor stub
		slArrayList = new ArrayList<Student>();
		slArrayList.add(new Student(this.ID++, "铁皮", "男", "1612"));
		slArrayList.add(new Student(this.ID++, "峰哥", "男", "1612"));
		slArrayList.add(new Student(this.ID++, "裕总", "男", "1612"));
	}
	
	public void addStudent(Student s) {
		slArrayList.add(s);
	}
	public void addStudent() {
		System.out.println("输入姓名：");
		Scanner scannerName = new Scanner(System.in);
		String Name = scannerName.next();
		System.out.println("输入性别：");
		Scanner scannerSex = new Scanner(System.in);
		String Sex = scannerSex.next();
		System.out.println("输入班级：");
		Scanner scannerClass = new Scanner(System.in);
		String Sclass = scannerClass.next();
		slArrayList.add(new Student(this.ID++, Name, Sex, Sclass));
	}
	
	public void removeStudent(Student s) {
		slArrayList.remove(s);
	}
	
	public void removeStudent() {
		System.out.println("输入姓名：");
		Scanner scannerName = new Scanner(System.in);
		String Name = scannerName.next();
		for(int i = 0; i < slArrayList.size(); i++)
		{
			if(slArrayList.get(i).getName().equals(Name))
			{
				slArrayList.remove(i);
			}
		}
		
	}
	
	public void printAllStudent() {
		for(int i = 0; i < slArrayList.size(); i++)
		{
			slArrayList.get(i).print();
		}
	}
}
