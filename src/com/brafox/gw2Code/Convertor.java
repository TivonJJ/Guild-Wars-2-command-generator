package com.brafox.gw2Code;

import java.util.Arrays;

public class Convertor {

	public static String HexString2Base64(String hexTxt){
		hexTxt = hexTxt.toUpperCase();
		String[] strs = hexTxt.split(" ");
		byte[] b = new byte[strs.length];
		for(int i=0;i<strs.length;i++){
			String item = strs[i].trim();
			item = item.toUpperCase();
			b[i] = (byte) Integer.parseInt(item, 16);
		}
		System.out.println("2base:"+Arrays.toString(b));
		return "[&"+StringCodeUtil.encodeBase64(b)+"]";
	}
	
	public static String Base642HexString(String base64Txt){
		byte[] b = StringCodeUtil.decodeBase64(base64Txt);
		System.out.println("2hex:"+Arrays.toString(b));
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<b.length;i++){
			String prefix = i==0?"":" ";
			String item = Integer.valueOf(b[i]).toString();
			item = Integer.toHexString(b[i] & 0xFF).toUpperCase();
			if(item.length() == 1)item = "0"+item;
			sb.append(prefix+item);
		}
		return new String(sb);
	}
	
}
