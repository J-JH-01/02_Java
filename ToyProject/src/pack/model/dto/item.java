package pack.model.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.sound.sampled.TargetDataLine;

public class item extends Act {

	List<List<Object>> item = new ArrayList<>();
	
	public void showItem() {
		 for (int index = 0; index < item.size(); index++) {
	            List<Object> i = item.get(index); // 현재 인덱스의 리스트 가져오기
	            System.out.println(index + "." + i); // 인덱스와 리스트 출력
	        }
	}
	
	public void updateItem(String a, int b ,int c ,boolean d, boolean e) {
		
	}
	
	public void addItem(String a, int b ,int c ,boolean d, boolean e) {
		// 아이템명 , 힐횟수 , 대미지량 , 다음 총알보기, 수상한 알약

	}
	
	public void deleteItem(String a) {
		boolean x = true;
		
		System.out.println("-----아이템 삭제------");
		
		//아이템 목록 보여주기
		 for (int index = 0; index < item.size(); index++) {
	            List<Object> i = item.get(index); // 현재 인덱스의 리스트 가져오기
	            System.out.println(index + "." + i); // 인덱스와 리스트 출력
	        }
		 
		for(List i: item) {
			if(i.get(0).equals(a))i.remove(a);
			System.out.println("성공적으로 삭제되었습니다!");
			x =false;
			break;
		}
		
		if(x) {System.out.println("아이템이 존재하지 않습니다");}
	}
	
	public void itemUse(int b ,int c ,boolean d, boolean e) {
		
		getHeal(b);
		getShot(c);
		
	}
	
	public item() {
		item.add(Arrays.asList("맥주", 1, 0,false,false));
		item.add(Arrays.asList("알약", 2, 0,false,false));
		item.add(Arrays.asList("톱", 0 , 2,false,false));
		item.add(Arrays.asList("돋보기", 0 , 0,true,false));
		item.add(Arrays.asList("수상한 알약", 0 , 0,false,true));
	}
	
}
