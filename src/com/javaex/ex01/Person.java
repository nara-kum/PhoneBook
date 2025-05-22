package com.javaex.ex01;

public class Person {
	//필드
	private String name;
	private String hp;
	private String company;
	
	//생성자
	public Person() {
	}
	public Person(String name, String hp, String company) {
		this.name = name;
		this.hp = hp;
		this.company = company;
	}
	
	//메소드-gs
	public String getName() {
		return name;
	}
	public String getHp() {
		return hp;
	}
	public String getCompany() {
		return company;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	//메소드일반
	public void showList() {
		System.out.println(". " + name + "\t" + hp + "\t" + company);
	}
	
	public void strat() {
		System.out.println();
		System.out.println("**************************************");
		System.out.println("*          전화번호 관리 프로그램          *");
		System.out.println("**************************************");
	}
	
	public void menu() {
		System.out.println();
		System.out.println("1.리스트\t"+"2.등록\t"+"3.삭제\t"+"4.검색\t"+"5.종료");
		System.out.println("--------------------------------------");
	}
	
	public void end() {
		System.out.println();
		System.out.println("**************************************");
		System.out.println("*               감사합니다              *");
		System.out.println("**************************************");
	}
}
