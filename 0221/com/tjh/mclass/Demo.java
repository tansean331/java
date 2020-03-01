package com.tjh.mclass;

import java.sql.SQLException;

public class Demo {
	public static void main(String[] args) {

		MysqlDemo mysqlDemo = new MysqlDemo();
		try {
			System.out.println("所有查询");
			mysqlDemo.selectAll();
			mysqlDemo.print();
			System.out.println("删除");
			mysqlDemo.delete(100);
			System.out.println("插入");
			mysqlDemo.insert(100, "铁皮", "郭", "123@123.com");
			mysqlDemo.select(100);
			System.out.println("查询");
			mysqlDemo.print();
			mysqlDemo.ConnectionClose();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
