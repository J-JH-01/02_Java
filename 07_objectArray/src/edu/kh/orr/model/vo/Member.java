package edu.kh.orr.model.vo;

public class Member {
	//속성(필드 == 멤버변수)
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	private String region; // 지역 (서울,경기,충북 ..)
	
	
	
	// 기능(생성자,메서드)
	// 생성자
	// 기본 생성자, 매개변수 생성자
	// 생성자 만드는 규칙은
	// 1. 생성자 이름은 클래스명과 같다
	// 2. 반환형이 없다
	
	//** 기본생성자는 컴파일러가 자동으로 생성해주는데, 생성자가 하나라도 있으면 자동생성 안해줌
	// -> 매개변수 생성자가 있다면, 기본생성자 직접 작성 해야함!
	
	public Member() { //기본생성자
	}


// 매개변수 생성자
// 오버로딩 : 매개변수의 자료형, 순서, 갯수가 달라야한다!
	public Member(String memberId, String memberPw, String memberName, int memberAge, String region) {
//		super();
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
		this.region = region;
	}

	// 메서드
	// getter / setter
	// -> 왜 만드나?
	// -> 필드에 선언된 멤버변수들이 캡슐화 원칙에 의해서 private으로 만들어짐
	// -> private은 다른 클래스에서 직접 접근 불가함
	// -> 간접 접근 방식으로 값을 세팅/얻어올 수 있어야함
	// -> 그래서 getter/setter 접근제한자가 public 임.
	// alt + shift + S , R버튼

	public String getMemberId() {
		// String : 반환형 -> String 자료형을 나(이 메서드)를 호출한 쪽으로 돌려보내겠다
		
		return memberId;
		// return memberId; : 이 메서드를 호출한 쪽으로 memberId에 저장된 값을 돌려보낸다.
		// -> 매개변수가 없어서 중복된 이름의 memberId가 없기 때문에 this를 안 사용해도 된다
	}

	// setter : 세팅하는 얘, 무엇을 세팅할지 전달받아온 아이가 매개변수.
	public void setMemberId(String memberId) {
		// 반환형 void : 반환값이 없다.
		this.memberId = memberId;
		return;
		//모든 메서드는 종료 시 호출한 곳으로 돌아가는 return; 구문이 작성되야 하지만,
		// void일 경우 컴파일러가 자동 추가해준다.
	}


	public String getMemberPw() {
		return memberPw;
	}


	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}


	public String getMemberName() {
		return memberName;
	}


	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}


	public int getMemberAge() {
		return memberAge;
	}


	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}
	
	
	
}
