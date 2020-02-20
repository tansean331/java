package com.tjh.student;

import java.util.ArrayList;

public class CourseManager {
	ArrayList<Course> courses;
	int cTotal = 0;
	
	public CourseManager() {
		// TODO Auto-generated constructor stub
		courses = new ArrayList<Course>();
		courses.add(new Course(cTotal++, "Ӣ��", 1, 1, "����ʦ", false));
		courses.add(new Course(cTotal++, "C����", 1, 1, "����ʦ", false));
		courses.add(new Course(cTotal++, "Java", 1, 1, "����ʦ", false));
	}
	
	public void addStudent(Course s) {
		courses.add(s);
	}
	
	public void removeStudent(Course s) {
		courses.remove(s);
	}
	
	public void printAllStudent() {
		for(int i = 0; i < courses.size(); i++)
		{
			courses.get(i).print();
		}
	}
}
