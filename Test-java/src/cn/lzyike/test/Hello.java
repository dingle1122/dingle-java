package cn.lzyike.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Map;

import com.alibaba.fastjson.JSON;

import cn.lzyike.kotlin.MyKotlin;
import cn.lzyike.util.Massage;
import cn.lzyike.util.ScannerUtil;

/**
 * @author dingle
 * 这是一个测试类
 */
public class Hello {
	public static void main(String[] args) {
		System.out.println("\n------------------------------读取文件返回---------------------------------");
		Massage<String>msg=new Massage<>();
		System.out.println("请输入目录名:");
		String dirName=ScannerUtil.getInputString("mode");
		System.out.println("请输入文件名:");
		String fileName=ScannerUtil.getInputString("hello.txt");
		File f=new File(dirName+"/"+fileName);
		String fs=new String();
		InputStream is=null;
		try {
			is=new FileInputStream(f);
			int x=0;
			byte bts[]=new byte[1024];
			while((x=is.read(bts))!=-1) {
				fs+=new String(bts,0,x);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		msg.setCode(200);
		msg.setMsg("读取完成");
		msg.addData(fs);
		msg.setDataType(fs.getClass().getTypeName());
		String json=JSON.toJSONString(msg);
		System.out.println(json);
		System.out.println("\n------------------------------通过反射读取类中的方法---------------------------------");
		Method msgms[]=msg.getClass().getMethods();
		System.out.println(msgms[1]);
		System.out.println("\n------------------------------系统全局变量---------------------------------");
		Map<String, String> env=System.getenv();
		for(String key:env.keySet()) {
			System.out.println(key+":"+env.get(key));
		}
		System.out.println("\n------------------------------调用kotlin代码---------------------------------");
		cn.lzyike.kotlin.HelloKt.test();
		MyKotlin mk=new MyKotlin();
		mk.testMyKT("dingle1122");
	}
}
