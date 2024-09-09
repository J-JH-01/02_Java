package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

//웹 서비스의 기본은 사용자(클라이언트)가 서버에게 요청을 보내고, 서버가 사용자한테 응답해주는 형태
//Controller : 사용자의 요청을 받아서 처리하고 , 그 입력에 따라 Model(데이터처리, 비즈니스 로직)과 view를 연결해주는 역할
//클라이언트->요청 -> 컨트롤러 -> 서비스 -> DB에서 CRUD -> 서비스 -> 컨트롤러 -> view -> 클라이언트
public class SnackController {

	//필드
	private Snack s = new Snack();
	
	//생성자
	public SnackController() {
		
	}
	
	//메서드
	// 데이터를 setter를 이용하여 저장하고, 저장완료 결과 반환하는 메서드
	public String saveData(String kind,String name,String flavor, int numOf, int price) {
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		return "저장 완료되었습니다"+"\n저장한 정보를 확인하시겠습니까?(y/n) : ";
	}
	
	public String confirmData() {
		//저장된 데이터를 반환함
		return s.information();
	}
}
