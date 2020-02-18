package com.tjh.mhw;

//����һ����Ϸ��ɫ������(����+���̿������+����������)
//��Ϸ��ɫӦ���������ԣ����֡��Ա����塢ְҵ�����������ݡ��������������ǻۡ�����ֵ��ħ��ֵ���еȼ�,���н��
//����ĿҪ�����������ݡ��������������ǻ�Ҫ�������ֵ(���ֵ�޶�9999)
//��д����:
//Ҫ�����̨���������Ϣ:
//����һ��RPG��Ϸ:
//1.�½���Ϸ
//2.��Ϸ����
//3.������Ϸ(Sytem.exit(0)��������)
//4.�����Ϸ��ɫ(������)
//6.��ѯ������Ϸ��ɫ
//7.ɾ����ɫ
//8.�鿴��ǰʱ��
//����Ϊʾ��:
//������������еĲ���:(1-3) 1
//����������Ϸ��ɫ������:���  
//��������Ϸ��ɫ������:(1.���� 2.���� 3.���� 4.���� 5.Ԫ��)
//�����ɹ�!!!
//������������еĲ���:(1-3) 2
//��Ϸ����:xxxxxxxxxxxx   
//������������еĲ���:(1-3) 3
//ϵͳ�˳�


public class Role {
	String name_;
	String sex_;
	String race_;
	
	int strength_;//����
	int agility_;//����
	int stamina_;//����
	int intelligence_;//����
	
	int hp_;
	int mp_;
	
	int experience_;
	int levels;//�ȼ�
	int gold;//���
	
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
		System.out.println("���� ��" + name_ + " " + "�Ա� ��" + sex_ + " " + "���� ��" + race_ + " " + 
				"���� ��" + strength_ + " " + "���� ��" + agility_ + " " + "���� ��" + stamina_ + " " + "���� ��" + intelligence_ + " " +
				"hp ��" + hp_ + " " + "mp ��" + mp_ + " " + "�ȼ� ��" + levels + " " + "��� ��" + gold);
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
			s = "��ͨ����";
			return s;
		}else if(num >= 6 && num <=8) {
			MagicAttack(m);
			s = "�Ƹ�����";
			return s;
		}else {
			HugeAttack(m[mnum]);
			s = "��Х����";
			return s;
		}
	}
	//��ͨ����
	public void Attack(Enemy m) {
	   //��һ���˺�
	   int injury = (int)(Math.random()*10+20);
	   //��ȡ�Լ���Ѫ��
	   int hp = m.getHp();
	   hp -= injury;
	   //Ѫ��Ϊ0ʱ
	   if(hp>=0) {
		   m.setHp(hp);
	   }else {
		   m.setHp(0);
	   }
 
   }
	//��ɱ������Х����
   public void HugeAttack(Enemy m) {
	   //��һ���˺�
	   int injury = (int)(m.getHp()*0.75) > 60 ? (int)(m.getHp()*0.75) : 60;
	   //��ȡ�Լ���Ѫ��
	   int hp = m.getHp();
	   hp -= injury;
	   //Ѫ��Ϊ0ʱ
	   if(hp>=0) {
		   m.setHp(hp);
	   }else {
		   m.setHp(0);
	   }
	   
   }
   //ħ�������Ƹ�����
   public void MagicAttack(Enemy[] m) {
	   for(Enemy ms :m) {//��������
		   int hp = ms.getHp();
		   hp-= 30;
		 //Ѫ��Ϊ0ʱ
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
