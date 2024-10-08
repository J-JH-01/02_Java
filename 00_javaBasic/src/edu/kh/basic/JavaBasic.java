package edu.kh.basic;

// 한 줄 주석 : 컴파일러가 해석하지 않는 부분,개발자가 확인하기 위한 메모
/* 범위 주석 */

// class : 자바 코드가 작성되는 영역
public class JavaBasic {
	// main method(메서드) : 자바 어플리케이션(프로그램)을 실행하기 위해 반드시 필요한 메서드
	
	// main 쓰고 ctrl + space -> 맨 위에 main method 자동완성 enter
	// 실행 : ctrl + F11 or 상단의 플레이버튼 
	// 줄복사 : ctrl + alt + 방향키(위아래) : 방향키 방향으로 해당 줄 복사
	public static void main(String[] args) {
		System.out.println("Hello world!");
		System.out.println("점심 뭐먹지");
		System.out.println("---------------------------------------------");
		
		// 숫자 연산
		System.out.println("1+2");
		System.out.println(1+2); // 3
		
		// "" 안에 작성된 코드는 단|순 문자열로 인식
		// "" 안에 작성되지 않은 코드는 숫자, 변수로 인식
		
		System.out.println(50-23);
		System.out.println(12*13);
		System.out.println(372/3);
		System.out.println(12%5);
		
		//"" (문자열) + 숫자 함께 작성
		System.out.println("14*19= "+ 266);
		System.out.println("14*19= "+ 14*19);
		
		System.out.println(""+90+70+65);
		System.out.println("90+70+65 = " +90+70+65);
		System.out.println("90+70+65 = " +(90+70+65));
		// 자바는 사칙연산의 우선 순위를 그대로 따른다
		// -> 우선 계산을 원하면 () 괄호 사용
		
		// + 기호의 역할
		// : 숫자+숫자 = 덧셈 연산 결과
		//	문자열 + 숫자 or 문자열 + 문자열 = 이어쓰기
		//	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
