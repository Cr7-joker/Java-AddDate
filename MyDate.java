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
		System.out.println("日期为："+this.getYear()+"年"+this.getMonth()+"月"+this.getDay()+"日");
	}
	//设置日期
	public MyDate() {
		System.out.println("请设置日期：");
		while(true){
			try {
				System.out.print("年：");
				console=new Scanner(System.in);
				this.year=console.nextInt();
				if(this.getYear()<=0)
					System.out.println("请输入一个大于0的年份！");
				else
					break;
			}
			catch(InputMismatchException e) {
				System.out.println("请输入整数型数据！！！");
			}
			catch(Exception e) {
				System.out.println("出现其他错误！！！");
			}
		}
		while(true){
			try {
				System.out.print("月：");
				console=new Scanner(System.in);
				this.month=console.nextInt();
				if(this.getMonth()<=0||this.getMonth()>12)
					System.out.println("一年只有12个月，从1月到12月！");
				else
					break;
			}
			catch(InputMismatchException e) {
				System.out.println("请输入整数型数据！！！");
			}
			catch(Exception e) {
				System.out.println("出现其他错误！！！");
			}
		}
		while(true){
			try {
				System.out.print("日：");
				console=new Scanner(System.in);
				this.day=console.nextInt();
				if(this.getMonth()==1||this.getMonth()==3||this.getMonth()==5||this.getMonth()==7||this.getMonth()==8||this.getMonth()==10||this.getMonth()==12) {
					if(this.getDay()<=0||this.getDay()>31)
						System.out.println("请输入一个大于0且小于等于31的整数数据！");
					else break;
				}
				else if(this.getMonth()==2){
					if((this.getYear()%4==0&&this.getYear()%100!=0)||this.getYear()%400==0){
						if(this.getDay()<=0||this.getDay()>28) {
							System.out.println("该年是闰年，二月只有28天！");
						}
						else break;
					}
						else if(this.getDay()<=0||this.getDay()>29) {
								System.out.println("该年不是闰年，二月有29天！");
							}
						else break;
						}
				else {
					if(this.getDay()<=0||this.getDay()>30)
						System.out.println("请输入一个大于0且小于等于30的整数数据！");
					else break;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("请输入整数型数据！！！");
			}
			catch(Exception e) {
				System.out.println("出现其他错误！！！");
			}
		}
	}
	//添加日期
	public void addDate() {
		while(true) {
			try {
			System.out.println("请输入要添加的天数：");
			console=new Scanner(System.in);
			add=console.nextInt();
			Calendar calendar=Calendar.getInstance();
			calendar.set(this.getYear(),this.getMonth(),this.getDay());
			calendar.add(Calendar.DAY_OF_MONTH, add);
			int year=calendar.get(Calendar.YEAR);
			int month=calendar.get(Calendar.MONTH);
			int day=calendar.get(Calendar.DAY_OF_MONTH);
			System.out.println("添加后日期为："+ year + "年" + month + "月" + day + "日");
			break;
			}
			catch(InputMismatchException e) {
				System.out.println("请输入整数型数据！\n");
			}
			catch(Exception e) {
				System.out.println("出现其他错误！！！");
			}
		}
	}
}
