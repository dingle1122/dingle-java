package cn.lzyike.util;
/**
 * 
 * @author dingle
 *这是一个接收通用类
 */
public class StringUtil {
	/**
	 * 判断字符串是否为空
	 * @param context 判断内容
	 * @return 字符串为空返回true，否则返回false
	 */
	public static boolean isEmpty(String context) {
		return context==null || "".equals(context);
	}
}
