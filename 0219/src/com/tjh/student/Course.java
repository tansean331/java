package com.tjh.student;

import java.util.ArrayList;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Course {
	private int cID;
	private String cName;
	private int cNth; //�ڼ��ڿ�  ��������1��2   ��������3��4
	private int cWeek;
	private String cTeacher;
	private boolean isExperiment;
	private ArrayList<Student> students;
	
	public Course(int cID, String name, int week, int cNth, String teacher, Boolean isExperiment) {
		// TODO Auto-generated constructor stub
		this.cID = cID;
		this.cName = name;
		this.cWeek = week;
		this.cNth = cNth;
		this.cTeacher = teacher;
		this.isExperiment = isExperiment;
		students = new ArrayList<Student>();
	}
	
	public void addStudent(Student s) {
		students.add(s);
	}
	
	public void removeStudent(Student s) {
		students.remove(s);
	}
	
	public void printStudents() {
		System.out.println("�ÿγ̹���ѧ�� :" + students.size() + "  ����Ϊ������");
		for(int i = 0; i < students.size(); i++)
		{
			students.get(i).print();
		}
	}
	
	
	public void print() {
		System.out.println("cID��" + cID + "  �γ�����" + cName + " ����" + cWeek + " ��" + cNth + "�ڿ�  " + "  ������ʦ��" + cTeacher + 
							" �Ƿ�Ϊʵ��Σ�" + isExperiment + " ѡ��������" + students.size());
	}
	
	
	public int getcID() {
		return cID;
	}
	public void setcID(int cID) {
		this.cID = cID;
	}
	
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	
	public int getcNth() {
		return cNth;
	}
	public void setcNth(int cNth) {
		this.cNth = cNth;
	}
	
	public String getcTeacher() {
		return cTeacher;
	}
	public void setcTeacher(String cTeacher) {
		this.cTeacher = cTeacher;
	}
	
	public boolean getIsExperiment() {
		return isExperiment;
	}
	public void setIsExperiment(Boolean isExperiment) {
		this.isExperiment = isExperiment;
	}
	public int getcWeek() {
		return cWeek;
	}
	public void setcWeek(int cWeek) {
		this.cWeek = cWeek;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
}

