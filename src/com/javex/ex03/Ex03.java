package com.javex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) throws IOException {
		boolean value = true;
		Scanner sc = new Scanner(System.in);
		List<Person> pList = new ArrayList<Person>();

		InputStream in = new FileInputStream("C:\\javaStudy\\file\\PhoneDB3.txt");
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

		System.out.println("이름을 입력하세요.");
		String name = sc.nextLine();
		System.out.println("전화번호를 입력하세요.");
		String hp = sc.nextLine();
		System.out.println("회사를 입력하세요.");
		String company = sc.nextLine();
		pList.add(new Person(name, hp, company));

		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\PhoneDB3.txt");
		OutputStreamWriter osw = new OutputStreamWriter(out);
		BufferedWriter bw = new BufferedWriter(osw);

		int i = 0;
		while (i < pList.size()) {
			String na = pList.get(i).getName();
			String h = pList.get(i).getHp();
			String co = pList.get(i).getCompany();

			bw.write(na + "," + h + "," + co);
			bw.newLine();
			i++;
		}

		br.close();
		bw.close();
		sc.close();

	}

}
