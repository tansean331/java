package com.tjh.student;

import java.util.ArrayList;

public class Student {
	private int ID;
	private String name;
	private String sex;
	private String sclass;//�༶
	private String birth;
	private String major;//רҵ
	private ArrayList<Course> courses;
	
	public Student(int ID, String name, String sex, String sclass) {
		// TODO Auto-generated constructor stub
		this.ID = ID;
		this.name = name;
		this.sex = sex;
		this.sclass = sclass;
		this.birth = "19970101";
		this.major = "�������";
		this.courses = new ArrayList<Course>();
	}
	
	public void addCourse(Course c) {
		courses.add(c);
	}
	
	public void removeCourse(Course c) {
		courses.remove(c);
	}
	
	public void printStudents() {
		System.out.println("��ѧ�����пγ� :" + courses.size() + "  ����Ϊ�γ̱�");
		for(int i = 0; i < courses.size(); i++)
		{
			courses.get(i).print();
		}
	}
	
	public void print() {
		System.out.println("ID��" + ID + "  ������" + name + "  �Ա�" + sex + "  �༶��" + sclass + 
							" רҵ��" + major + "  " + "���գ�" + birth + "  ѡ������" + courses.size());
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
