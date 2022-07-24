package com.ssafy.ws01.step3;

import java.util.Scanner;

//짞수의 합을 구하는 프로그램 제작
public class ws_1 {

	public static void main(String[] args) {
		System.out.print("숫자 입력>>");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int i =1; i<=n; i++) {
			sum+=i;
		}
		System.out.printf("1부터 %d까지 수의 합: %d", n, sum);
	}

}
