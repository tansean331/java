package com.tjh.student;

import java.util.ArrayList;
import java.util.Scanner;

public class mMain {
	public static void main(String[] args) {
		StudentManager studentManager = new StudentManager();
		CourseManager courseManager = new CourseManager();
		
		while(true)
		{
			System.out.println("1、新建学校\n 2、学生管理\n 3、课程管理\n 4、退出系统");
			Scanner scanner1 = new Scanner(System.in);
			String str1 = scanner1.next();
			int selectnum1 = Integer.parseInt(str1);
			
			switch (selectnum1) {
			case 1:
				
				break;
			case 2:
				System.out.println(" " + "1、增加学生\n 2、修改学生\n 3、删除学生(姓名)\n 4、查询学生（姓名）\n 5、打印学生\n 6、返回");
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
