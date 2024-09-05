package edu.kh.oop.practice.model.vo;

public class Book {
	
	//필드
	private String title; //도서명
	private int price; // 가격
	private double discountRate; // 할인율
	private String author; // 저자명

	
	
	//생성자
	//ctrl + space 누르고 제일위가 기본생성자만들기(+enter)
	public Book() {
		
	}
	
	//alt+shift+s 에 generate constructor using fields : 필드를 써서 생성자 만들기라는게 있음
	public Book(String title, int price, double discountRate, String author) {
		//super(); 상속할때 하는거라 지금은 필요 x
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	
	
	//메서드
	
	//게터,세터
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	// @ : 어노테이션 -> 컴파일러용 주석
	// Overriding : 재정의(메서드)
	@Override
	public String toString() {
		return title + " / " + price + " / " + discountRate + " / " + author; //문자열 리턴임
	}
	
	
	 
	
	
	
	
	
	
}