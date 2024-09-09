package edu.kh.orr.run;

import edu.kh.orr.model.service.MemberService;

public class MemberRun {

	public static void main(String[] args) {
		MemberService service = new MemberService();
		service.displayMenu();
		
	}

}
