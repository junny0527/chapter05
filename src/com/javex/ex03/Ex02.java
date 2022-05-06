package com.javex.ex03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		boolean value = true;
		Scanner sc = new Scanner(System.in);
		List<Person> pList = new ArrayList<Person>();

		InputStream in = new FileInputStream("C:\\javaStudy\\file\\PhoneDB2.txt");
		InputStreamReader isr = new InputStreamReader(in,"UTf-8");
		BufferedReader br = new BufferedReader(isr);

		while (value) {
			String str = br.readLine();

			if (str == null) {
				break;
			}
			String[] data = str.split(",");
			Person kbj = new Person(data[0], data[1], data[2]);
			pList.add(kbj);
			kbj.printDB();
		}

		br.close();
		sc.close();

	}

}
