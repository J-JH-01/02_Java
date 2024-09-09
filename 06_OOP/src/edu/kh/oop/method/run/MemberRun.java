package edu.kh.oop.method.run;

import edu.kh.oop.method.model.service.MemberService;

public class MemberRun {//실행용 클래스

	public static void main(String[] args) { 

		MemberService service = new MemberService();
		//MemberService의 기본 생성작성되어있지않지만
		//컴파일러가 코드를 번역할 때 클래스 내부에 생성자가 하나도 없다면
		//자동으로 기본생성자를 추가해주기 때문에 문제없이 사용 가능!
		
		// **주의사항**
		// 만약에 생성자가 하나라도 있으면 자동생성 안해준다!
		service.displayMenu();
		
	}

}
