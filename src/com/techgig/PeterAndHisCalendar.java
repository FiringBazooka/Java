package com.techgig;

import java.util.HashMap;
import java.util.Scanner;

public class PeterAndHisCalendar {

	public static void main(String[] args) {
		
		HashMap<Integer, Integer> map = new HashMap();
		map.put(1, 31);
		map.put(2, 28);
		map.put(3, 31);
		map.put(4, 30);
		map.put(5,31);
		map.put(6, 30);
		map.put(7, 31);
		map.put(8, 31);
		map.put(9, 30);
		map.put(10, 31);
		map.put(11, 30);
		map.put(12, 31);


		Scanner sc = new Scanner(System.in);
		int month = Integer.parseInt(sc.nextLine());
		int row = Integer.parseInt(sc.nextLine());

		int days= map.get(month);
		
		
		
		int columns= (int) Math.ceil((days+row-1)/7d);
		System.out.println(columns);

	}

	

}
