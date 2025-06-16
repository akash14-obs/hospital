package com.flm.core;

public class HalfReverse {

	public static void main(String[] args) {
		int nums[] = {1,2,3,4,5,6,7,8};
		int center = nums.length/2;
		for(int i=center-1;i>=0;i--)
			System.out.print(" "+nums[i]);
		for(int i=nums.length-1;i>=center;i--)
			System.out.print(" "+nums[i]);
	}

}
