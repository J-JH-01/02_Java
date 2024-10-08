package edu.kh.variable.ex1;

// 생성된 .java 파일과 class 오른쪽에 작성된 이름은 같아야 한다!! 고칠거면 둘 다 고칠것
public class VariableExample1 {

	public static void main(String[] args) {
		
		System.out.println(2 * 3.141592653589793*5);
		System.out.println(3.141592653589793 * 5 * 5);
		System.out.println(3.141592653589793 * 5 * 5 * 20);
		System.out.println(4 * 3.141592653589793 * 5 * 5);
		
		/* 변수 (Variable)
		 * - 메모리(RAM)에 값을 기록하는 공간
		 * 	-> 공간에 기록되는 값(Data)이 변할 수 있어서 변수라고 한다
		 * 
		 * - 변수는 여러 종류 존재 (저장되는 값의 형태, 크기가 다름)
		 * 
		 *  변수 사용의 장점
		 *  1. 가독성 증가
		 *  2. 재사용성 증가(한번 만든 변수를 계속 사용)
		 *  3. 코드 길이 감소
		 *  4. 유지 보수성 증가(코드 수정이 간단해짐)
		 *  
		 * */
		
		// 변수 사용
		double pi = 3.141592653589793; // 원주율
		int r = 5; //반지름
		int h = 20; //높이(height)
		
		System.out.println(2 * pi * r); // 원의 둘레
		System.out.println(pi * r * r); // 원의 넓이
		System.out.println(pi * r * r * h); // 원기둥의 부피
		System.out.println(4 * pi * r * r ); //구의 겉넓이
		
		// 세상이 뒤집혀서 pi값이 2가 됨
		// 그때도 유지보수가 쉬움
		pi = 2;
		
		System.out.println(2 * pi * r); // 원의 둘레
		System.out.println(pi * r * r); // 원의 넓이
		System.out.println(pi * r * r * h); // 원기둥의 부피
		System.out.println(4 * pi * r * r ); //구의 겉넓이
		
		
		int k = 9;
		for(int i=1 ; i <=9 ; i++) {
			int x = k*i;
			System.out.printf("%d,%d,%d\n",k,i,x);
		}
		
		
		// char 는 홑따옴표
		// String의 변수는 쌍따옴표
		// 자바는 정수와 실수부가 다르다
		// 스트링은 참조형 변수라 성질이 조금 다르다
		
	}
}
