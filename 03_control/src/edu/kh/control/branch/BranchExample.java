package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {
	
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		
		//1부터 10까지 1씩 증가하며 출력하는 반복문 작성
		//단, 5를 출력하면 반복문 종료
		for(int i=1 ; i<=10 ; i++) {
			System.out.print(i + " ");
			if(i==5)break;}
	}
	
	
	public void ex2() {
		// 입력받은 모든 문자열을 누적
		// 단 , "exit@"입력 시 문자열 누적을 종료하고 결과 출력
		Scanner sc = new Scanner(System.in);	
	
		String str = ""; // 빈문자열
		
		while(true) {
			
		System.out.println("문자열 입력(exit@ 입력 시 종료) : ");
		String input = sc.nextLine();
		
		// 자바에서 문자열 비교는 == 연산자 사용 불가
		// 비교연산자(==)는 보통 기본자료형 끼리의 연산어세만 사용 가능함
		// String은 기본자료형이 아닌 참조형!!
		
		// 문자열1.equals(문자열) 을 사용해야 한다
		// 문자열 1과 문자열 2가 같으면 true. 다르면 false
		
		
		if ( input.equals("exit@"))break;
		
		str += input + "\n";
		// next() : 다음 한 단어 ( 띄어쓰기 포함 x)
		// nextLine() : 다음 한 줄 (띄어쓰기 포함 O)
		}
		
		System.out.println("=============================================");
		System.out.println(str);
}
	
	
	public void ex3() {
		// continue : 다음 반복으로 넘어감
		// 1~10까지 1씩 증가하며 출력
		// 단 , 3의 배수 제외
		
		//1 2 3 4 5 7 8 10
		for(int i=1 ; i<11 ; i++) {
			if(i%3==0)continue;
			System.out.print(i+" ");
		}
	}

	
	public void ex4() {
		// 1~100 까지 1씩 증가하며 출력하는 반복문
		// 단, 5의 배수는 건너뛰고
		// 증가하는 값이 40이 되었을때 반복 멈춤
		for(int i=1 ; i<101; i++) {
			if(i%5==0)continue;
			if(i>39)break;
			//해석순서 중요
			//if(i%5==0)continue;
			//if(i==40)break; 으로쓰면 해석 순서때문에 40을 그냥 건너뜀
			//==40 줄을 위로 올려줘야함 
			System.out.println(i);
		}
		
	}

	
	public void ex5() {}
	
	
	public void ex6() {}
	
	
	public void ex7() {}
	
	
	public void RSPGame() {
		//가위 바위보 게임을 할건데
		//몇 판할지 입력 받음
		//입력받은 판 수 만큼 반복
		
		//컴퓨터 : Math.random() : 0.0~ 1.0 난수 생성
		// 1~3 사이에 난수 생성
		// 1이면 가위 , 2이면 바위 ,3 이면 보 
		
		// 컴퓨터와 플레이어 가위바위보 판별
		// 플레이어 승! / 졌습니다
		// 매판마다 = 현재 기록 : 2승 1무 0패 등등

		System.out.println("판수 :");
		
		int round = sc.nextInt();
		
		//승패 기록용 변수
		int win = 0;
		int draw = 0;
		int lose = 0;
		
		for(int i =1; i<=round ; i++) {// 입력받은 판 수 만큼 반복
			System.out.println("\n" + i + "번째 게임");
			System.out.print("가위/바위/보 ! : ");
			String input = sc.next();
			
			int random = (int)(Math.random()*3 + 1);
			// 1이상 4미만 정수
			
			// switch로 random을 문자열로 바꾸기
			String computer = null ; 
			// null : 아무것도 참조하고있지 않다
			
			switch(random) {
			case 1 : computer = "가위";break;
			case 2 : computer = "바위";break;
			case 3 : computer = "보";break;
			}
			
			// 컴퓨터는 [바위]를 선택했습니다
			System.out.printf("컴퓨터는 %s\n",computer); 
			// 컴퓨터와 플레이어 가위바위보 판별하기
			if(input.equals(computer)) {
				System.out.println("비겼습니다");
				draw++;
			} else {
				boolean win1 = input.equals("가위") && computer.equals("보");
				boolean win2 = input.equals("바위") && computer.equals("가위");
				boolean win3 = input.equals("보") && computer.equals("바위");
				
				if(win1 || win2 || win3) {
					System.out.println("플레이어 승");
					win ++;
				}else {
					System.out.println("컴퓨터 승");
					lose ++;
				}
			}
			
			System.out.printf("현재 기록 : %d승 %d무 %d패\n",win,draw,lose);
			
			
//			if(input.equals("보")) {
//				if(computer.equals("보"))System.out.println("컴퓨터가 이겼어요!");
//			}
//		
//			
			
		}
		
		
		
	}

	
	
}
