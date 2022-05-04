package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		boolean value = true;
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\byteimg.jpg");
		System.out.println("복사시작");
		while(value) {
		int data =in.read();
		System.out.println(data);
		if(data==-1) {
			System.out.println("복사끝");
			break;
		}
		out.write(data);
		}
		out.close();
		in.close();
	}

}
