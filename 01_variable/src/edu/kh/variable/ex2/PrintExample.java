package edu.kh.variable.ex2;

public class PrintExample {

	public static void main(String[] args) {
		
		//System.out.print() : 단순 출력용 메서드(출력 후 줄바꿈 X)
		//System.out.println() : 한 줄 출력용 메서드(출력 후 줄바꿈 수행)
		// 줄바꿈 여부의 차이점은 있지만 괄호안의 내용이 그대로 출력된다는 것은 똑같다
		
		//System.out.println() : 자동완성가능
		System.out.println("테스트1");
		System.out.println("테스트2");
		
		System.out.print("테스트3");
		System.out.println(); // 내용없는 println() : 단순 줄바꿈
		System.out.print("테스트4");
		System.out.print("테스트5");
		System.out.println(); // 줄바꿈용
		
		// System.out.printf(); : 출력될 문자열 형식을 패턴으로 저장하는 출력구문
		
		int iNum1 = 10;
		int iNum2 = 5;
		
		// 10 + 5 = 15
		System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1+iNum2));
		//중간에 오타날 확률이 높아진다
		
//		System.out.printf("패턴", 패턴에 들어갈 값);
		System.out.printf("%d + %d = %d\n",iNum1,iNum2,iNum1+iNum2);
		//줄바꿈 : \n
		
		/*
		 *  %d : 정수형, %o : 8진수, %x : 16진수
			%c : 문자, %s : 문자열
			%f : 실수(소수점 아래 6자리), %e : 지수형태표현, %g : 대입 값 그대로
			%A : 16진수 실수
			%b : 논리형
		 */
		
		//10 + 10 * 5 / 2 = 35
		System.out.printf("%d + %d * %d / 2 = %d\n",iNum1,iNum1,iNum2,(iNum1+iNum1*iNum2/2));
		
		// 패턴 연습
		int iNum3 = 3;
		
		System.out.printf("%d\n",iNum3); // 3
		System.out.printf("%5d\n",iNum3); // 5칸 공간 확보 후 오른쪽 정렬
		System.out.printf("%-5d",iNum3); // 5칸 공간 확보 후 왼쪽 정렬
		System.out.printf("%-5d\n",iNum3); // 5칸 공간 확보 후 왼쪽 정렬
		
		// 소수점 자리 제어(반올림처리)
		
		System.out.printf("%f\n",10/4.0);
		System.out.printf("%.2f\n",10/4.0); // 소수점 둘째 자리까지만 나타내고 싶다
		System.out.printf("%.0f\n",10/4.0); // 소수점 표현 안함, 허나 소수점 첫째에서
		
		// 문자, 문자열, boolean
		boolean isTrue = false;
		char ch = '가';
		String str = "안녕하세요~!"; // 참조형
		
		// false / 가 / 안녕하세요~!
		System.out.printf("%b / %c / %s\n",isTrue,ch,str);
		
		// escape(탈출 문자) : 일반문자가 아닌 특수 문자 표현
		
//		System.out.println("\"); 오류난다
		System.out.println("\\"); // \
		System.out.println("\\0/"); // \o/
		System.out.println("%d 은 할 수있다"); // 
		
		// tab : 한공간씩 표현X , 한번에 공간차지
		System.out.println("a\tb\tc\td");
		
		// 유니코드 이스케이프
		System.out.println("\u0041"); //A
		// 유니코드(16진수)
		// 65를 16진수로 표현 , 65나누기 16하면 몫4,나머지1
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
