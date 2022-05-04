package com.javex.ex03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		boolean value = true;

		List<Person> pList = new ArrayList<Person>();

		InputStream in = new FileInputStream("C:\\javaStudy\\file\\PhoneDB1.txt");
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);

		while (value) {
			String str = br.readLine();

			if (str == null) {
				break;
			} else {
				String[] str1 = str.split(",");
				pList.add(new Person(str1[0], str1[1], str1[2]));
			}
			System.out.println(str);
		}

		br.close();
	}

}
