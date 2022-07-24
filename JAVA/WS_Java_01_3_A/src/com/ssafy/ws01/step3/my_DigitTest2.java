package com.ssafy.ws01.step3;

public class my_DigitTest2 {
	//모래시계 모양 출력
		public static void main(String[] args) {
			int num = 0;
			for(int i=0; i<5; i++){
				if(i<=2) {
					if(i==0) {
						for(int j=1; j<=5-(2*i); j++){
							num+= 1;
							System.out.printf("%3d", num);
						}
						System.out.println();
					}
					
					else {
						for(int j=0; j<i; j++) {
							System.out.printf("%3s", " ");
						}
						for(int j=1; j<=5-(2*i); j++){
							num+= 1;
							System.out.printf("%3d", num);
						}
						
						for(int j=0; j<i; j++) {
							System.out.printf("%3s", " ");
						}
						System.out.println();
					}
				}
				
				else {
					if(i==4) {
						for(int j=1; j<=5-(2*(4-i)); j++){
							num+= 1;
							System.out.printf("%3d", num);
						}
						System.out.println();
					}
					else {
						for(int j=0; j<4-i; j++) {
							System.out.printf("%3s", " ");
						}
					
						for(int j=1; j<=5-(2*(4-i)); j++){
							num+= 1;
							System.out.printf("%3d", num);
						}
						for(int j=0; j<i; j++) {
							System.out.printf("%3s", " ");
						}
						System.out.println();
				}
			}
				
		}
	}
}


