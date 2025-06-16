package com.flm.core;

public class MarksTotalAndAverage {
	public static void main(String[] args) {
		float marks[] = {57,78,66,77,89,72};
		float sum = 0;
		for(int i=0;i<marks.length;i++)
			sum = sum + marks[i];
		System.out.println("Total is : "+sum);
		System.out.println("Average is : "+sum/marks.length);
	}
}
