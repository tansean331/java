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
		System.out.println("3.��ӡ�žų˷���");
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
		System.out.println("2.��ӡ���򳤷���");
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
		System.out.println("5.��ӡ����");
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
		System.out.println("6.�ϲ�����");
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
		System.out.println("14.ʵ��ð������");
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
		System.out.println("14.ʵ��ѡ������");
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
		System.out.println("7.ˮ�ɻ���");
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
		System.out.println("8.һ�������ǡ�õ�����������֮��,������ͳ�Ϊ\"����\".����6=1+2+3.���:�ҳ�1000���ڵ���������");
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
		System.out.println("9.һ��С���100�߶���������,ÿ����غ�����ԭ�߶ȵ�һ��,�����£������ڵ�ʮ�����ʱ,������������?��10�η������?");
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
		System.out.println("11.��Ŀ����ӡ����������Σ�Ҫ���ӡ��10��)");
		int[][] arr=new int[height][height];
		for(int i=0;i<arr.length; i++) {
			//����ֻ�Ǹ���������ڵ�λ�ø�ֵ��������j<=i
			for(int j=0;j<=i;j++) {
				//���ݹ��ɣ�ʹ��if else ��ֵ
				if(j==0||j==i) {
					arr[i][j]=1;
				}else {
					arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
				}
				/*������ǵ�[i][j]���� ���� a[i-1][j-1] �� a[i-1][j]֮��
				"\t"��ԭ����10��С��10������Ŀ�Ȳ�ͬ������ʹ��\t�Ʊ����ʹ������֮��������
				*/
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static void chicken() {
		System.out.println("");
		System.out.println("12.һ��ԪǮ��ټ�,����ÿֻ��Ԫ��ĸ��ÿֻ��Ԫ�� С����С��Ǯ�ͣ���ֻС����һԪ,����ĸ����С������������м��ֹ��򷽷�?");
		for(int i = 0; i < 20; i++)
		{
			for(int j = 0; j < 34; j++)
			{
				for(int k = 0; k < 34; k++)
				{
					if(((5 * i + 3 * j + k) == 100)&&(i + j + 3 * k == 100))
					{
						System.out.println("���� ��" + i + " ĸ���� " + j + " С����" + 3 * k);
						continue;
					}
				}
			}
		}
	}
	
	public static void Total() {
		System.out.println("");
		System.out.println("10.������1~100���ۼ�ֵ����Ҫ���������и�λΪ3��������ʹ��forѭ��ʵ�֣�");
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
		System.out.print("����1~100���ۼ�ֵ����Ҫ���������и�λΪ3���� : "+ total);
	}
	
	public static void rabbit(int month) {
		System.out.println("");
		System.out.println("13.�ŵ�����:��һ������,�ӳ��������������ÿ���¶���һ������,С���ӳ����������º�ÿ��������һ������,�������Ӷ�����,��ÿ���µ���������Ϊ����?");
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
			System.out.print(" �� " + i + "���У�" + total + "������" + "   ");
		}
	}
	
	public static void fallthread(int n) {
		System.out.println("");
		System.out.println("15.��" + n + "����Χ��һȦ,˳���ź�,�ӵ�һ���˿�ʼ����(��1��3����),������3�����˳�Ȧ��,��������µ���ԭ���ڼ��ŵ���λ");
        ArrayList<Integer>list=new ArrayList<Integer>();
        //ֻ����һ��list����ÿ���˵ı�š�
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
				 //ÿ�ζ���1-2-3������3֮����num=0���´��ֿ���1-2-3
				 num=0;
				 count++;
	             //�ж�count=k������ǣ�ֱ�ӷ��أ����Ǿ��Ƶ��������������
				 if(count==k){
					 return list.get(j);
				 }
				 list.remove(j);
				 //�����һ����Ҫע����ǣ�����Ƶ��˵�ǰ��ԭ����j+1�͵���j�����j�����Ļ����ͻ�ֱ��©���Ǹ���
				 //�������j--
				 j--;
			 }
			 //�������β������һ���ֻᵽ0���������j=-1��j++�պ�j����0
			 if(j==list.size()-1){
				 j=-1;
			 }
		 }
		 //û��ȡ��������-1
		 return -1;
	}
	
		
	public static void practice_16() {
		System.out.println("");
		System.out.println("16 ��Ŀ��ĳ����˾���ù��õ绰�������ݣ���������λ���������ڴ��ݹ������Ǽ��ܵģ����ܹ������£�ÿλ���ֶ�����5,Ȼ���úͳ���10��������������֣��ٽ���һλ�͵���λ�������ڶ�λ�͵���λ������");
		Data num1 = new Data(1,false);
		Data num2 = new Data(2,false);
		Data num3 = new Data(3,false);
		Data num4 = new Data(4,false);
		Data nums[] = {num1, num2, num3, num4};
		System.out.print("����ǰ�� ");
		printNums(nums);
		System.out.println("");
		jiami(nums);
		jiemi(nums);

	}
	
	
	
	public static void jiami(Data nums[]) {
		System.out.print("��    �ܣ� ");
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
		System.out.print("��    �ܣ� ");
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
