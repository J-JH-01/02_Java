package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Student;
//import edu.kh.oop.cls.model.vo.TestVo;
import edu.kh.oop.cls.model.vo.User;

//ClsService와 Student는 패키지가 다름을 알아두고 실행해보자
public class ClsService extends Student{ 
		//스튜던트만큼 확장시켜서 쓰겠다는 것
		// 부모로 Student 클래스를 상속 받음
		// Student(부모) -> ClsService(자식)
	
	public void ex1() {
		// 클래스 접근제한자 확인하기
		
		Student std = new Student();
		//public class 인 student는 inport 가능(어디서든 접근가능)
		
//		TestVo Test = new TestVo();
		//(default) class인 TestVo는 import 불가능( 다른패키지라 불가)
		
		//필드 접근제한자 확인하기
		System.out.println (std.v1);
		// -> 전체에서 접근 가능한 public인 v1만 에러발생x
		
//		System.out.println(std.v2);
//		//상속관계도 아닌걸 지금은 그게 뭔지도 모르고..
//		System.out.println(std.v3);
//		// 같은패키지 아니니까
//		System.out.println(std.v4);
//		// 해당 클래스 내부도 아니니깐
		
		
		//-------------------------------------------------------------------------------------------
		
		//상속 관계에서 직접 접근 가능범위 테스트
//		System.out.println(v1); // -> public - 프로그램 전체에서 접근 가능
//		System.out.println(v2); // Student 클래스를 상속받았으므로 Student의 protected 변수인 v2는 직접 접근가능 
//		System.out.println(v3); // (default) 다른패키지 X
//		System.out.println(v4); // 해당클래스가 아닌 다른클래스 X
	}
	
	
	public void ex2() {
		// static 필드 확인 예제
		
		// 학생 객체 2개 생성
		
		Student std1 = new Student();
		Student std2 = new Student();
		
		std1.setName("홍길동");
		std2.setName("김영희");
		
		System.out.println( std1.schoolName);
		System.out.println( std2.schoolName);
		//schoolName에 노란줄이 뜨는이유(경고) => 제대로 작성을 안해서
		
		// *** static이 붙은 필드(변수)는 '클래스명.변수명' 으로 사용함 ***
		System.out.println(Student.schoolName);
		
		Student.schoolName = "KH정보교육원";
		
		System.out.println( std1.schoolName);
		System.out.println( std2.schoolName);
		System.out.println( Student.schoolName);
		
		
		
		
	/*
	 * 
	 * 공유 메모리 영역(또는 정적 메모리 영역) 이라고 함
	 * 
	 *  -> 프로그램 시작 시 static이 붙은 코드들이 모두 
	 *  static 영역에 생성되고 
	 *  프로그램이 종료 될 때 까지 사라지지 않음(그래서 정적이라는 것)
	 *  그리고, static 영역에 생성된 변수는 어디서든지 공유가능 (그래서 공유 메모리 영역)
	 *  
	 *  메인 메서드 있는거 는 static있으니까 꼭 객체를 안만들어도 실행이 가능한 것 
	 *  
	 *  stack - 변수
	 *  heap - 가비지 컬렉터가 없애벌임
	 *  static -  
	 * 
	 */
	}
	
	public void ex3() {
		// 생성자 확인 테스트
		
		// User 기본 생성자를 이용해서 객체 생성 u1
		User u1 = new User();
		
		System.out.println(u1.getUserId());
		System.out.println(u1.getUserPw());
		System.out.println(u1.getUserName());
		System.out.println(u1.getUserAge());
		System.out.println(u1.getUserGender());
		
	User u2 = new User();
		
		System.out.println(u2.getUserId());
		System.out.println(u2.getUserPw());
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserGender());
		
		// 문제점 : u1이 참조하고있는 User 객체와 
		//			u2가 참조하고있는 User 객체의 필드값이 모두 동일함
		// 왜? 같은 기본 생성자로 user 객체를 생성했기 때문에
		System.out.println("===================================================================");
		
		//해결방법 1 : setter 이용해서 새로운 값으로 덮어쓰기
		u2.setUserId("asd1234");
		u2.setUserPw("1kl341");
		u2.setUserName("김영희");
		u2.setUserAge(30);
		u2.setUserGender('여');
		
		System.out.println(u2.getUserId());
		System.out.println(u2.getUserPw());
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserGender());
		
		//해결방법 2 : 매개변수 생성자를 이용해서
		// 객체가 생성될 때부터 다른값으로 필드를 초기화
		
		User u3 = new User("test3","password3333"); //매개변수 생성자를 이용하여 생성한 것
		
		System.out.println(u3.getUserId());
		System.out.println(u3.getUserPw());
		
	}
	
	public void ex4() {
		//매개변수 생성자 예제
		User u1 = new User(); //기본생성자
		User u2 = new User("user02","pass02"); //매개변수 2개 생성자
		User u3 = new User("user03","pass03","정지환",29,'남'); //매개변수 5개 생성자
		// 만약 하나라도 형식못맞추거나(인트인데 스트링넣거나)그러면 바로 에러떠벌임
		
		System.out.printf("u1 : %s / %s / %s / %d / %c\n",
				u1.getUserId(),u1.getUserPw(),u1.getUserName(),u1.getUserAge(),u1.getUserGender());
		
		System.out.printf("u2 : %s / %s / %s / %d / %c\n",
				u2.getUserId(),u2.getUserPw(),u2.getUserName(),u2.getUserAge(),u2.getUserGender());
		
		System.out.printf("u3 : %s / %s / %s / %d / %c\n",
				u3.getUserId(),u3.getUserPw(),u3.getUserName(),u3.getUserAge(),u3.getUserGender());
		
		
	}
	
	
	
}
