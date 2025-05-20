package com.javaex.ex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PhoneApp {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int mene;
		String list;
		
		//시작화면
		System.out.println();
		System.out.println("**************************************");
		System.out.println("*          전화번호 관리 프로그램          *");
		System.out.println("**************************************");
		
		//배열 담을 리스트 메모리 올리기
		List<Person> pList = new ArrayList<Person>();
		
		//읽기
		Reader fr = new FileReader("C:\\javaStudy\\PhoneDB.txt");	
		BufferedReader br = new BufferedReader(fr);
		
		//읽은 목록 담기
		while(true) {
			list = br.readLine();
			if(list==null) {
				break;
			}
			String[] lArray = list.split(",");
			Person ps = new Person(lArray[0],lArray[1],lArray[2]);
			pList.add(ps);
		}
		
		
		while(true) {
			System.out.println();
			System.out.println("1.리스트\t"+"2.등록\t"+"3.삭제\t"+"4.검색\t"+"5.종료");
			System.out.println("--------------------------------------");
			System.out.print(">메뉴번호:"); mene = sc.nextInt();
			
			if(mene==5) {
				System.out.println();
				System.out.println("**************************************");
				System.out.println("*               감사합니다              *");
				System.out.println("**************************************");
				break;
			}
			switch(mene) {
			case 1:
				System.out.println("<1.리스트>");
				for(int i=0; i<pList.size(); i++) {
					System.out.print(i+1);
					pList.get(i).showList();
				}
				break;
			case 2:
				//쓰기
				Writer fw01 = new FileWriter("C:\\javaStudy\\PhoneDB.txt");
				BufferedWriter bw01 = new BufferedWriter(fw01);
				
				System.out.println("<2.등록>");
				System.out.print(">이름:");
				sc.nextLine(); String name = sc.nextLine();
				System.out.print(">휴대전화:"); 
				String ph = sc.nextLine();
				System.out.print(">회사전화:");
				String company = sc.nextLine();
				
				//리스트에 추가
				Person pr = new Person(name,ph,company);
				pList.add(pr);
				
				//파일쓰기
				for(int i=0; i<pList.size(); i++) {
					bw01.write(pList.get(i).getName()+","+pList.get(i).getHp()+","+pList.get(i).getCompany());
					bw01.newLine();
				}

				bw01.close();
				
				System.out.println("[등록되었습니다.]");
				break;
			case 3:
				//쓰기
				Writer fw02 = new FileWriter("C:\\javaStudy\\PhoneDB.txt");
				BufferedWriter bw02 = new BufferedWriter(fw02);
				
				System.out.println("<3.삭제>");
				System.out.print(">번호:"); int num = sc.nextInt();
				
				pList.remove(num-1);

				for(int i=0; i<pList.size(); i++) {
					bw02.write(pList.get(i).getName()+","+pList.get(i).getHp()+","+pList.get(i).getCompany());
					bw02.newLine();
				}
				
				System.out.println("[삭제되었습니다.]");
				break;
			case 4:
				System.out.println("<4.검색>");
				System.out.print(">이름:"); 
				sc.nextLine(); String target = sc.nextLine();
				
				
				break;
			default:
				System.out.println("[다시 입력해 주세요.]");
			}	
		}
		
		br.close();
		sc.close();
	}

}


