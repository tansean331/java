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
		System.out.println(name_ + "����" + name + "��Ϊ���� ");
		if(!isMarried_){
			spouse_ = name;
			isMarried_ = true;
			System.out.println("��ϲ���� :  " + name_ + " �� " + spouse_ + "��������");
			return true;
		}
		else {
			System.out.println("���У� ������ż : " + spouse_);
			return false;
		}
	}
	
	public void print() {
		System.out.println(ID_ + "  " + "������ " + name_ + "  " + "�Ա� " + sex_ + "  " + "��� " +
						   isMarried_ + "  " + "���֤�� " + IDcard_ + "  " + "��ַ�� " + addr_ + "  " + "�绰�� " +
						   phone_ + "  " + "��ż�� " + spouse_ + "  ");
		
	}
	public static void main(String[] args) {
		Person one = new Person(1, "������", "��", 23, "1234567894XXXXX", "ɽ��ʡXXX", "139XXXXXXX", "���");
		one.print();
		one.getMarried("����");
		
		Vechicle baoma = new Vechicle("����", 300, 100);
		baoma.getSpeed();
		baoma.setSpeed(315);
	}
}
