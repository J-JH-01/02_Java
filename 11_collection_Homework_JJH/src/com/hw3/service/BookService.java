package com.hw3.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.hw3.model.dto.Book;

public class BookService {
	List<Book> normalList = new ArrayList<>();
	List<Book> markedList = new ArrayList<>();

	Scanner sc = new Scanner(System.in);

	public void displayMenu(Object defalut) {
		/*
		 * try ~ catch(Exception E) 예외발생 최상위 클래스 사용
		 * e.printStackTrace 해서 예외추적
		 */
		boolean x = true;
		while (x) {
			System.out.println("===도서 목록 프로그램===\n");
			System.out.println("1. 도서 등록\n");
			System.out.println("2. 도서 조회\n");
			System.out.println("3. 도서 수정\n");
			System.out.println("4. 도서 삭제\n");
			System.out.println("5. 즐겨찾기 추가\n");
			System.out.println("6. 즐겨찾기 삭제\n");
			System.out.println("7. 즐겨찾기 조회\n");
			System.out.println("8. 추천도서 뽑기\n");
			System.out.println("0. 프로그램 종료\n");
			System.out.print("메뉴를 입력하세요");

			switch (sc.nextInt()) {

			case 1: addBook(); break;
			

			case 2: showBookList(normalList); break;
			

			case 3: System.out.println(editBook()); break;
			

			case 4: System.out.println(deleteBook()); break;
			

			case 5: {// 즐겨찾기 추가
				//addMarkedbook();
				System.out.print("즐겨찾기할 도서 번호를 입력해주세요");
				int i = sc.nextInt();
				boolean y = true;
				for(Book b : normalList) {
					if(b.getBooknum()==i)markedList.add(b);
					System.out.println("등록 성공");
					y = false;
					break;
				}
				if(y)System.out.println("등재되지 않은 번호입니다");
				break;
			}

			case 6: {// 즐겨찾기 삭제
				//deleteMarkedBook()
				System.out.println("\n==========즐겨찾기 도서 삭제 ==========");

				System.out.print("\n삭제할 도서 번호를 입력하세요");
				int i = sc.nextInt();
				
				 Iterator<Book> iterator = markedList.iterator();
				 boolean y = true;
				 while (iterator.hasNext()) {
			            Book book = iterator.next();
			            if (book.getBooknum() == i) {
			                iterator.remove();
			                System.out.println("삭제되었습니다");
			                y = false;
			                break; // 삭제 후 루프 종료
			            }
			        }
				if(y) System.out.println("등재되지 않은 번호입니다");

				break;
			}

			case 7: {// 즐겨찾기 조회
				//showBookList(markedList);
				for (Book b : markedList)
					System.out.println(b.toString());
				break;
			}

			case 8: // 추천도서 뽑기
				randomBook();break;
	

			case 0: x = false; break;
			

			}

		}

	}

	public BookService() {
		normalList.add(new Book(1111, "세이노의 가르침", "세이노", 6480, "데이원"));
		normalList.add(new Book(2222, "문과남자의 과학공부", "유시민", 15750, "돌베개"));
		normalList.add(new Book(3333, "역행자", "자청", 17550, "웅진지식하우스"));
		normalList.add(new Book(4444, "꿀벌의 예언", "베르나르 베르베르", 15120, "열린책들"));
		normalList.add(new Book(5555, "도둑맞은 집중력", "요한 하리", 16920, "어크로스"));
	}

	public BookService(List<Book> normalList, List<Book> makredList, Scanner sc) {
		super();
		this.normalList = normalList;
		this.markedList = makredList;
		this.sc = sc;
	}
	
	
	
	
	/** 도서 등록 메서드
	 * 
	 */
	public void addBook() {
		System.out.println("\n========== 도서 등록 ==========");		
		
		System.out.print("\n 도서 번호 : ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.print("\n 도서명 : ");
		String title = sc.nextLine();
		System.out.print("\n 도서 저자 : ");
		String author = sc.nextLine();
		System.out.print("\n 도서 가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.print("\n 도서 출판사 : ");
		String pub = sc.nextLine();

		normalList.add(new Book(num, title, author, price, pub));
		System.out.println("\n등록완료");
	}
	
	
	
	/** 도서 목록 조회용 메서드
	 * 
	 * @param List<Book>
	 */
	public void showBookList(List<Book> list) {
		if(list.isEmpty()) System.out.println("등록된 도서가 없습니다.도서를 등록해주세요");
		else {
			for (Book b : list)
				System.out.println(b); // Book.toString
			
		}	
	}
	
	
	/**도서 수정용 메서드
	 * 
	 * @return
	 */
	public String editBook() {
		System.out.println("\n========== 도서수정 ==========");

		//등록된 도서 출력
		showBookList(normalList);
		
		System.out.print("\n수정할 도서 번호를 입력하세요");
		int i = sc.nextInt();

		System.out.println("\n1. 도서명");
		System.out.println("\n2. 도서 저자");
		System.out.println("\n3. 도서 가격");
		System.out.println("\n4. 도서 출판사");
		System.out.println("\n0. 수정 종료");
		System.out.print("\n어떤 정보를 수정하시겠습니까?");
		int k = sc.nextInt();
		boolean flag = true;
		
		for (Book b : normalList) {
			if (b.getBooknum() == i) {
				flag = false;
				
				switch (k) {
				case 1: 
					System.out.println("=====도서명 수정=====\n");
					System.out.print("수정할 도서명을 입력하세요\n");
					b.setTitle(sc.nextLine());
					System.out.println("수정 완료\n");
					break;
				

				case 2: 
					System.out.println("=====저자명 수정=====\n");
					System.out.print("수정할 저자명을 입력하세요\n");
					b.setAuthor(sc.nextLine());
					System.out.println("수정 완료\n");
					break;
				

				case 3: 
					System.out.println("=====도서 가격 수정=====\n");
					System.out.print("수정할 가격을 입력하세요\n");
					b.setPrice(sc.nextInt());
					System.out.println("수정 완료\n");
					break;
				

				case 4: 
					System.out.println("=====출판사명 수정=====\n");
					System.out.print("수정할 출판사명을 입력하세요\n");
					b.setPublisher(sc.nextLine());
					System.out.println("수정 완료\n");
					break;
				

				case 0: System.out.println("종료합니다"); break;
				
				default: System.out.println("메뉴에 있는 번호만 입력하세요"); break;
				}
				
				break;
			}
		}
		if(flag) return "일치하는 도서번호가 없습니다";
		
		return "수정완료";

	}
	
	
	
	/** 도서 삭제용 메서드 
	 *  
	 * @return
	 */
	public String deleteBook() {
		System.out.println("\n========== 도서삭제 ==========");

		showBookList(normalList);
		
		System.out.print("\n삭제할 도서 번호를 입력하세요");
		int i = sc.nextInt();
		
		
		for (Book b : normalList) {
			if (b.getBooknum() == i) {
				int index = normalList.indexOf(b);
				// int List.indexof(Object) : List에 일치하는 객체가 있으면 그 객체가 잇는 index 번호 반환
				
				System.out.println("index번호 : "+ index);
			
				System.out.println("정말 삭제하시겠습니까? (Y/N) : ");
				
			char answer = sc.next().toUpperCase().charAt(0);
			
			if(answer == 'y') {normalList.remove(index);break;}
			else return "삭제를 취소합니다";
			}
		}
		
//		 Iterator<Book> iterator = normalList.iterator();
//		 boolean y = true;
//		 while (iterator.hasNext()) {
//	            Book book = iterator.next();
//	            if (book.getBooknum() == i) {
//	                iterator.remove();
//	                System.out.println("삭제되었습니다");
//	                y = false;
//	                break; // 삭제 후 루프 종료
//	            }
//	        }
//		if(y) System.out.println("등재되지 않은 번호입니다");
		
		return "삭제가 완료되었습니다";
	}
	
	
	/** 추천 도서 뽑기
	 * 
	 */
	public void randomBook() {
//		Random random = new Random();
//		System.out.println(normalList.get(random.nextInt(normalList.size())));	
		
		int max = normalList.size();
		
		int random = (int)(Math.random() * max); // 0 ~ 리스트의 마지막 인덱스 번호
		
		System.out.println(normalList.get(random));
	}
	
	

	
	// 겟/셋
	public List<Book> getNormalList() {
		return normalList;
	}

	public void setNormalList(List<Book> normalList) {
		this.normalList = normalList;
	}

	public List<Book> getMakredList() {
		return markedList;
	}

	public void setMakredList(List<Book> makredList) {
		this.markedList = makredList;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

}
