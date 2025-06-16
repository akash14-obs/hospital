package com.flm.core;

public class OddIndexSum {

	public static void main(String[] args) {
		int[] nums =  {100, 200, 300, 400, 500, 600, 700, 800};
		int sum=0;
		for(int i=1;i<nums.length;i+=2)
			sum = sum + nums[i];
		System.out.println("Odd index Sum is : "+sum);
	}

}
