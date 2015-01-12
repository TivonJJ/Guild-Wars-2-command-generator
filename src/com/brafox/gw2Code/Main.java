package com.brafox.gw2Code;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
//		String scepter = "02 01 E7 77 00 E0 FD 0E 00 00 96 52 00 00 91 52 00 00";
//		String focus = "02 01 E0 77 00 E0 F9 12 00 00 96 52 00 00 9A 52 00 00";
//		String sls = "02 01 52 79 00 E0 41 12 00 00 84 52 00 00 91 52 00 00";
//		String fls = "02 01 45 79 00 E0 40 12 00 00 96 52 00 00 9C 52 00 00";
////		String base64Str = "AgGqtgBA/18AAA==";
//
//		String base64 = Convertor.HexString2Base64("02 FA D8 AB 00 00");
//		System.out.println(base64);
//		
//		String hex = Convertor.Base642HexString("[&AgHYqwAA]");
//		System.out.println(hex);
//		
//		System.out.println(Integer.toHexString(250));
		
		System.out.println("请选择：");
		while(true){
			Scanner scanner = new Scanner(System.in);
			System.out.println("1,Base64转HEX    2,HEX转Base64   3,退出");
			String choose = scanner.nextLine();
			if(choose.equals("1")){
				System.out.print("请输入代码：");
				String txt = scanner.nextLine();
				System.out.println(Convertor.Base642HexString(txt));
			}else if(choose.equals("2")){
				System.out.println("请输入代码：");
				String txt = scanner.nextLine();
				System.out.println(Convertor.HexString2Base64(txt));
			}else if(choose.equals("3")){
				System.exit(0);
			}else{
				System.out.println("无此选项！");
			}
		}
	}
	
}
