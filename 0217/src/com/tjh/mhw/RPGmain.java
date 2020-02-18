package com.tjh.mhw;

import java.util.Scanner;


public class RPGmain {
	public static void main(String[] args) {
		Role roles[] = new Role[5];
		int roleNum= 0;
		while(true) {
			System.out.println("1.新建游戏角色\r\n" + 
					"2.开始游戏\r\n" + 
					"3.结束游戏\r\n" + 
					"4.删除角色\r\n" + 
					"5.查看当前时间");
			Scanner scanner = new Scanner(System.in);
			String str = scanner.next();
			int select = Integer.parseInt(str);
			switch (select) {
			case 1:
				if(roles[0] != null)
				{
					getRoles(roles,roleNum);
				}
				
				System.out.println("1.创建新角色\r\n" + 
						"2.返回");
				Scanner scanner_newGame = new Scanner(System.in);
				String str_newGame = scanner_newGame.next();
				int select_newGame = Integer.parseInt(str_newGame);
				switch (select_newGame) {
				case 1:
					System.out.println("请输入游戏角色名：");
					Scanner scanner_name = new Scanner(System.in);
					String name = scanner_name.next();
					
					System.out.println("请选择游戏角色性别（1、男，2、女）");
					Scanner scanner_sex = new Scanner(System.in);
					String sex = scanner_sex.next();
					int select_sex = Integer.parseInt(sex);
					if(select_sex == 1)
						sex = "男";
					else
						sex = "女";
					
					System.out.println("请选择游戏角色种族（1、天策，2、唐门，3、少林，4、丐帮，5、七秀）");
					Scanner scanner_race = new Scanner(System.in);
					String race = scanner_race.next();
					int select_race = Integer.parseInt(race);
					switch (select_race) {
					case 1:
						race = "天策";
						break;
					case 2:
						race = "唐门";				
						break;
					case 3:
						race = "少林";
						break;
					case 4:
						race = "丐帮";
						break;
					case 5:
						race = "七秀";
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
					System.out.println("======> 你还没有创建角色~ 请先新建角色  <====== ");
					break;
				}
				int useRoleNum;
				System.out.println("请选择你使用的游戏角色(从1开始)");
				Scanner scanner2 = new Scanner(System.in);
				String str2 = scanner2.next();
				useRoleNum = Integer.parseInt(str2) - 1;
				if(roles[useRoleNum] == null)
				{
					System.out.println("没有该角色，请重新输入");
					continue;
				}
				else {
					System.out.println("请选择1、练级   2、挑战");
					
				}
				int currentHp = roles[useRoleNum].hp_;
				Scanner scanner3 = new Scanner(System.in);
				String str3 = scanner3.next();
				int select_type = Integer.parseInt(str3);
				Enemy m1,m2;
				if(select_type == 1) {
					m1 = new Enemy("张裕",100);
					m2 = new Enemy("刘峰",100);
				}else {
					m1 = new Enemy("张裕",300);
					m2 = new Enemy("刘峰",300);
				}
				Enemy[] m = new Enemy[2];
				m[0] = m1;
				m[1] = m2;
				int total = 0;
				int mtotal = m.length;
				while(true) {
					System.out.println("========== 第 "+total+" 回合  ========== ");
					System.out.println(roles[useRoleNum].getName_()+" 的血量剩余：" + roles[useRoleNum].getHp_());
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
						s = "普通攻击";
						mName = m[mnum].getName();
					}else if(num >= 6 && num <=8) {
						roles[useRoleNum].MagicAttack(m);
						s = "破釜沉舟攻击全体";
					}else {
						roles[useRoleNum].HugeAttack(m[mnum]);
						s = "虎啸龙吟攻击";
						mName = m[mnum].getName();
					}
					System.out.println("使用了 " + s + mName + "强盗");
					for(int i1 = 0; i1 < m.length; i1 ++) {
						System.out.println(m[i1].getName() + "强盗  血量 " + m[i1].getHp());
					}
					mtotal = m.length;
					for(int i1 = 0; i1 < m.length; i1 ++) {
						if(m[i1].getHp() != 0) {
							System.out.println("强盗使用了 普攻");
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
						System.out.println("所有的强盗都死了,你获胜啦，经验加" + experience);
						System.out.println(roles[useRoleNum].name_ + " 的当前等级为 " + roles[useRoleNum].levels);
						System.out.println("======== 第 "+total+" 回合结束  ========\n ");	
						break;
					}
					if(roles[useRoleNum].getHp_() == 0)
					{
						roles[useRoleNum].hp_ = currentHp;
						System.out.println("你的血量为0,挑战失败无经验，请先去练级吧");
						System.out.println("======== 第 "+total+" 回合结束  ======== \n");	
						break;
					}
					total++;
					System.out.println("======== 第 "+total+" 回合结束  ======== \n");	
				}
				break;
			case 3:
				System.out.println("游戏结束，感谢相遇");	
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}
	
	public static void getRoles(Role[] roles, int roleNum) {
		System.out.println("当前角色：\n" + "名字 " + " \t" + "性别 " + " \t" + "种族" + " \t" + 
				"力量" + " \t" + "体力" + " \t" + "敏捷" + " \t" + "智力" + " \t" +
				"hp" + " \t" + "mp" + " \t" + "等级" + " \t" + "金币");
		for(int i = 0; i < roleNum; i++)
		{
			System.out.println(roles[i].getName_() + " \t" + roles[i].getSex_() + " \t" + roles[i].getRace_() + " \t" + 
					roles[i].getStrength_() + " \t" + roles[i].getAgility_() + " \t" + roles[i].getStamina_() + " \t" + 
					roles[i].getIntelligence_() + " \t" + roles[i].getHp_() + " \t" + roles[i].getMp_() + " \t" + 
					roles[i].getLevels() + " \t" + roles[i].getGold() + " ");
		}
	}
	
}
