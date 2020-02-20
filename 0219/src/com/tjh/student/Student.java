package com.tjh.student;

import java.util.ArrayList;

public class Student {
	private int ID;
	private String name;
	private String sex;
	private String sclass;//班级
	private String birth;
	private String major;//专业
	private ArrayList<Course> courses;
	
	public Student(int ID, String name, String sex, String sclass) {
		// TODO Auto-generated constructor stub
		this.ID = ID;
		this.name = name;
		this.sex = sex;
		this.sclass = sclass;
		this.birth = "19970101";
		this.major = "软件工程";
		this.courses = new ArrayList<Course>();
	}
	
	public void addCourse(Course c) {
		courses.add(c);
	}
	
	public void removeCourse(Course c) {
		courses.remove(c);
	}
	
	public void printStudents() {
		System.out.println("该学生共有课程 :" + courses.size() + "  以下为课程表：");
		for(int i = 0; i < courses.size(); i++)
		{
			courses.get(i).print();
		}
	}
	
	public void print() {
		System.out.println("ID：" + ID + "  姓名：" + name + "  性别：" + sex + "  班级：" + sclass + 
							" 专业：" + major + "  " + "生日：" + birth + "  选课数：" + courses.size());
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSclass() {
		return sclass;
	}
	public void setSclass(String sclass) {
		this.sclass = sclass;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public ArrayList<Course> getCourses() {
		return courses;
	}
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
}
