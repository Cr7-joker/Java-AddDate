package com.experiments2;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyDate {
	Scanner console=new Scanner(System.in);
	private int year;
	private int month;
	private int day;
	public int add;
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public void print() {
		System.out.println("����Ϊ��"+this.getYear()+"��"+this.getMonth()+"��"+this.getDay()+"��");
	}
	//��������
	public MyDate() {
		System.out.println("���������ڣ�");
		while(true){
			try {
				System.out.print("�꣺");
				console=new Scanner(System.in);
				this.year=console.nextInt();
				if(this.getYear()<=0)
					System.out.println("������һ������0����ݣ�");
				else
					break;
			}
			catch(InputMismatchException e) {
				System.out.println("���������������ݣ�����");
			}
			catch(Exception e) {
				System.out.println("�����������󣡣���");
			}
		}
		while(true){
			try {
				System.out.print("�£�");
				console=new Scanner(System.in);
				this.month=console.nextInt();
				if(this.getMonth()<=0||this.getMonth()>12)
					System.out.println("һ��ֻ��12���£���1�µ�12�£�");
				else
					break;
			}
			catch(InputMismatchException e) {
				System.out.println("���������������ݣ�����");
			}
			catch(Exception e) {
				System.out.println("�����������󣡣���");
			}
		}
		while(true){
			try {
				System.out.print("�գ�");
				console=new Scanner(System.in);
				this.day=console.nextInt();
				if(this.getMonth()==1||this.getMonth()==3||this.getMonth()==5||this.getMonth()==7||this.getMonth()==8||this.getMonth()==10||this.getMonth()==12) {
					if(this.getDay()<=0||this.getDay()>31)
						System.out.println("������һ������0��С�ڵ���31���������ݣ�");
					else break;
				}
				else if(this.getMonth()==2){
					if((this.getYear()%4==0&&this.getYear()%100!=0)||this.getYear()%400==0){
						if(this.getDay()<=0||this.getDay()>28) {
							System.out.println("���������꣬����ֻ��28�죡");
						}
						else break;
					}
						else if(this.getDay()<=0||this.getDay()>29) {
								System.out.println("���겻�����꣬������29�죡");
							}
						else break;
						}
				else {
					if(this.getDay()<=0||this.getDay()>30)
						System.out.println("������һ������0��С�ڵ���30���������ݣ�");
					else break;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("���������������ݣ�����");
			}
			catch(Exception e) {
				System.out.println("�����������󣡣���");
			}
		}
	}
	//�������
	public void addDate() {
		while(true) {
			try {
			System.out.println("������Ҫ��ӵ�������");
			console=new Scanner(System.in);
			add=console.nextInt();
			Calendar calendar=Calendar.getInstance();
			calendar.set(this.getYear(),this.getMonth(),this.getDay());
			calendar.add(Calendar.DAY_OF_MONTH, add);
			int year=calendar.get(Calendar.YEAR);
			int month=calendar.get(Calendar.MONTH);
			int day=calendar.get(Calendar.DAY_OF_MONTH);
			System.out.println("��Ӻ�����Ϊ��"+ year + "��" + month + "��" + day + "��");
			break;
			}
			catch(InputMismatchException e) {
				System.out.println("���������������ݣ�\n");
			}
			catch(Exception e) {
				System.out.println("�����������󣡣���");
			}
		}
	}
}
