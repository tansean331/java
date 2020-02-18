package com.tjh.mhw;


public class Enemy {
	private String name_;
	private int hp_;
	public String getName() {
		return name_;
	}
	public void setName(String name) {
		this.name_ = name;
	}
	
	public int getHp() {
		return hp_;
	}
	public void setHp(int hp) {
		this.hp_ = hp;
	}
	public Enemy() {
		
		
	}
	public Enemy(String name, int hp) {
		super();
		this.name_ = name;
		this.hp_ = hp;
	}
	public void Attack(Role r) {
		//��һ���˺�
		   int injury = (int)(Math.random()*9 + 10);
		//���ɫ��Ѫ��
		   int hp = r.getHp_();
		   hp -= injury;
		   //Ѫ��Ϊ0ʱ
		   if(hp>=0) {
			   r.setHp(hp);
		   }else {
			   r.setHp(0);
		   }
	}
}

