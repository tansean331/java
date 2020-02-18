package com.tjh.mhw;

//定义一个游戏角色人物类(数组+流程控制语句+面向对象完成)
//游戏角色应有以下属性：名字、性别、种族、职业、力量、敏捷、体力、智力、智慧、生命值和魔法值还有等级,还有金币
//本题目要求力量、敏捷、体力、智力和智慧要求是随机值(最大值限定9999)
//编写程序:
//要求控制台输出如下信息:
//这是一个RPG游戏:
//1.新建游戏
//2.游戏规则
//3.结束游戏(Sytem.exit(0)结束程序)
//4.添加游戏角色(数组存放)
//6.查询所有游戏角色
//7.删除角色
//8.查看当前时间
//以下为示例:
//请输入您想进行的操作:(1-3) 1
//请输入您游戏角色的姓名:李白  
//请输入游戏角色的种族:(1.人类 2.精灵 3.兽人 4.矮人 5.元素)
//创建成功!!!
//请输入您想进行的操作:(1-3) 2
//游戏规则:xxxxxxxxxxxx   
//请输入您想进行的操作:(1-3) 3
//系统退出


public class Role {
	String name_;
	String sex_;
	String race_;
	
	int strength_;//力量
	int agility_;//敏捷
	int stamina_;//体力
	int intelligence_;//智力
	
	int hp_;
	int mp_;
	
	int experience_;
	int levels;//等级
	int gold;//金币
	
	public Role() {
		// TODO Auto-generated constructor stub
	}
	
	public Role(String name, String sex, String race) {
		// TODO Auto-generated constructor stub
		name_ = name;
		sex_ = sex;
		race_ = race;
		
		strength_ = (int)(1 + Math.random() * 9);
		agility_ = (int)(2 + Math.random()* 8);
		stamina_ = (int)(2 + Math.random()* 8);
		intelligence_ = (int)(1 + Math.random()* 8);
		
		hp_ = agility_+2 + 120;
		mp_ = intelligence_ * 2 + 20;
		
		experience_ = 0;
		levels = 0;
		gold = 0;
	}
	
	public void print() {
		System.out.println("名字 ：" + name_ + " " + "性别 ：" + sex_ + " " + "种族 ：" + race_ + " " + 
				"力量 ：" + strength_ + " " + "体力 ：" + agility_ + " " + "敏捷 ：" + stamina_ + " " + "智力 ：" + intelligence_ + " " +
				"hp ：" + hp_ + " " + "mp ：" + mp_ + " " + "等级 ：" + levels + " " + "金币 ：" + gold);
	}
	
	public void setHp(int hp) {
		this.hp_ = hp;
	}
	
	public String useAttack(Enemy[] m, int msize) {
		int num = (int)(Math.random()*10);
		int mnum = (int)(Math.random()*msize);
		String s = "";
		if(num < 6) {
			Attack(m[mnum]);
			s = "普通攻击";
			return s;
		}else if(num >= 6 && num <=8) {
			MagicAttack(m);
			s = "破釜沉舟";
			return s;
		}else {
			HugeAttack(m[mnum]);
			s = "虎啸龙吟";
			return s;
		}
	}
	//普通攻击
	public void Attack(Enemy m) {
	   //做一个伤害
	   int injury = (int)(Math.random()*10+20);
	   //获取自己的血量
	   int hp = m.getHp();
	   hp -= injury;
	   //血量为0时
	   if(hp>=0) {
		   m.setHp(hp);
	   }else {
		   m.setHp(0);
	   }
 
   }
	//必杀攻击虎啸龙吟
   public void HugeAttack(Enemy m) {
	   //做一个伤害
	   int injury = (int)(m.getHp()*0.75) > 60 ? (int)(m.getHp()*0.75) : 60;
	   //获取自己的血量
	   int hp = m.getHp();
	   hp -= injury;
	   //血量为0时
	   if(hp>=0) {
		   m.setHp(hp);
	   }else {
		   m.setHp(0);
	   }
	   
   }
   //魔法攻击破釜沉舟
   public void MagicAttack(Enemy[] m) {
	   for(Enemy ms :m) {//数组里面
		   int hp = ms.getHp();
		   hp-= 30;
		 //血量为0时
		   if(hp>=0) {
			   ms.setHp(hp);
		   }else {
			   ms.setHp(0);
		   }
	   } 
   }
   public String getName_() {
		return name_;
	}
	public String getSex_() {
		return sex_;
	}
	public String getRace_() {
		return race_;
	}
	public int getStrength_() {
		return strength_;
	}
	public int getAgility_() {
		return agility_;
	}
	public int getStamina_() {
		return stamina_;
	}
	public int getIntelligence_() {
		return intelligence_;
	}
	public int getHp_() {
		return hp_;
	}
	public int getMp_() {
		return mp_;
	}
	public int getExperience_() {
		return experience_;
	}
	public int getLevels() {
		return levels;
	}
	public int getGold() {
		return gold;
	}
	
}
