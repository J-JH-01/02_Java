package com.hw3.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Iterator;

import com.hw3.model.dto.Book;

public class BookService {
	List<Book> normalList = new ArrayList<>();
	List<Book> markedList = new ArrayList<>();

	Scanner sc = new Scanner(System.in);

	public void displayMenu(Object defalut) {
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

			case 1: {
				System.out.print("\n 도서 번호 : ");
				int num = sc.nextInt();
				System.out.print("\n 도서명 : ");
				String title = sc.next();
				System.out.print("\n 도서 저자 : ");
				String author = sc.next();
				System.out.print("\n 도서 가격 : ");
				int price = sc.nextInt();
				System.out.print("\n 도서 출판사 : ");
				String pub = sc.next();

				normalList.add(new Book(num, title, author, price, pub));
				System.out.println("등록완료");
				break;
			}

			case 2: {
				for (Book b : normalList)
					System.out.println(b.toString());
				break;
			}

			case 3: {
				System.out.println("\n========== 도서수정 ==========");

				System.out.print("\n수정할 도서 번호를 입력하세요");
				int i = sc.nextInt();

				System.out.println("\n1. 도서명");
				System.out.println("\n2. 도서 저자");
				System.out.println("\n3. 도서 가격");
				System.out.println("\n4. 도서 출판사");
				System.out.println("\n0. 수정 종료");
				System.out.print("\n어떤 정보를 수정하시겠습니까?");
				int k = sc.nextInt();

				for (Book b : normalList) {
					if (b.getBooknum() == i) {
						switch (k) {
						case 1: {
							System.out.println("=====도서명 수정=====\n");
							System.out.print("수정할 도서명을 입력하세요\n");
							b.setTitle(sc.next());
							System.out.println("수정 완료\n");
							break;
						}

						case 2: {
							System.out.println("=====저자명 수정=====\n");
							System.out.print("수정할 저자명을 입력하세요\n");
							b.setAuthor(sc.next());
							System.out.println("수정 완료\n");
							break;
						}

						case 3: {
							System.out.println("=====도서 가격 수정=====\n");
							System.out.print("수정할 가격을 입력하세요\n");
							b.setPrice(sc.nextInt());
							System.out.println("수정 완료\n");
							break;
						}

						case 4: {
							System.out.println("=====출판사명 수정=====\n");
							System.out.print("수정할 출판사명을 입력하세요\n");
							b.setPublisher(sc.next());
							System.out.println("수정 완료\n");
							break;
						}

						case 0: {
							break;
						}
						default: {
							System.out.println("잘못 입력하셨습니다");
						}
						}

					}
				}

				break;
			}

			case 4: {
				System.out.println("\n========== 도서삭제 ==========");

				System.out.print("\n삭제할 도서 번호를 입력하세요");
				int i = sc.nextInt();
				
				 Iterator<Book> iterator = normalList.iterator();
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

			case 5: {// 즐겨찾기 추가
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
				for (Book b : markedList)
					System.out.println(b.toString());
				break;
			}

			case 8: {// 추천도서 뽑기
				Random random = new Random();
				System.out.println(normalList.get(random.nextInt(normalList.size())));		
				break;
			}

			case 0: {
				x = false;
				break;
			}

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
