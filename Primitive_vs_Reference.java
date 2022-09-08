package com.Akhilesh;
import java.util.*; 
import java.util.Date;
import java.awt.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		byte x = 1;
		byte y = x;
		x = 2;
		System.out.println(y);
		// Refarence; 
		Point point1 = new Point(1,5);
		Point point2 = point1;
		point1.x = 2;
		System.out.println(point2);
		
		
		
	}
}

