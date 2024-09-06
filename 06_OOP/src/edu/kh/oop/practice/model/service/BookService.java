package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Book;

public class BookService {

	public void practice() {
		
		// 1) 기본생성자를 이용하여 첫 번째 Book 객체 생성
		Book book1 = new Book();
		// 2) 매개변수 생성자를 이용해서 두 번째 Book 객체 생성
		Book book2 = new Book("자바의정석",30000,0.2,"남궁성");
		
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		
		System.out.println("=============================");
		
		//4) 첫번째 객체가 가진 값을 setter 를 이용해서 수정
		book1.setTitle("C언어");
		book1.setPrice(30000);
		book1.setDiscountRate(0.1);
		book1.setAuthor("홍길동");
		// 5) 수정된 객체의 필드 값으 toString() 메소드 이용하여 출력
		System.out.println("수정된 결과 확인");
		System.out.println(book1.toString());
		
		System.out.println("=============================");
		 
		//6) 각 개체의 할인율을 적용한 책 가격을 계산하여 출력
		// 할인된 가격 = 가격 - (가격 * 할인율)
		System.out.println("도서명 = "+book1.getTitle());
		System.out.println("할인된 가격 = "+(int)(book1.getPrice()-book1.getPrice()*book1.getDiscountRate())+"원");
		System.out.println("도서명 = "+book2.getTitle());
		System.out.println("할인된 가격 = "+(int)(book2.getPrice()-book2.getPrice()*book2.getDiscountRate())+"원");
		
	}
}
