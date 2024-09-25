package toyfactory.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import toyfactory.dto.Toy;

public class ToyFactory {

	// 입력용 객체
	private Scanner sc = new Scanner(System.in);
	// 중복된 Toy 객체가 없도록 저장할 컬렉션 중 Set
	private Set<Toy> toySet = new HashSet<Toy>(); // 중복된 Toy 객체가 없도록 저장할 컬렉션중 Set
	// 재료가 저장되어잇는 map
	private Map<Integer, String> materialMap = new HashMap<Integer, String>();

	// 메서드
	public ToyFactory() { //기본생성자
		// 기본 등록된 재료

		materialMap.put(1, "면직물");
		materialMap.put(2, "플라스틱");
		materialMap.put(3, "유리");
		materialMap.put(4, "고무");

//		1. 일반배열 사용
//		toySet.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", addMaterials(new int[] {1,4})));
//		2. List.of() 사용
//		toySet.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", addMaterials(List.of(1,4))));
//		3. Arrays.asList() 사용
//		toySet.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", addMaterials(Arrays.asList(1,4))));
//		4. 가변인자 사용
//		toySet.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", addMaterials(1, 4)));
//		함수 매개변수 자리에 Integer... materials 쓰면 됨
		
		// 현재 제작된 장난감
		toySet.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", addMaterials(1,4)));

		// 이런 방법도 가능
		Set<String> materials2 = new HashSet<>(Arrays.asList("면직물", "플라스틱"));
		toySet.add(new Toy("허기워기", 5, 12000, "파란색", "19940312", materials2));

		Set<String> materials3 = new HashSet<>(Arrays.asList("면직물", "플라스틱"));
		toySet.add(new Toy("키시미시", 5, 15000, "분홍색", "19940505", materials3));

		Set<String> materials4 = new HashSet<>(Arrays.asList("면직물", "플라스틱"));
		toySet.add(new Toy("캣냅", 8, 27000, "보라색", "19960128", materials4));

		toySet.add(new Toy("파피", 12, 57000, "빨간색", "19931225", addMaterials(1,2,4)));
	}

	/** 매개변수로 전달받은 값들을 확인하고
	 * 재료저장 Map에 있는지 확인하고
	 * String 형태로 반환하는 메서드
	 * 
	 * 가변인자 작성법 : 자료형 ... 변수명
	 * -> 매개변수의 수가 정확히 몇 개인지 특정할 수 없을 때 사용
	 * @return
	 */
	public Set<String> addMaterials(Integer... materials){
		
		// 매개변수로 전달받은 재료를 저장하여 변환할 Set 객체를 생성
		Set<String> addedMaterials = new HashSet<String>();
		for(Integer key : materials) {
			// Map에서 재료 고유 변호(key)에 대응하는 재료명(value)을 가져와서
			// addedMaterials에 추가
			String materialValue = materialMap.get(key);
			if(materialValue != null)addedMaterials.add(materialValue);	
			// 인덱스 번호를 넘어가는건 null로 출력이 됨, 혹은 인덱스가 아예 없을 수 도있으니
			}
		
		return null;
	}
	
	public void displayMenu() throws Exception {
		while (true) {
			System.out.println("\n<< 플레이타임 공장 >>");
			System.out.println("1. 전체 장난감 조회");
			System.out.println("2. 새로운 장난감 만들기");
			System.out.println("3. 장난감 삭제하기");
			System.out.println("4. 장난감 제조일 순으로 조회하기");
			System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
			System.out.println("6. 재료 추가");
			System.out.println("7. 재료 제거");
			System.out.println("0. 프로그램 종료");
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
				
//				toyList.sort((toy1, toy2) -> toy1.getManufactureDate().compareTo(toy2.getManufactureDate()));
//				for (Toy tl : toyList)
//					System.out.println(tl);
				break;
			}

			case 5: { // 5. 연령별 사용 가능한 장난감 리스트 조회하기
//				Set<Integer> uniqueAge = new HashSet<>();
//				for (Toy toy : toySet)
//					uniqueAge.add(toy.getAge());
//
//				// 오름차순 리스트로 변환
//				List<Integer> uniqueAgeSorted = new ArrayList<>(uniqueAge);
//				Collections.sort(uniqueAgeSorted);
//
//				// 연령별 출력
//				for (Integer x : uniqueAgeSorted) {
//					int i = 1;
//					System.out.printf("[연령 : %d세]\n", x);
//					for (Toy toy : toySet) {
//						if (toy.getAge() == x)
//							System.out.println(i++ + ". " + toy.toString());
//					}
//				}
				
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
//					toysByAge.get(age) -> age(k) 에 맞는 value를 반환 -> List
//					List.add(toy) -> 전달된 toy 객체를 List에 추가
					
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
//				Iterator<Map.Entry<Integer, String>> iterator = materialMap.entrySet().iterator();
//				while (iterator.hasNext()) {
//					Map.Entry<Integer, String> entry = iterator.next();
//					if (entry.getValue().equals(z)) {
//						iterator.remove(); // Iterator의 remove() 메서드 사용
//						System.out.printf("재료 '%s'가 성공적으로 제거되었습니다.%n", z);
//						x = false; // 상태 변경
//						break;
//					} else
//						x = true;
//				}
				if (x)
					System.out.println("해당 이름의 재료가 존재하지 않습니다");
				break;
			}
			
			case 0 : System.out.println("프로그램을 종료합니다"); return;

			}

		}

	}
	
	public void addMaterial() throws Exception{
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
				String z = sc.next();

				if (z.equalsIgnoreCase("Y")) {
					//equalsIgnoreCase : 대문자인지 소문자인지 구분하지 않고 문자열 값 자체만을 비교
					materialMap.put(x, y); // 같은 키 추가 시 value 덮어쓰기함
					System.out.println("재료가 성공적으로 덮어쓰기 되었습니다");
				} else if (z.equalsIgnoreCase("N")) {
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
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
