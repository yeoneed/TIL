package com.ssafy.ws01.step3;

public class my_DigitTest1 {

	//1번
	public static void main(String[] args) {
		int num = 0;
		for(int i=0; i<5; i++){
			for(int j=5-i; j>0; j--){
				num+= 1;
				System.out.printf("%3d", num);
			}
			System.out.println();
			
		}
				
	}

}
