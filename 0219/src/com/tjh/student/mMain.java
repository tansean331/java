package com.tjh.student;

import java.util.ArrayList;
import java.util.Scanner;

public class mMain {
	public static void main(String[] args) {
		StudentManager studentManager = new StudentManager();
		CourseManager courseManager = new CourseManager();
		
		while(true)
		{
			System.out.println("1���½�ѧУ\n 2��ѧ������\n 3���γ̹���\n 4���˳�ϵͳ");
			Scanner scanner1 = new Scanner(System.in);
			String str1 = scanner1.next();
			int selectnum1 = Integer.parseInt(str1);
			
			switch (selectnum1) {
			case 1:
				
				break;
			case 2:
				System.out.println(" " + "1������ѧ��\n 2���޸�ѧ��\n 3��ɾ��ѧ��(����)\n 4����ѯѧ����������\n 5����ӡѧ��\n 6������");
				Scanner scanner2 = new Scanner(System.in);
				String str2 = scanner2.next();
				int selectnum2 = Integer.parseInt(str2);
				int []nums = new int[3] {1,2};
				switch (selectnum2) {
				case 1:
					studentManager.addStudent();
					break;
				case 2:
					
					break;
				case 3:
					studentManager.removeStudent();
					break;
				case 4:
					
					break;
				case 5:
					studentManager.printAllStudent();
					break;
				case 6:
					
					break;
				default:
					break;
				}
				break;
			default:
				break;
			}
		}
	}
	
	public static void Add(Student s, Course c) {
		if(!s.getCourses().contains(c) && !c.getStudents().contains(s))
		{
			s.addCourse(c);
			c.addStudent(s);
		}
	}
	
	public static void Remove(Student s, Course c) {
		if(!s.getCourses().contains(c) && !c.getStudents().contains(s))
		{
			s.removeCourse(c);
			c.removeStudent(s);
		}
	}
}
