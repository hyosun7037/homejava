package ch04;

import java.util.Scanner;

class Day{
	private String work;
	public void set(String work) {
		this.work = work;
	}
	public String get(){
		return work;
	}
	public void show() {
		if(work==null)
			System.out.println("없습니다.");
		else
			System.out.println(work + "입니다.");
	}
}

public class MonthSchedule{
	private int nDays;
	private Day [] days;
	private Scanner sc;
	
	
	public MonthSchedule(int nDays) {
		this.nDays = nDays;
		this.days = new Day[nDays];
		for (int i = 0; i < days.length; i++) {
			days[i] = new Day();
		}
		sc = new Scanner(System.in);
	}


	public static void main(String[] args) {
		System.out.println("이번달 스케쥴 관리 프로그램");
		
	}

}
