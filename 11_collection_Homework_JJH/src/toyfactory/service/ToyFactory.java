package toyfactory.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import toyfactory.dto.Toy;

public class ToyFactory {

	private Scanner sc = new Scanner(System.in);
	private Set<Toy> toySet = new HashSet<Toy>(); // 중복된 Toy 객체가 없도록 저장할 컬렉션중 Set
	private Map<Integer, String> materialMap = new HashMap<Integer, String>();

	public ToyFactory() {
		materialMap.put(1, "면직물");
		materialMap.put(2, "플라스틱");
		materialMap.put(3, "유리");
		materialMap.put(4, "고무");

		Set<String> materials1 = new HashSet<>(Arrays.asList("면직물", "고무"));
		toySet.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", materials1));

		Set<String> materials2 = new HashSet<>(Arrays.asList("면직물", "플라스틱"));
		toySet.add(new Toy("허기워기", 5, 12000, "파란색", "19940312", materials2));

		Set<String> materials3 = new HashSet<>(Arrays.asList("면직물", "플라스틱"));
		toySet.add(new Toy("키시미시", 5, 15000, "분홍색", "19940505", materials3));

		Set<String> materials4 = new HashSet<>(Arrays.asList("면직물", "플라스틱"));
		toySet.add(new Toy("캣냅", 8, 27000, "보라색", "19960128", materials4));

		Set<String> materials5 = new HashSet<>(Arrays.asList("면직물", "플라스틱", "고무"));
		toySet.add(new Toy("파피", 12, 57000, "빨간색", "19931225", materials5));
	}

	public void displayMenu() {
		while (true) {
			System.out.println("\n<< 플레이타임 공장 >>");
			System.out.println("1. 전체 장난감 조회");
			System.out.println("2. 새로운 장난감 만들기");
			System.out.println("3. 장난감 삭제하기");
			System.out.println("4. 장난감 제조일 순으로 조회하기");
			System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
			System.out.println("6. 재료 추가");
			System.out.println("7. 재료 제거");
			System.out.print("선택: ");
			int num = sc.nextInt();

			switch (num) {

			case 1: { // 1. 전체 장난감 조회
				int k = 1;
				for (Toy a : toySet)
					System.out.println(k++ + ". " + a.toString());
				break;
			}

			case 2: { // 2. 새로운 장난감 만들기
				try {
					System.out.println("<새로운 장난감 추가>");

					System.out.print("장난감 이름 : ");
					String name1 = sc.next();

					boolean alread = false;
					for (Toy toySet : toySet) {
						if (toySet.getName().equals(name1)) {
							System.out.println("이미 있는 장난감입니다. 다시 입력해주세요");
							alread = true;
							break;
						}
					}
					if (alread)
						break;

					System.out.print("사용 가능 연령 : ");
					int age1 = sc.nextInt();

					System.out.print("가격 : ");
					int price1 = sc.nextInt();

					System.out.print("색상 : ");
					String color1 = sc.next();

					System.out.print("제조일 (YYYYMMDD 형식으로 입력) : ");
					String manuDate1 = sc.next();

					String material;
					Set<String> mateDate = new HashSet<String>();
					System.out.println("사용 가능한 재료 목록:");
					for (Map.Entry<Integer, String> entry : materialMap.entrySet()) {
						System.out.println(entry.getKey() + " : " + entry.getValue());
					}
					while (true) {
						System.out.print("재료를 입력하세요 (종료하려면 'q'를 입력하세요)");
						material = sc.next();
						if (material.equals("q"))
							break;
						else {
							boolean x = true;
							for (Map.Entry<Integer, String> entry : materialMap.entrySet()) {
								if (entry.getKey() == Integer.parseInt(material)) {
									if (mateDate.contains(entry.getValue())) {
										System.out.println("이미 추가된 재료입니다. 다른 재료를 선택하세요");
										x = false;
										break;
									} else {
										System.out.println("재료가 추가되었습니다 : " + entry.getValue());
										mateDate.add(entry.getValue());
										x = false;
										break;
									}
								}

							}
							if (x)
								System.out.println("잘못된 번호입니다. 다시 입력해주세요");
						}

					}
					toySet.add(new Toy(name1, age1, price1, color1, manuDate1, mateDate));
					break;
				} catch (InputMismatchException e) {
					System.out.println("잘못된 형식입니다");
					break;
				} catch (NumberFormatException e) {
					System.out.println("숫자를 넣어주세요");
					break;
				}

			}

			case 3: { // 3. 장난감 삭제하기
				System.out.print("삭제할 장난감의 이름을 입력하세요:");
				String remov = sc.next();
				boolean x = true;

				for (Toy ts : toySet) {
					if (ts.getName().equals(remov)) {
						toySet.remove(ts);
						x = false;
						System.out.println("장난감이 삭제되었습니다.");
						break;
					}
				}
				if (x)
					System.out.println("해당 장난감의 이름이 없습니다.확인후 다시 입력해주세요");
				break;
			}

			case 4: { // 4. 장난감 제조일 순으로 조회하기
				List<Toy> toyList = new ArrayList<>(toySet);
				toyList.sort((toy1, toy2) -> toy1.getManufactureDate().compareTo(toy2.getManufactureDate()));
				for (Toy tl : toyList)
					System.out.println(tl);
				break;
			}

			case 5: { // 5. 연령별 사용 가능한 장난감 리스트 조회하기
				Set<Integer> uniqueAge = new HashSet<>();
				for (Toy toy : toySet)
					uniqueAge.add(toy.getAge());

				// 오름차순 리스트로 변환
				List<Integer> uniqueAgeSorted = new ArrayList<>(uniqueAge);
				Collections.sort(uniqueAgeSorted);

				// 연령별 출력
				for (Integer x : uniqueAgeSorted) {
					int i = 1;
					System.out.printf("[연령 : %d세]\n", x);
					for (Toy toy : toySet) {
						if (toy.getAge() == x)
							System.out.println(i++ + ". " + toy.toString());
					}
				}
				break;
			}

			case 6: { // 6. 재료 추가
				try {
					System.out.println("<재료 추가>");
					System.out.println("---현재 등록된 재료---");
					for (Map.Entry<Integer, String> entry : materialMap.entrySet()) {
						System.out.println(entry.getKey() + " : " + entry.getValue());
					}
					System.out.println("---------------------------");

					System.out.print("재료 고유번호(key) 입력 : ");
					int x = sc.nextInt();
					System.out.println("재료명 입력 : ");
					String y = sc.next();

					if (materialMap.containsKey(x)) {

						System.out.println("이미 해당 키에 재료가 등록되어 있습니다.");
						System.out.print("덮어쓰시겠습니까?(Y/N) : ");
						char z = sc.next().toLowerCase().charAt(0);

						if (z == 'y') {
							materialMap.put(x, y);
							System.out.println("재료가 성공적으로 덮어쓰기 되었습니다");
						} else if (z == 'n') {
							System.out.println("취소되었습니다");
						}
					} else {
						materialMap.put(x, y);
						System.out.println("새로운 재료가 성공적으로 등록되었습니다");
					}
				} catch (InputMismatchException e) {
					System.out.println("잘못된 형식입니다");
				} catch (NumberFormatException e) {
					System.out.println("숫자를 넣어주세요");
				}
				break;
			}

			case 7: { // 7. 재료 제거
				System.out.println("<재료 제거>");
				System.out.println("---현재 등록된 재료---");
				for (Map.Entry<Integer, String> entry : materialMap.entrySet()) {
					System.out.println(entry.getKey() + " : " + entry.getValue());
				}
				System.out.println("---------------------------");

				System.out.print("삭제할 재료명 입력 : ");
				String z = sc.next();

				// 돌면서 재료가 있나 없나 판단
				boolean x = false;

				Iterator<Map.Entry<Integer, String>> iterator = materialMap.entrySet().iterator();
				while (iterator.hasNext()) {
					Map.Entry<Integer, String> entry = iterator.next();
					if (entry.getValue().equals(z)) {
						iterator.remove(); // Iterator의 remove() 메서드 사용
						System.out.printf("재료 '%s'가 성공적으로 제거되었습니다.%n", z);
						x = false; // 상태 변경
						break;
					} else
						x = true;
				}
				if (x)
					System.out.println("해당 이름의 재료가 존재하지 않습니다");
				break;
			}

			}

		}

	}

}
