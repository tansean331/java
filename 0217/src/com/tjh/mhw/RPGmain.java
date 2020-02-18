package com.tjh.mhw;

import java.util.Scanner;


public class RPGmain {
	public static void main(String[] args) {
		Role roles[] = new Role[5];
		int roleNum= 0;
		while(true) {
			System.out.println("1.�½���Ϸ��ɫ\r\n" + 
					"2.��ʼ��Ϸ\r\n" + 
					"3.������Ϸ\r\n" + 
					"4.ɾ����ɫ\r\n" + 
					"5.�鿴��ǰʱ��");
			Scanner scanner = new Scanner(System.in);
			String str = scanner.next();
			int select = Integer.parseInt(str);
			switch (select) {
			case 1:
				if(roles[0] != null)
				{
					getRoles(roles,roleNum);
				}
				
				System.out.println("1.�����½�ɫ\r\n" + 
						"2.����");
				Scanner scanner_newGame = new Scanner(System.in);
				String str_newGame = scanner_newGame.next();
				int select_newGame = Integer.parseInt(str_newGame);
				switch (select_newGame) {
				case 1:
					System.out.println("��������Ϸ��ɫ����");
					Scanner scanner_name = new Scanner(System.in);
					String name = scanner_name.next();
					
					System.out.println("��ѡ����Ϸ��ɫ�Ա�1���У�2��Ů��");
					Scanner scanner_sex = new Scanner(System.in);
					String sex = scanner_sex.next();
					int select_sex = Integer.parseInt(sex);
					if(select_sex == 1)
						sex = "��";
					else
						sex = "Ů";
					
					System.out.println("��ѡ����Ϸ��ɫ���壨1����ߣ�2�����ţ�3�����֣�4��ؤ�5�����㣩");
					Scanner scanner_race = new Scanner(System.in);
					String race = scanner_race.next();
					int select_race = Integer.parseInt(race);
					switch (select_race) {
					case 1:
						race = "���";
						break;
					case 2:
						race = "����";				
						break;
					case 3:
						race = "����";
						break;
					case 4:
						race = "ؤ��";
						break;
					case 5:
						race = "����";
						break;
					default:
						break;
					}
					
					Role role = new Role(name, sex, race);
					roles[roleNum++] = role;
					break;
				case 2:
					break;
				default:
					
					break;
				}
				break;
			case 2:
				if(roles[0] == null)
				{
					System.out.println("======> �㻹û�д�����ɫ~ �����½���ɫ  <====== ");
					break;
				}
				int useRoleNum;
				System.out.println("��ѡ����ʹ�õ���Ϸ��ɫ(��1��ʼ)");
				Scanner scanner2 = new Scanner(System.in);
				String str2 = scanner2.next();
				useRoleNum = Integer.parseInt(str2) - 1;
				if(roles[useRoleNum] == null)
				{
					System.out.println("û�иý�ɫ������������");
					continue;
				}
				else {
					System.out.println("��ѡ��1������   2����ս");
					
				}
				int currentHp = roles[useRoleNum].hp_;
				Scanner scanner3 = new Scanner(System.in);
				String str3 = scanner3.next();
				int select_type = Integer.parseInt(str3);
				Enemy m1,m2;
				if(select_type == 1) {
					m1 = new Enemy("��ԣ",100);
					m2 = new Enemy("����",100);
				}else {
					m1 = new Enemy("��ԣ",300);
					m2 = new Enemy("����",300);
				}
				Enemy[] m = new Enemy[2];
				m[0] = m1;
				m[1] = m2;
				int total = 0;
				int mtotal = m.length;
				while(true) {
					System.out.println("========== �� "+total+" �غ�  ========== ");
					System.out.println(roles[useRoleNum].getName_()+" ��Ѫ��ʣ�ࣺ" + roles[useRoleNum].getHp_());
					int num = (int)(Math.random()*10);
					int mnum = (int)(Math.random()*(mtotal-1));
					for(int j = 0; j < m.length; j++) {
						if(m[mnum].getHp() == 0)
							mnum = (mnum + 1) % 4;
						else
							break;
					}
//					System.out.println(num); + 1 % 4
					String s = "";
					String mName = "";
					if(num < 6) {
						roles[useRoleNum].Attack(m[mnum]);
						s = "��ͨ����";
						mName = m[mnum].getName();
					}else if(num >= 6 && num <=8) {
						roles[useRoleNum].MagicAttack(m);
						s = "�Ƹ����۹���ȫ��";
					}else {
						roles[useRoleNum].HugeAttack(m[mnum]);
						s = "��Х��������";
						mName = m[mnum].getName();
					}
					System.out.println("ʹ���� " + s + mName + "ǿ��");
					for(int i1 = 0; i1 < m.length; i1 ++) {
						System.out.println(m[i1].getName() + "ǿ��  Ѫ�� " + m[i1].getHp());
					}
					mtotal = m.length;
					for(int i1 = 0; i1 < m.length; i1 ++) {
						if(m[i1].getHp() != 0) {
							System.out.println("ǿ��ʹ���� �չ�");
							m[i1].Attack(roles[useRoleNum]);
						}
						else {
							mtotal--;
						}
					}
					if(mtotal == 0)
					{
						roles[useRoleNum].hp_ = currentHp;
						int experience = (int)(1 + Math.random()*8 + 10);
						if(roles[useRoleNum].getExperience_() + experience >= 20){
							roles[useRoleNum].experience_ = experience % 20;
							roles[useRoleNum].levels++;
							roles[useRoleNum].hp_ += roles[useRoleNum].agility_ * 2;
							roles[useRoleNum].mp_ += roles[useRoleNum].intelligence_ * 2;
						}else {
							roles[useRoleNum].experience_ += experience;
						}
						roles[useRoleNum].gold += (int)(1 + Math.random()*8 + 10);
						System.out.println("���е�ǿ��������,���ʤ���������" + experience);
						System.out.println(roles[useRoleNum].name_ + " �ĵ�ǰ�ȼ�Ϊ " + roles[useRoleNum].levels);
						System.out.println("======== �� "+total+" �غϽ���  ========\n ");	
						break;
					}
					if(roles[useRoleNum].getHp_() == 0)
					{
						roles[useRoleNum].hp_ = currentHp;
						System.out.println("���Ѫ��Ϊ0,��սʧ���޾��飬����ȥ������");
						System.out.println("======== �� "+total+" �غϽ���  ======== \n");	
						break;
					}
					total++;
					System.out.println("======== �� "+total+" �غϽ���  ======== \n");	
				}
				break;
			case 3:
				System.out.println("��Ϸ��������л����");	
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}
	
	public static void getRoles(Role[] roles, int roleNum) {
		System.out.println("��ǰ��ɫ��\n" + "���� " + " \t" + "�Ա� " + " \t" + "����" + " \t" + 
				"����" + " \t" + "����" + " \t" + "����" + " \t" + "����" + " \t" +
				"hp" + " \t" + "mp" + " \t" + "�ȼ�" + " \t" + "���");
		for(int i = 0; i < roleNum; i++)
		{
			System.out.println(roles[i].getName_() + " \t" + roles[i].getSex_() + " \t" + roles[i].getRace_() + " \t" + 
					roles[i].getStrength_() + " \t" + roles[i].getAgility_() + " \t" + roles[i].getStamina_() + " \t" + 
					roles[i].getIntelligence_() + " \t" + roles[i].getHp_() + " \t" + roles[i].getMp_() + " \t" + 
					roles[i].getLevels() + " \t" + roles[i].getGold() + " ");
		}
	}
	
}
