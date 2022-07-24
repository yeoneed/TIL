package com.ssafy.ws01.step3;

import java.util.Scanner;

public class my_GameTest {
	
	public static int choose(int num) {
		switch(num) {
		case 1:
			int game_num = 5;
			return game_num;
		case 2:
			game_num=3;
			return game_num;
		case 3:
			game_num =1;
			return game_num;
		}
		return num;
	}

	public static void main(String[] args) {
		System.out.println("가위바위보 게임을 시작합니다. 아래 보기 중 하나를 고르세요");
		System.out.println("1.5판3승\n2.3판2승\n3.1판1승");
		Scanner sc = new Scanner(System.in);
		System.out.print("번호를 입력하세요:");
		int num = sc.nextInt(); //번호입력
		
		int game_num = choose(num);
		int limit = game_num/2+1;
		int win_num = 0;
		int total_score = 0;
		int computer = (int)Math.random()+1;
		for(int i=0; i<game_num; i++) {
			System.out.print("가위바위보 중 하나 입력:");
			int flag = sc.nextInt();
			if(flag>computer | (flag==1 && computer==3)) {
				System.out.println("이겼습니다!");
				win_num+=1;
				total_score +=1;
			}
			else if(flag<computer) {
				System.out.println("졌습니다!");
				total_score-=1;
			}
			else{
				System.out.println("비겼습니다!");
			}
			if(win_num>=limit) {
				System.out.println("###사용자 승!");
				break;
			}
		
	}
		if(total_score<0) System.out.println("###컴퓨터 승");
		else if(total_score==0) System.out.println("###무승부");
		else System.out.println("###사용자 승");
}
}
