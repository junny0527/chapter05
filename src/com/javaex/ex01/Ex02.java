package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		boolean value = true;
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\img.jpg");
		OutputStream out =new FileOutputStream("C:\\javaStudy\\file\\bytebuffimg.jpg");
		
		
		byte[]buff =new byte[1024];
		
		System.out.println("복시");
		while(value) {
			
			int data = in.read(buff);
			if(data==-1) {
				System.out.println("복끝");
				break;
			}
			out.write(buff);
		}
		
		
		
		out.close();
		in.close();
	}

}
