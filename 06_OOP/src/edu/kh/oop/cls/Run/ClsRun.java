package edu.kh.oop.cls.Run;

import edu.kh.oop.cls.model.service.ClsService;

public class ClsRun {

	public static void main(String[] args) {
		ClsService cs = new ClsService();
		//ClsService 클래스에 기본생성자를 작성한적 없지만 기본생성자 호출, 객체도 잘만들어서 사용중
		// 왜 되는 거지..?
		// -> 컴파일러가 코들르 번역할 때
		// 클래스 내부에 생성자가 하나도 없다면 자동으로 기본 생성자를 추가해줌(우리눈엔 안보임)
		
		
		
		
		
//		cs.ex2();
//		cs.ex3();
		cs.ex4();
	}

}
