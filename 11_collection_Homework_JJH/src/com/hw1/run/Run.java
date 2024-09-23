package com.hw1.run;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.hw1.model.dto.Friend;

public class Run {

	public static void main(String[] args) {
		List<Friend> list = new ArrayList<Friend>();
		Friend 짱구 = new Friend("짱구");
		Friend 철수 = new Friend("철수");
		Friend 유리 = new Friend("유리");
		Friend 훈이 = new Friend("훈이");
		Friend 맹구 = new Friend("맹구");
		
		list.add(짱구);
		list.add(철수);
		list.add(유리);
		list.add(훈이);
		list.add(맹구);
		
		Random ran = new Random();
		System.out.println(list.get(ran.nextInt(5)).getName()+"가 떡잎방범대 대장이다!");;
		
	}

}
