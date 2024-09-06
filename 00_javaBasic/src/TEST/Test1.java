package TEST;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("2~9 입력 : ");
			
			int input = sc.nextInt();
			
			if(input >=2 && input <=9) {
				for(int i=1 ; i<=9 ; i++) {
					System.out.printf("%d * %d = %d\n",input,i,input*i);
				}
				break;
			}else {
				System.out.println("딴거 입력");
			}
		}
	}

}
