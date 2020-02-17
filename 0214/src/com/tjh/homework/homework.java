package com.tjh.homework;


import java.util.ArrayList;
import java.util.Arrays;

import com.tanjiahe.test.mClass;

public class homework {
	public static void main(String[] args){
		printRectangular(5, 5);
		printTwoNiTable();
		printRectangular(5, 8);
		printHome(5);
		PackedArray();
		shuixianhua(9999);
		wanshu(1000);
		freeFall(100);
		Total();
		YangHuiTriangle(15);
		chicken();
		rabbit(10);
		fallthread(10);
		practice_16();
	}
	public static void printTwoNiTable()
	{
		System.out.println("");
		System.out.println("3.打印九九乘法表");
		for(int i = 1; i <= 9; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(i * j + " ");
			}
			System.out.println("");
		}
	}
	
	public static void printRectangular(int width, int height){
		System.out.println("");
		System.out.println("2.打印正或长方形");
		for(int i = 0; i < height; i++)
		{
			for(int j = 0; j < width; j++)
			{
				if((i == 0) || (i == height - 1) || (j == 0) || (j == width - 1))
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
	
	public static void printHome(int SquareMeter) {
		System.out.println("");
		System.out.println("5.打印房子");
		if(SquareMeter < 0)
		{
			return ;
		}
		int empty = SquareMeter;
		int starLeft = SquareMeter + 1;
		int houseMaxWidth = empty * 2 + starLeft + 1;
		int Height = SquareMeter + 1;
		
		for(int i = 0; i < Height; i++)
		{
			for(int j = 0; j < houseMaxWidth; j++)
			{
				if(j > (empty - i - 1) && (j <= empty - 1 + starLeft - i))
				{
					System.out.print("* ");
				}
				else if((j == empty + starLeft + i)) 
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
				
			}
			System.out.println("");
		}
		for(int i = 0; i < Height; i++)
		{
			for(int j = 0; j < houseMaxWidth; j++)
			{
				if((i == 0) || (i == Height - 1) || (j == 0) || (j == houseMaxWidth - 1))
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
		
	}
	
	public static void PackedArray() {
		System.out.println("");
		System.out.println("6.合并数组");
		int i = 0;
	    int j = 0;
	    int k = 0;
	    int[] a = new int[]{1,3,6,9};
	    int[] b = new int[]{2,4,5,7,8};
	    int[] c = new int[a.length + b.length];
	    while (i + j < a.length + b.length) {
	        if (i < a.length) {
	            c[k++] = a[i++];
	        } else {
	            c[k++] = b[j++];
	        }
	    }
	    BubbleSort(c);
	    SelectSort(c);
	    System.out.println(Arrays.toString(c));
	}
	
	public static void BubbleSort(int a[])
	{
		System.out.println("");
		System.out.println("14.实现冒泡排序");
		int temp;
		for(int i = 0; i < a.length; i++)
		{
			for(int j = i + 1; j < a.length; j++)
			{
				if(a[i] > a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(Arrays.toString(a));
		}
	}
	
	public static void SelectSort(int a[]) 
	{
		System.out.println("");
		System.out.println("14.实现选择排序");
		int v_min;
		int p_min;
		int temp;
		for(int i = 0; i < a.length; i++)
		{
			v_min = a[i];
			temp = a[i];
			p_min = i;
			for(int j = i + 1; j < a.length; j++)
			{
				if(v_min > a[j])
				{
					v_min = a[j];
					p_min = j;
				}
			}
			a[i] = a[p_min];
			a[p_min] = temp;
			System.out.println(Arrays.toString(a));
		}
	}
	
	public static void shuixianhua(int max) {
		System.out.println("");
		System.out.println("7.水仙花数");
		if(max <= 100)
		{
			return;
		}
		for(int i = 100; i < max; i++)
		{
			if(isShuixianhua(i))
			{
				System.out.print(i + "  ");
			}
		}
		
	}
	
	public static boolean isShuixianhua(int n)
	{
		int total = 0;
		int n_ = n;
		while(n > 0)
		{
			int temp = n % 10;
			total += temp * temp * temp;
			n /= 10;
		}
		
		return (total == n_)?true:false;
	}
	
	public static void wanshu(int max) {
		System.out.println("");
		System.out.println("8.一个数如果恰好等于它的因子之和,这个数就成为\"完数\".例如6=1+2+3.编程:找出1000以内的所有完数");
		if(max <= 0)
		{
			return;
		}
		for(int i = 1; i < max; i++)
		{
			if(iswanshu(i))
			{
				System.out.print(i + "  ");
			}
		}
		
	}
	public static boolean iswanshu(int n) {
		int total = 0;
		for(int i = 1; i < n; i++)
		{
			if((n % i) == 0)
			{
				total += i;
			}
		}
		return (total == n)?true:false;
	}
	
	public static void freeFall(double height) {
		System.out.println("");
		System.out.println("9.一个小球从100高度自由落下,每次落地后反跳回原高度的一半,再落下，求它在第十次落地时,共经过多少米?第10次反弹多高?");
		double total = 0;
		int i = 0;
		while(height > 0)
		{
			total += height;
			i++;
			if(i == 10)
			{
				System.out.println("the total height :" + total);
				System.out.println("the ten th :" + height);
				break;
			}
			System.out.println("the " + i + " th :" + height);
			height /= 2;
		}
		
	}
	
	public static void YangHuiTriangle(int height) {
		System.out.println("");
		System.out.println("11.题目：打印出杨辉三角形（要求打印出10行)");
		int[][] arr=new int[height][height];
		for(int i=0;i<arr.length; i++) {
			//由于只是给杨辉三角内的位置赋值，所以是j<=i
			for(int j=0;j<=i;j++) {
				//根据规律，使用if else 赋值
				if(j==0||j==i) {
					arr[i][j]=1;
				}else {
					arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
				}
				/*杨辉三角第[i][j]的数 等于 a[i-1][j-1] 与 a[i-1][j]之和
				"\t"的原因是10和小于10的数组的宽度不同，所以使用\t制表符能使数与数之间距离相等
				*/
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static void chicken() {
		System.out.println("");
		System.out.println("12.一百元钱买百鸡,公鸡每只五元，母鸡每只三元； 小鸡因小价钱低，三只小鸡是一元,公鸡母鸡和小鸡，请你算出有几种购买方法?");
		for(int i = 0; i < 20; i++)
		{
			for(int j = 0; j < 34; j++)
			{
				for(int k = 0; k < 34; k++)
				{
					if(((5 * i + 3 * j + k) == 100)&&(i + j + 3 * k == 100))
					{
						System.out.println("公鸡 ：" + i + " 母鸡： " + j + " 小鸡：" + 3 * k);
						continue;
					}
				}
			}
		}
	}
	
	public static void Total() {
		System.out.println("");
		System.out.println("10.求整数1~100的累加值，但要求跳过所有个位为3的数。（使用for循环实现）");
		int total = 0;
		for(int i = 1; i <= 100; i++)
		{
			if((i % 10) == 3)
			{
				continue;
			}
			else 
			{
				total += i;
				
			}
		}
		System.out.print("整数1~100的累加值，但要求跳过所有个位为3的数 : "+ total);
	}
	
	public static void rabbit(int month) {
		System.out.println("");
		System.out.println("13.古典问题:有一对兔子,从出生后第三个月起每个月都生一对兔子,小兔子长到第三个月后每个月又生一对兔子,假如兔子都不死,问每个月的兔子总数为多少?");
		if(month <= 2)
			return;
		
		int total = 0;
		int total_1 = 1;
		int total_2 = 1;
		
		for(int i = 2; i <= month; i++)
		{
			total = total_1 + total_2;
			total_1 = total_2;
			total_2 = total;
			System.out.print(" 第 " + i + "月有：" + total + "对兔子" + "   ");
		}
	}
	
	public static void fallthread(int n) {
		System.out.println("");
		System.out.println("15.有" + n + "个人围成一圈,顺序排号,从第一个人开始报数(从1到3报数),凡报道3的人退出圈子,问最后留下的是原来第几号的那位");
        ArrayList<Integer>list=new ArrayList<Integer>();
        //只是用一个list来存每个人的编号。
        for(int i=0;i<n;i++){
            list.add(i+1);
        }
        int k=10;
        System.out.println(method(list,k));;
		
	}
	 public static int method(ArrayList<Integer> list,int k){
		 int count=0;
		 int num=0;
		 for(int j=0;j<list.size();j++){
			 num++;
			 if(num==3){
				 //每次都是1-2-3，到了3之后，令num=0，下次又可以1-2-3
				 num=0;
				 count++;
	             //判断count=k。如果是，直接返回，不是就移掉这个数继续往后
				 if(count==k){
					 return list.get(j);
				 }
				 list.remove(j);
				 //这边有一个需要注意的是，如果移掉了当前，原本的j+1就到了j，如果j不减的话，就会直接漏掉那个数
				 //所以这边j--
				 j--;
			 }
			 //如果到了尾部，下一次又会到0；所以这边j=-1，j++刚好j等于0
			 if(j==list.size()-1){
				 j=-1;
			 }
		 }
		 //没有取到，返回-1
		 return -1;
	}
	
		
	public static void practice_16() {
		System.out.println("");
		System.out.println("16 题目：某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，加密规则如下：每位数字都加上5,然后用和除以10的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换。");
		Data num1 = new Data(1,false);
		Data num2 = new Data(2,false);
		Data num3 = new Data(3,false);
		Data num4 = new Data(4,false);
		Data nums[] = {num1, num2, num3, num4};
		System.out.print("加密前： ");
		printNums(nums);
		System.out.println("");
		jiami(nums);
		jiemi(nums);

	}
	
	
	
	public static void jiami(Data nums[]) {
		System.out.print("加    密： ");
		Data temp;
		for(int i = 0; i < 4; i++)
		{
			if((nums[i].data + 5) >= 10)
				nums[i].flag = true;
			else
				nums[i].flag = false;
			nums[i].data = (nums[i].data + 5) % 10;
		}
		temp = nums[0];
		nums[0] = nums[3];
		nums[3] = temp;
		
		temp = nums[1];
		nums[1] = nums[2];
		nums[2] = temp;
		printNums(nums);
		System.out.println("");
	}
	
	public static void jiemi(Data nums[]) {
		System.out.print("解    密： ");
		Data temp;
		for(int i = 0; i < 4; i++)
		{
			if(nums[i].flag == true)
			{
				nums[i].data += 10;
				nums[i].data -= 5;
				nums[i].flag = false;
			}
			else 
			{
				nums[i].data -= 5;
			}
		}
		temp = nums[0];
		nums[0] = nums[3];
		nums[3] = temp;
		
		temp = nums[1];
		nums[1] = nums[2];
		nums[2] = temp;
		printNums(nums);
		System.out.println("");
	}
	
	public static void printNums(Data data[]) {
		for(int i = 0; i < 4; i++)
		{
			System.out.print(data[i].data + "  ");
		}
	}
	
}
