package com.tjh.mclass;

import java.sql.SQLException;

public class Demo {
	public static void main(String[] args) {

		MysqlDemo mysqlDemo = new MysqlDemo();
		try {
			System.out.println("���в�ѯ");
			mysqlDemo.selectAll();
			mysqlDemo.print();
			System.out.println("ɾ��");
			mysqlDemo.delete(100);
			System.out.println("����");
			mysqlDemo.insert(100, "��Ƥ", "��", "123@123.com");
			mysqlDemo.select(100);
			System.out.println("��ѯ");
			mysqlDemo.print();
			mysqlDemo.ConnectionClose();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
