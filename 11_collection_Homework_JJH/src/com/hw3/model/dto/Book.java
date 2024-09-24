package com.hw3.model.dto;

import java.util.Objects;

public class Book {

	private int booknum;
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	public int getBooknum() {
		return booknum;
	}
	public void setBooknum(int booknum) {
		this.booknum = booknum;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(int booknum, String title, String author, int price, String publisher) {
		super();
		this.booknum = booknum;
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, booknum, price, publisher, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && booknum == other.booknum && price == other.price
				&& Objects.equals(publisher, other.publisher) && Objects.equals(title, other.title);
	}
	@Override
	public String toString() {
		return booknum + "번 도서 : [도서제목 : " + title + " / " + "저자 : " + author + " / " + "도서가격 : " + price + "원 / " + "출판사 : " + publisher + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
