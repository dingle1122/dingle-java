package cn.lzyike.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Hello {
	public static void main(String[] args) {
		String fileName="hello.txt";
		File f=new File("mode/"+fileName);
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
		System.out.println(fs);
	}
}
