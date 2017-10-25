package cn.lzyike.util;

import java.util.Scanner;

/**
 * 
 * @author dingle
 *
 */
public class ScannerUtil {
	private static Scanner sc=new Scanner(System.in);
	/**
	 * 接收用户输入的字符串
	 * @return 接收输入的值
	 */
	public static String getInputString() {
		return sc.nextLine();
	}
	/**
	 * 接收用户输入的字符串
	 * @param defaultString 默认值
	 * @return 用户输入内容不为空时返回输入值，否则返回默认值
	 */
	public static String getInputString(String defaultString) {
		String context=sc.nextLine();
		return StringUtil.isEmpty(context)? defaultString:context;
	}
}
