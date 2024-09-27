package pack.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import pack.model.dto.Act;
import toyfactory.dto.Toy;

public class GameService {
	
	Act player = new Act();
	Act dealer = new Act();
	
	
	while (true) {
		System.out.println("\n<< 벅샷 룰렛 >>");
		System.out.println("1. 게임 시작");
		System.out.println("2. 아이템 확인");
		System.out.println("3. 아이템 삭제");
		System.out.println("4. 아이템 변경");
		System.out.println("5. 아이템 추가");
		System.out.println("6. 게임 설명 보기");
		System.out.println("0. 종료");
		System.out.print("선택: ");
		int num = sc.nextInt();

		switch (num) {

		case 1: { // 1. 전체 장난감 조회
			int k = 1;
			for (Toy a : toySet)
				System.out.println(k++ + ". " + a.toString());
			break;
		}

		case 2: { // 아이템 조회
			try {
				
				int k = 1;
				for (Toy a : toySet)
					System.out.println(k++ + ". " + a.toString());
				break;
				
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
				//Entry.getKey() : Entry 객체의 key 반환
				//Entry.getValue() : Entry 객체의 Value 반환
				
				while (true) {
					System.out.print("재료를 입력하세요 (종료하려면 'q'를 입력하세요)");
					material = sc.next();
					if (material.equals("q"))
						break;
					else {
						boolean x = true;
						for (Map.Entry<Integer, String> entry : materialMap.entrySet()) {
							if (entry.getKey() == Integer.parseInt(material)) {
								//String 형인 material을 int형으로 전수값으로 변환(Integer Wrapper 클래스 이용)
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
					// 1.효율 향상을 위해 break;
					// 2. 순회중인 컬렉션 객체가 수정되어 충돌한다는 예외 발생 -> 예외 방지 및 효율을 위해 작성
				}
			}
			if (x)
				System.out.println("해당 장난감의 이름이 없습니다.확인후 다시 입력해주세요");
			break;
		}

		case 4: { // 4. 장난감 제조일 순으로 조회하기
			System.out.println("<제지올 순으로 장난감을 정렬>");
			
			List<Toy> toyList = new ArrayList<Toy>(toySet);
			toyList.sort(Comparator.comparing(Toy::getManufactureDate));
			
			int index=1;
			for( Toy toy : toyList) System.out.println(index++ + ". "+ toy);
			
//			toyList.sort((toy1, toy2) -> toy1.getManufactureDate().compareTo(toy2.getManufactureDate()));
//			for (Toy tl : toyList)
//				System.out.println(tl);
			break;
		}

		case 5: { // 5. 연령별 사용 가능한 장난감 리스트 조회하기
//			Set<Integer> uniqueAge = new HashSet<>();
//			for (Toy toy : toySet)
//				uniqueAge.add(toy.getAge());
//
//			// 오름차순 리스트로 변환
//			List<Integer> uniqueAgeSorted = new ArrayList<>(uniqueAge);
//			Collections.sort(uniqueAgeSorted);
//
//			// 연령별 출력
//			for (Integer x : uniqueAgeSorted) {
//				int i = 1;
//				System.out.printf("[연령 : %d세]\n", x);
//				for (Toy toy : toySet) {
//					if (toy.getAge() == x)
//						System.out.println(i++ + ". " + toy.toString());
//				}
//			}
			
			System.out.println("<연령별로 사용 가능한 장난감>");
			
			Map<Integer, List<Toy>> toysByAge = new HashMap<Integer, List<Toy>>();
			// toysByAge라는 이름의 새로운 Map을 생성
			// -> 연령을 key로 지정하고 , 해당 연령을 가진 장난감을 List를 value로 가짐
			// { K:V ,K:V ,K:V ...}
			// -> { 5: ["키시미시","허기워기",8 : ["캣냅","마미롱레그"] , 12 :["파피"]}
			
			for(Toy toy : toySet) {
				int age = toy .getAge(); //현재 toy 객체가 가진 나이 얻어오기
				
				toysByAge.putIfAbsent(age, new ArrayList<Toy>());
				// putIFAbsent() : Map에서 제공하는 메서드로,
				// 해당 키가 존재하지 않는 경우에만 전달받은 값을 추가함
				// -> Map에 해당 연령의 리스트가 없는 경우에만 새로운 리스트를 생성하여 추가
				
				toysByAge.get(age).add(toy);
//				toysByAge.get(age) -> age(k) 에 맞는 value를 반환 -> List
//				List.add(toy) -> 전달된 toy 객체를 List에 추가
				
			}
			
			/*
			 * toysByAge(Map) :
			 * {
			 * 	5 = ["키시미시","허기워기"]
			 * 	8 = ["캣냅","마미롱레그"]
			 * 	12 = : ["파피"]
			 */
			for( Entry<Integer, List<Toy>> entry: toysByAge.entrySet()) {
				int age = entry.getKey(); // 해당 entry의 key(나이)를 얻어옴
				List<Toy> toyList = entry.getValue(); // 해당 entry의 value를 얻어옴
				
				System.out.println("[연령 : "+ age + "세]");
				int index = 1;
				for(Toy toy : toyList)System.out.println(index++ + ". "+ toy); 
				//해당 연령에 대응되는 List를 순회하면서 출력
			}
			
			
			break;
		}

		case 6:  // 6. 재료 추가
			addMaterial();break;
		

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

			for (Map.Entry<Integer, String> entry : materialMap.entrySet()) {
				materialMap.remove(entry.getKey());
				
				System.out.println("재료 : '" + z + "'가 성공적으로 삭제되었습니다");
				x=true;
				break;
			}
//			Iterator<Map.Entry<Integer, String>> iterator = materialMap.entrySet().iterator();
//			while (iterator.hasNext()) {
//				Map.Entry<Integer, String> entry = iterator.next();
//				if (entry.getValue().equals(z)) {
//					iterator.remove(); // Iterator의 remove() 메서드 사용
//					System.out.printf("재료 '%s'가 성공적으로 제거되었습니다.%n", z);
//					x = false; // 상태 변경
//					break;
//				} else
//					x = true;
//			}
			if (x)
				System.out.println("해당 이름의 재료가 존재하지 않습니다");
			break;
		}
		
		case 0 : System.out.println("프로그램을 종료합니다"); return;

		}

	}

}



}
