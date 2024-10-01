package project.toy.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import javax.swing.text.ChangedCharSetException;

import project.toy.dto.bullet;


public class GameService {
	
	bullet bul = new bullet();
	List<String> Armo = bul.getArmo();
	int armoSize= Armo.size();

	Scanner sc = new Scanner(System.in);
	Random ran = new Random();
	
	int playerHP = 3;
	int dealerHP = 3;

	public void displayMenu() {
		reload(0);
		boolean x = true;

		while (x) {
			
			System.out.println("===러시안 룰렛===\n");
			System.out.println("1. 총알 추가");
			System.out.println("2. 총알 세팅 확인");
			System.out.println("3. 총알 변경");
			System.out.println("4. 총알 삭제");
			System.out.println("5. 게임 실행");
			System.out.println("6. 룰 설명");
			
	
			System.out.println("0. 프로그램 종료\n");
			
			System.out.print("메뉴를 입력하세요");

			switch (sc.nextInt()) {

			case 1: addBullet(); break;
				//총알 추가

			case 2: showBulletList(); break;
				// 총알 조회

			case 3: editBullet(); break;
				// 총알 변경

			case 4: deleteBullet(); break;
				// 총알 삭제
			
			case 5: gameStart(); x = false; break;
				
			case 6: System.out.println(manual()); break; 
			
			case 0: x = false; break;
			
			default : System.out.println("잘못 입력하셨습니다"); break;

			}

		}

	}

	public GameService() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	/** 도서 등록 메서드
	 * 
	 */
	public void addBullet() {
		System.out.println("\n========== 총알 추가 ==========");
		System.out.println("현재 총알 목록");
		showBulletList();
		
		System.out.println("추가하고자 하는 색상의 총알을 입력해주세요(빨강/파랑) : ");
		String input = sc.next();
		if(input.equals("빨강"))Armo.add("빨강");
		else if(input.equals("파랑"))Armo.add("파랑");
		else {System.out.println("잘못 입력하셨습니다 다시 시도해주세요\n");return;}
		
		armoSize++;
		System.out.println("추가 되었습니다\n");
	}
	
	
	
	/** 총알 순서 조회용 메서드
	 * 
	 */
	public void showBulletList() {
		System.out.println(Armo);
	}
			

	
	
	/** 총알 수정용 메서드
	 * 
	 * @return
	 */
	public void editBullet() {
		System.out.println("\n========== 총알 수정 ==========");

		// 등록된 총알 출력
		System.out.println("현재 총알 목록");
		showBulletList();

		System.out.print("몇번째 총알의 색깔을 바꾸시겠습니까? : ");
		int i = sc.nextInt();
		String changedBulletColor;

		if (i > Armo.size() || i  < 1)
			System.out.println("범위 밖의 번호입니다\n");
		else {
			if (Armo.get(i - 1).equals("빨강")) {
				changedBulletColor = "파랑";
				Armo.set(i - 1, changedBulletColor);
			} else {
				changedBulletColor = "빨강";
				Armo.set(i - 1, changedBulletColor);
			}

			System.out.println("색상이 \"" + changedBulletColor + "\" 으로 변경되었습니다\n");
		}
	
	}
		
	
	
	/** 총알 삭제용 메서드 
	 *  
	 */
	public void deleteBullet() {
		
		if (Armo.size()<=4) {
			System.out.println("최소 탄창은 4발까지 입니다. 삭제를 취소합니다\n");
			return;
		}
		else {
			
			System.out.println("\n========== 총알 삭제 ==========");
			
			// 등록된 총알 출력
			System.out.println("현재 총알 목록");
			showBulletList();
			
			System.out.print("몇번째 총알을 삭제하시겠습니까? : ");
			int i = sc.nextInt();
			
			if (i > Armo.size() || i < 1) {
				System.out.println("범위 밖의 번호입니다 다시 시도해주세요\n");
				return;}
			else {
				Armo.remove(i - 1);
				armoSize--;
				System.out.println(i + "번째 총알이 삭제되었습니다\n");
				
			}
			
		}
	}
	
	/** 게임 실행 메서드
	 * 
	 */
	public void gameStart() {

		boolean turn =	true;
		System.out.println("\n==== 러시안 룰렛을 시작합니다 ====\n");
		
		colorCount();
		
		while(playerHP>0 && dealerHP>0) {
			if(turn) {playerTurn(); turn =false;}	
			else {dealerTurn(); turn=true;}
			
			if(playerHP<1 || dealerHP<1)break;
			
			if(Armo.size() < 1) {
				reload(0);
				System.out.println("재장전합니다");
				colorCount();
			}
		}
		
		System.out.println("\n게임이 끝났습니다");
		System.out.println("현재 남은 목숨 -> 플레이어 : " + playerHP + " 딜러 : "+ dealerHP);
		if(playerHP > 0) System.out.println("\n플레이어 승! 축하드립니다");
		if(dealerHP > 0) System.out.println(" \n패배 ... ");
		
	
	}
	
	/** 게임 룰 설명을 위한 메서드
	 * 
	 */
	public String manual() {
	
		return "======게임 설명=======\n"+
				"\n1. 플레이어와 딜러는 처음 시작시 3개의 목숨을 가지고 시작합니다\n"+
				"2. 총알은 시작전 셋팅된 값을 바탕으로 장전되며, 빨간색은 실탄, 파랑색은 공포탄입니다\n"+
				"3. 격발은 상대 혹은 자신 중에 선택해 겨누고 쏩니다\n"+
				"4. 총알을 다 쓰면 동일한 사이즈의 탄창으로 랜덤하게 다시 장전됩니다\n"+
				"5. 재장전 시에는 턴을 넘깁니다\n"+
				"6. 딜러나 플레이어 둘중 한명이 목숨을 다할때까지 게임은 진행됩니다\n"+
				"** 시작전 총알을 확인하는 것은 게임의 재미를 반감시킬 수 있습니다!\n**"
		
				; 
	}
	
	public void playerTurn() {

		boolean x = true;
		
		
		while (x) {

			System.out.println("=== 플레이어 차례입니다 ===");
			System.out.println("1. 자신에게 격발");
			System.out.println("2. 상대에게 격발");
			System.out.print("행동을 선택해 주세요 :");

			int act = sc.nextInt();
			System.out.println();

			switch (act) {

			case 1:
				if(playerfire()) {x=false; System.out.println("실탄이였습니다! 차례를 넘깁니다\n");break;}
				else {System.out.println("공포탄이였습니다! 추가 턴을 시작합니다\n");break;}
			case 2:
				if(dealerfire()) { System.out.println("실탄이였습니다! 추가 턴을 시작합니다\n");break;}
				else {x=false;System.out.println("공포탄이였습니다! 차례를 넘깁니다\n");break;}
			default:
				System.out.println("잘못 입력하셨습니다. 다시 시도합니다\n");
				break;
			}
			if(Armo.size()<1 || playerHP<1 || dealerHP<1)return;
		}
		
		
	}
	
	
	
	public void dealerTurn() {

		boolean x = true;

		System.out.println("=== 딜러 차례입니다 ===\n");
		System.out.println("격발합니다 ");

		while (x) {
			
			switch (ran.nextInt(2) + 1) {

			case 1:
				System.out.println("딜러는 자신에게 격발!");
				if (dealerfire()) {
					x = false;
					System.out.println("실탄이였습니다! 차례를 넘깁니다\n");
					break;
				} else {
					System.out.println("공포탄이였습니다! 추가 턴을 시작합니다\n");
					break;
				}
			case 2:
				System.out.println("딜러는 플레이어에게 격발!");

				if (playerfire()) {
					System.out.println("실탄이였습니다! 추가 턴을 시작합니다\n");
					break;
				} else {
					x = false;
					System.out.println("공포탄이였습니다! 차례를 넘깁니다\\n");
					break;
				}
			default:
				System.out.println("잘못 입력하셨습니다. 다시 시도합니다\n");
				break;
			}
			
			if(Armo.size()<1 || playerHP<1 || dealerHP<1)return;
		}
		System.out.println("현재 남은 목숨 -> 플레이어 : " + playerHP + " 딜러 : "+ dealerHP);
		System.out.println("현재 남은 탄창 " + Armo);

	}
	
	/* 현재 남은 탄창의 총알의 색깔이 얼마나 확인 메서드
	 * 
	 */
	public void colorCount() {
		int red = 0;
		int blue = 0;
		
		for(String list : Armo) {
			if(list.equals("빨강"))red++;
			else blue ++;
		}
		
		System.out.println("========현재 탄창=========");
		System.out.println("빨강 : " + red + " , 파랑 : " + blue);
		System.out.println();
	}

	/*플레이어 격발 메서드
	 * 
	 */
	public boolean playerfire() {
	boolean x = true;
		
		if(Armo.get(0).equals("빨강")) {
			Armo.remove(0);
			this.playerHP--;
		}
		else {
			Armo.remove(0);
			x =false;
		}
		
		return x;
	}
	
	/* 딜러 격발 메서드
	 * 
	 */
	public boolean dealerfire() {
		boolean x = true;
			
			if(Armo.get(0).equals("빨강")) {
				Armo.remove(0);
				this.dealerHP--;
			}
			else {
				Armo.remove(0);
				x =false;
			}
			
			return x;
		}
	
	/* 장전 메서드
	 * 
	 */
	public void reload(int size) {
		int red;
		int blue;
		if (size == 0) {
			red = ran.nextInt(3) + 2;
			blue = 6 - red;
		} else {
			if (size % 2 == 0) {
				red = ran.nextInt(size / 2) + 2;
				blue = size / 2 - red;
			} else {
				red = ran.nextInt(size / 2) + 2;
				blue = size / 2 - red + 1;
			}
		}
		int redSize = red;
		int blueSize = blue;

		while (Armo.size() < red+blue) {
			if (redSize > 0 && blueSize > 0) {
				if (ran.nextBoolean()) {
					Armo.add("빨강");
					redSize--;
				} else {
					Armo.add("파랑");
					blueSize--;
				}

			} else {
				int armoNow = Armo.size();
				if (redSize > 0)
					for (int i = armoNow; i < 6; i++)
						Armo.add("빨강");
				if (blueSize > 0)
					for (int i = armoNow; i < 6; i++)
						Armo.add("파랑");

			}

		}

	}
		
	
}

