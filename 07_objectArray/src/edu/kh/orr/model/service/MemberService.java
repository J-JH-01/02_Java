package edu.kh.orr.model.service;

import java.util.Scanner;

import edu.kh.orr.model.vo.Member;

public class MemberService {
	// 속성
	private Scanner sc = new Scanner(System.in);

	// Member 5칸 짜리 객체배열 선언 및 할당

	private Member[] memberArr = new Member[5];

	// 현재 로그인한 회원의 정보를 저장할 참조 변수 선언
	private Member loginMember = null;

	// 기본생성자
	// 단 만들때 배열로 만들어서 3개 만들어지게 해보자

	public MemberService() {// 기본생성자
		// memberArr 배열 0,1,2 인덱스 초기화
		memberArr[0] = new Member("user01", "pass01", "홍길동", 30, "서울");
		memberArr[1] = new Member("user02", "pass02", "심수련", 35, "동탄");
		memberArr[2] = new Member("user03", "pass03", "박존", 40, "냉면");
	}

	// 기능

	// 메뉴 출력용 메서드
	public void displayMenu() {

		int menuNum = 0; // 메뉴 선택용 변수

		// 무조건 한번은 반복
		do {

			System.out.println("=== 회원 정보 관리 프로그램 ver.2 ===");

			System.out.println("1. 회원가입");

			System.out.println("2. 로그인");

			System.out.println("3. 회원 정보 조회");

			System.out.println("4. 회원 정보 수정");

			System.out.println("5. 회원 검색(지역)");

			System.out.println("0. 프로그램 종료");

			System.out.print("메뉴 입력 : ");

			// 입력 버퍼 남은 개행문자 제거
			menuNum=sc.nextInt();
			sc.nextLine();

			switch (menuNum) {
			case 1:
				/* 회원가입 */
				System.out.println( signUp() );break;

			case 2:
				/* 로그인 */
				System.out.println( login() );break;

			case 3:
				/* 조회 */
				System.out.println( selectMember() );break;

			case 4:
				/* 수정 */
				switch( updateMember() ) 
				{
				case -1 : System.out.println("로그인을 해주세요"); break;
				case 0 : System.out.println("비밀번호가 일치하지 않습니다"); break;
				case 1 : System.out.println("정보가 수정되었습니다"); break;
				}
				break;

			case 5:
				/* 지역검색 */
				searchRegion();break;

			case 0:
				System.out.println("프로그램 종료...");
				break;

			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요!");
			}

		} while (menuNum != 0); // menuNum이 0이되면 반복 종료
	}

	// memberArr의 비어있는 인덱스 번호를 반환하는 메서드
	// 단, 비어있는 인덱스가 없다면 -1 반환

	public int emptyIndex() {
		for (int i = 0; i < memberArr.length; i++) {
			if (memberArr[i] == null)
				return i; // 현재 메서드를 종료하고 호출한 곳으로 i값을 가지고 돌아감
		}

		// for문을 수행했지만 return 이 되지 않은 경우 이 위치의 코드가 수행될 것
		// -> for문에서 return 이 안되었다? == 배열에 빈칸이없다
		return -1;
	}
	
	//회원가입 메서드
	public String signUp() {
		System.out.println("\n=========회원 가입=========");
		
		// 객체배열 memberArr에 새로 가입할 회원 정보를 저장할 예정
		// -> 새로운 회원 정보를 저장할 공간이 있는지 확인하고
		// 빈 공간의 인덱스 번호를 얻어오기
		
		int index = emptyIndex(); //memberArr 배열에서 비어있는 인덱스 반환받음 없으면 -1반환
		
		if(index == -1) { //빈 인덱스가 없음 -> 회원가입 불가
			return "회원가입 불가능합니다 (인원수 초과)";
			
		}
		
		//회원 가입 가능
		System.out.print("아이디 : ");
		String memberId = sc.next();
		
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		
		System.out.print("비밀번호 확인 : ");
		String memberPw2 = sc.next();
		
		System.out.print("이름 : ");
		String memberName = sc.next();
		
		System.out.print("나이 : ");
		int memberAge = sc.nextInt();
		
		System.out.print("지역 : ");
		String region = sc.next();
		

		// 비밀번호, 비밀번호 확인이 일치하면 회원가입
		// 일치하지 않으면 회원가입 실패
		if(memberPw.equals(memberPw2)) {
			//일치하는 경우
			
			//새로운 Member 객체 생성해서 할당된 주소를
			//memberArr의 빙있는 인덱스에 대입

		memberArr[index] = new Member(memberId,memberPw,memberName,memberAge,region);
		return "회원 가입 성공!!!";
		}else { //불일치하는 경우
			return "회원가입 실패!!! (비밀번호 불일치)";
			
		}
		
	
					
	}
	
	public String login() {
		System.out.println("\n=====로그인=====");
		
		System.out.print("아이디 입력 : ");
		String memberId = sc.next();
		
		System.out.print("비밀번호 입력 : ");
		String memberPw = sc.next();
		
		// 1)memberArr 배열 내 요소를 순서대로 접근하여 null이 아닌지 확인
		for(int i =0 ; i < memberArr.length; i++) {
			if(memberArr[i] != null) {// 회원정보가 있을 경우
			//2 회원 정보의 아이디, 비밀번호 와 입력받은 아이디,비밀번호가 같은지 비교
				// 입력받은 아이디(memberId),비밀번호(memberPw)가 같은지 비교
			if(memberArr[i].getMemberId().equals(memberId) && 
			   memberArr[i].getMemberPw().equals(memberPw)) {
				//3) 로그인 회원 정보 객체를 참조할 변수 loginMember에 
				// 현재 접근중인 memberArr[i] 요소에 저장된 주소를 얕은 복사
				loginMember = memberArr[i];
				break; // 더이상 같은 아이디,비밀번호가 없기 떄문에 효율을 위해서 for문 종료
				}
			}
		}
		
	    // 4) 로그인 성공/실패 여부에 따라 결과값 반환
		if(loginMember == null) { //로그인 실패했다는 것
			return "아이디 또는 비밀번호가 일치하지 않습니다";
		}
		else { //로그인 성공
			return loginMember.getMemberName()+"님 환영합니다!";
		}
		
	}
	
	//회원 검색(지역) 메서드
	public void searchRegion() {
		System.out.println("\n=====회원 검색(지역)=====");
		
		System.out.print("검색할 지역을 입력하세요");
		String inputRegion = sc.next();
		
		//검색 결과 신호용 변수
		boolean flag = true;
		
		// 1)memberArr 배열의 모든 요소 순차 접근
		for(int i=0; i<memberArr.length ; i++) {
			// 2) memberArr[i] 요소가 null 인 경우 반복 종료
			if(memberArr[i] == null)break;
			// 3) memberArr[i] 요소에 저장된 지역(region)이 
			// 입력받은 지역(inputRegion)과 같을 경우 
			// 회원의 아이디,이름을 출력
			if(memberArr[i].getRegion().equals(inputRegion)){
				System.out.printf("아이디 : %s, 이름 : %s\n",memberArr[i].getMemberId(),memberArr[i].getMemberName());
				flag = false;
			}
			
		}
		
		if(flag)System.out.println("일치하는 검색 결과가 없습니다"); // 플래그가 트루라는건 결국 못찾았다는 
	}
	
	//회원 정보 조회 메서드
	public String selectMember() {
		//1) 로그인 여부 확인
		if(loginMember == null) { //로그인 실패했다는 것
			return "로그인을 해주세요";
		}
		else { 
			String str = "이름 : " + loginMember.getMemberName();
			str += "\n아이디 : "+loginMember.getMemberId();
			str += "\n나이 : " + loginMember.getMemberAge();
			str += "\n지역 : " + loginMember.getRegion();	
		
			return str;
		}
		//2) 로그인이 되어있는 경우
		// 현재 로그인한 회원의 정보를 출력할 문자열을 만들어 반환
		// 단, 비밀번호 제외(이름,아이디,나이,지역)
		
		//이름 : 홍길동
		// 아이디: user01
		// 나이 : 20
		// 지역 : 서울
	}
	
	// 회원 정보 수정 메서드
	public int updateMember() {
		//1) 로그인 여부 판별
		// -> 로그인이 되어있지 않으면 -1 반환
		if(loginMember == null) { //로그인 실패했다는 것
			return -1;
		}
		else { 
			System.out.println("수정할 회원 정보를 입력해주세요");
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("지역 : ");
			String area = sc.next();
			
			System.out.print("정보 변경을 위해 비밀번호를 입력해 주세요");
			String pass = sc.next();
			
			if(pass.equals(loginMember.getMemberPw())) {
				loginMember.setMemberName(name);
				loginMember.setMemberAge(age);
				loginMember.setRegion(area);
				return 1;
			}else return 0;

		}
		//2) 수정할 회원 정보 입력 받기 (이름,나이,지역)
		
		// 3) 비밀번호를 입력받아서 로그인한 회원의 비밀번호와 일치하는지 확인
		
		// 4) 비밀번호가 같을 경우 로그인한 회원의 이름,나이,지역 정보를 입력받은 값으로 변경후 1반환
		
		// 5) 비밀번호가 다른 경우 0 반환
	}
	
}
