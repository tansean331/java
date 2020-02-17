package com.tanjiahe.test;

import java.util.Scanner;

import sun.awt.image.PNGImageDecoder.Chromaticities;

public class mClass {
	public static void main(String[] args) {
//		int week = 1;
//		while((week <= 7) && (week > 0))
//		{
//			Scanner scanner = new Scanner(System.in);
//			String str = scanner.next();
//			week = Integer.parseInt(str);
//			getWeek(week);
//			
//		}
		
		char[] words = {'统', '计', '一', '个', '字', '符', '在', '字', '符', '串', '中'};
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		int loc = getWordLoc(words, str);
//		System.out.println(loc);
	}
	public static int getWordLoc(char[] words, String str) {
		int loc = 0;
		for(int i = 0; i < words.length; i++)
		{
			if(words[i] == str.charAt(0)) {
				loc++;
				System.out.println(i);
			}
		}
		return loc;
	}
	
	public static void getWeek(int n)
	{
		if( (n > 7) || (n < 1) ) {
			System.out.println("error");
			return ;
		}
		switch (n) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday ");
			break;
		case 3:
			System.out.println("Wednesday ");	
			break;
		case 4:
			System.out.println("Thursday ");
			break;
		case 5:
			System.out.println("Friday ");
			break;
		case 6:
			System.out.println("Saturday ");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			break;
		}
	}
}
