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
		System.out.println();
		System.out.println("짝수 번째 인덱스 합 : " + sum);

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

		for (int i = 0; i < num; i++) {
			arr[i] = i;
			System.out.print(i + " ");
		}

	}

	public void practice4() {

		int arr[] = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.printf("입력 %d : ", i);
			int num = sc.nextInt();
			arr[i] = num;
		}
		System.out.printf("검색할 값 : \n");
		int input = sc.nextInt();
		for (int i = 0; i < 5; i++) {
			if (arr[i] == input)
				System.out.print("인덱스 : " + i);
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
				arr[i] = "*".charAt(0);
		}
		for (int i = 0; i < 14; i++) {
			System.out.printf("%s", arr[i]);
		}

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
			
			String newArr[] = Arrays.copyOf(arr, arr.length+num);

			for (int i = oldNumber; i < newNumber; i++) {
				System.out.printf("%d번째 문자열 : ", i+1);
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
			}
			else {YN =false;}

		}
		System.out.println(Arrays.toString(arr));

	}

}
