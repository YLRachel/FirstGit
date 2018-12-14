package cn.pgc.bl;

import java.util.Scanner; 

public class Demo_01 {

	public static void main(String[] args) {
		System.out.println(1234);
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(str);
		sc.close();
		int a=12,b=2;
		int num = a<b?a:b;
		System.out.println(num);

		}
	}
