package com.tjh.mperson;

public class Person {
	int ID_;
	String name_;
	String sex_;
	int age_;
	boolean isMarried_;
	String IDcard_;
	String addr_;
	String phone_;
	String spouse_;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(int id, String name, String sex,int age, String idcard, String addr, String phone, String spouse) {
		// TODO Auto-generated constructor stub
		ID_ = id;
		name_ = name;
		sex_ = sex;
		age_ = age;
		IDcard_ = idcard;
		addr_ = addr;
		phone_ = phone;
		spouse_ = spouse;
		if(spouse_ != null)
		{
			isMarried_ = true;
		}
		else {
			isMarried_ = false;
		}
	}
	
	public boolean getMarried(String name) {
		// TODO Auto-generated method stub
		System.out.println(name_ + "想与" + name + "结为夫妻 ");
		if(!isMarried_){
			spouse_ = name;
			isMarried_ = true;
			System.out.println("恭喜你们 :  " + name_ + " 与 " + spouse_ + "共连理！！");
			return true;
		}
		else {
			System.out.println("渣男！ 已有配偶 : " + spouse_);
			return false;
		}
	}
	
	public void print() {
		System.out.println(ID_ + "  " + "姓名： " + name_ + "  " + "性别： " + sex_ + "  " + "婚否： " +
						   isMarried_ + "  " + "身份证： " + IDcard_ + "  " + "地址： " + addr_ + "  " + "电话： " +
						   phone_ + "  " + "配偶： " + spouse_ + "  ");
		
	}
	public static void main(String[] args) {
		Person one = new Person(1, "郭子铁", "男", 23, "1234567894XXXXX", "山西省XXX", "139XXXXXXX", "解解");
		one.print();
		one.getMarried("玲玲");
		
		Vechicle baoma = new Vechicle("宝马", 300, 100);
		baoma.getSpeed();
		baoma.setSpeed(315);
	}
}
