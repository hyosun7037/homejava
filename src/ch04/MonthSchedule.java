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
			System.out.println("�����ϴ�.");
		else
			System.out.println(work + "�Դϴ�.");
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
		System.out.println("�̹��� ������ ���� ���α׷�");
		
	}

}
