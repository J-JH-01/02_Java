package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	Scanner sc = new Scanner(System.in);
	private String[] newArr;

	public void practice1() {
		int[] arr = new int[9];
		int sum = 0;

		for (int i = 1; i < 10; i++) {
			arr[i] = i;
			if (i % 2 == 0)
				sum += i;
			System.out.print(i + " ");
		}
		System.out.println("\n짝수 번째 인덱스 합 : " + sum);

	}

	public void practice2() {
		int[] arr = new int[9];
		int sum = 0;

		for (int i = 9; i > 0; i--) {
			arr[i] = i;
			if (i % 2 != 0)
				sum += i;
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("홀수 번째 인덱스 합 : " + sum);
	}

	public void practice3() {
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		// int arr[] = new int [sc.nextInt()]; , for문가서는 arr.length 쓰면 방법도있음

		for (int i = 0; i < num; i++) {
			arr[i] = i + 1;

			System.out.print(i + " ");
		}

	}

	public void practice4() {

		int arr[] = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.printf("입력 %d : ", i);
//			int num = sc.nextInt();
//			arr[i] = num;
			arr[i] = sc.nextInt();
		}
		System.out.printf("검색할 값 : \n");
		int input = sc.nextInt();
		boolean flag = false;
		for (int i = 0; i < 5; i++) {
			if (arr[i] == input)
				flag = true;
			System.out.print("인덱스 : " + i);
			break;
		}
		if (!flag) {
			System.out.println("일치하는 값이 존재하지 않는다");
		}
	}

	public void practice5() {
		System.out.print("문자열 : ");
		String sen = sc.nextLine();
		System.out.print("문자 : ");
		char word = sc.next().charAt(0);

		char arr[] = new char[sen.length()];
		int count = 0;

		for (int i = 0; i < sen.length(); i++) {
			arr[i] = sen.charAt(i);
		}
		System.out.printf("%s에 %s가 존재하는 위치(인덱스) :", sen, word);
		for (int i = 0; i < sen.length(); i++) {
			if (arr[i] == word) {
				System.out.print(" " + i);
				count++;
			}
		}
		System.out.printf("\n%s 개수 : %d", word, count);
	}

	public void practice6() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int sum = 0;

		int arr[] = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			int input = sc.nextInt();
			arr[i] = input;
			sum += input;
		}
		for (int i = 0; i < num; i++)
			System.out.print(arr[i] + " ");
		System.out.printf("\n총 합 : %d", sum);
	}

	public void practice7() {
		System.out.print("주민등록번호(-포함) : ");
		String lc = sc.nextLine();

		char arr[] = new char[14];

		for (int i = 0; i < 14; i++) {
			if (i < 8)
				arr[i] = lc.charAt(i);
			else
				arr[i] = '*';
		}
		for (int i = 0; i < 14; i++) {
			System.out.print(arr[i]);
		}
		// s

	}

	public void practice8() {

		while (true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			if (num % 2 == 0 || num < 3) {
				System.out.println("다시 입력하세요.");
				continue;
			} else {
				int arr[] = new int[num * 2 - 1];
				for (int i = 0; i < num; i++) {
					arr[i] = i + 1;
				}
				for (int i = num; i < num * 2 - 1; i++) {
					arr[i] = arr[2 * num - 2 - i];
				}
				System.out.println(Arrays.toString(arr));
				break;
			}

		}
	}

	public void practice9() {
		int arr[] = new int[10];

		for (int i = 0; i < 10; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
		}
		System.out.print("발생한 난수 : ");
		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice10() {
		int arr[] = new int[10];
		int max = 0;
		int min = 10;

		for (int i = 0; i < 10; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			if (arr[i] > max)
				max = arr[i];
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.print("발생한 난수 : ");
		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.printf("\n최대값 : %d", max);
		System.out.printf("\n최소값 : %d", min);

	}

	public void practice11() {
		int arr[] = new int[10];

		for (int i = 0; i < 10; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			for (int k = 0; k < i; k++) {
				if (arr[i] == arr[k])
					i--;
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public void practice12() {
		int arr[] = new int[6];

		for (int i = 0; i < 6; i++) {
			arr[i] = (int) (Math.random() * 45 + 1);
			for (int k = 0; k < i; k++) {
				if (arr[i] == arr[k])
					i--;
				break;
			}
		}
		Arrays.sort(arr);
		for (int i = 0; i < 6; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public void practice13() {
		System.out.print("문자열 : ");
		String sen = sc.nextLine();

		char arr[] = new char[sen.length()];
		int count = 1;
		int count2 = 0;

		arr[0] = sen.charAt(0);

		for (int i = 1; i < sen.length(); i++) {
			boolean a = false;
			for (int k = 0; k < i; k++) {
				if (arr[k] == sen.charAt(i)) {
					a = true;
					count2++;
					break;
				}
			}
			if (!a) {
				arr[count] = sen.charAt(i);
				count++;
			}
		}

		char arr2[] = new char[sen.length() - count2];

		for (int i = 0; i < sen.length() - count2; i++) {
			arr2[i] = arr[i];
		}

		System.out.print("문자열에 있는 문자 : ");
		for (int i = 0; i < sen.length() - count2; i++) {
			if (i == sen.length() - count2 - 1) {
				System.out.print(arr2[i]);
				break;
			}
			System.out.print(arr2[i] + ",");
		}
		System.out.printf("\n문자 개수 : %d", sen.length() - count2);

	}

	public void practice13_1() {
		// 1. 사용자에게 문자열 입력받기

		System.out.print("문자열 : ");
		String str = sc.nextLine();

		// 2. 해당 문자열의 문자들을 char[]에 담기
		char[] arr = new char[str.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}

		// 3.char 배열에서 중복값 존재할 경우 출력 x
		int count = 0;
		// 문자개수 카운트
		System.out.print("문자열에 있는 문자 : ");

		for (int i = 0; i < arr.length; i++) {
			boolean flag = true; // 중복 체크용 플래그
			for (int j = 0; j < i; j++) {
				if(arr[i]==arr[j]) {
				flag = false; // 중복이 발생됨
				break;}
			}
			// for문

			if (flag) {// 중복이 발생하지 않았다는 것
				// if문
				if (i == 0) {
					System.out.print(arr[i]);
				} else {
					System.out.print(", " + arr[i]);
					
				}
				// 중복 아닐때만 count 개수 늘리기
				count++;
			}
		}
		System.out.println();
		System.out.println("문자 개수 : "+count);
		
		
	}

	public void practice14() {

		System.out.print("배열의 크기를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		boolean YN = true;
		boolean try1 = true;

		String arr[] = new String[num];

		for (int i = 0; i < num; i++) {
			System.out.printf("%d번째 문자열 : ", i + 1);
			String sen = sc.nextLine();
			arr[i] = sen;
		}
		int newInput;
		int oldNumber;
		int newNumber;

		System.out.print("더 값을 입력하시겠습니까? : ");
		char x = sc.next().charAt(0);
		sc.nextLine();
		if (x == 'y' || x == 'Y') {
			YN = true;
		}
		if (x == 'n' || x == 'N') {
			YN = false;
		}

		while (YN) {

			System.out.print("더 입력하고 싶은 개수 : ");
			num = sc.nextInt();
			sc.nextLine();
			oldNumber = arr.length;
			newNumber = num + oldNumber;

			String newArr[] = Arrays.copyOf(arr, arr.length + num);

			for (int i = oldNumber; i < newNumber; i++) {
				System.out.printf("%d번째 문자열 : ", i + 1);
				String sen = sc.nextLine();
				newArr[i] = sen;
			}
			arr = newArr;
			System.out.print("더 값을 입력하시겠습니까? : ");
			x = sc.next().charAt(0);
			if (x == 'y' || x == 'Y') {
				YN = true;
			}
			if (x == 'n' || x == 'N') {
				YN = false;
			} else {
				YN = false;
			}

		}
		System.out.println(Arrays.toString(arr));

	}

	
	public void practice14_1() {
		// 1. 첫 배열 크기 지정
		System.out.println("배열의 크기를 입력하시오 : ");
		int size = sc.nextInt();
		sc.nextLine(); // 입력버퍼에 남은 개행문자 제거
		
		String[] arr = new String[size];
		
		
		//2. 첫 배열에 저장할 문자열 입력받기
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println((i+1) + "번째 문자열 : ");
			arr[i] = sc.nextLine();
		}
		
		
		// 3. 반복이 시작되는 구간부터 무한 반복 시작(while 작성하여 내부에 종료조건 만들어서 break)
		while(true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char ch = sc.nextLine().charAt(0);
			
		// 4. 값을 더 입력할 경우 
			if(ch =='y' || ch =='Y') {
				
			// 5. 더 입력받을 개수 입력 받기
				System.out.print("더 입력하고 싶은 개수 : ");
				int addSize = sc.nextInt();
				sc.nextLine(); //  입력버퍼에 남은 개행문자 제거
				
				// 6. 새로 값을 입력받을 배열 생성 --> 기존 배열 크기 + 추가 입력 개수
				String[] newArr = new String [arr.length+addSize];
				
				// 7. 배열 복사 + 새로운 문자열 입력받기
				for(int i=0; i < newArr.length ; i++) {
					if(i < arr.length) { // 인덱스의 크기가 기존 배열보다 작을 경우
						newArr[i] = arr[i]; //기존 배열 요소 값 복사
					}
					else {
						System.out.print((i+1)+"번째 문자열 : ");
						newArr[i] = sc.nextLine();
					}
				}
				
				// 8.기존 배열 공간을 참조하던 변수 arr에 새로운 배열 공간의 주소 newArr 대입
				arr = newArr;
				
				
				
			}else if (ch == 'n' || ch == 'N') { // 값을 더 입력하지 않은 경우
				break;  // while 반복문 종료
			}else { //잘못 입력한 경우
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
				continue;
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
