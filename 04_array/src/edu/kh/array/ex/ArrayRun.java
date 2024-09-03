package edu.kh.array.ex;

public class ArrayRun { //실행용 클래스

	public static void main(String[] args) {
		ArrayExample1 arrayEx1 = new ArrayExample1(); // 이거도 힙 영역에 만들어짐
		
//		arrayEx1.ex1();
		
		//배열특징
		//1.한가지 자료형만 저장가능
		//2.여러값을 넣을 수 있음
		//3.크기가 지정되면 바꿀 수 없음
		
//		arrayEx1.ex2();
//		arrayEx1.ex3();
//		arrayEx1.ex4();
//		arrayEx1.ex5();
//		arrayEx1.ex6();
//		arrayEx1.ex9();
		
		ArrayExample2 arrayEx2 = new ArrayExample2();
		
//		arrayEx2.shallowCopy();
//		arrayEx2.deepCopy();
		
		arrayEx2.createLottoNumber();
	}

}
