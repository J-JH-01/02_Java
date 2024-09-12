package edu.kh.exception;

import edu.kh.exception.model.service.ExceptionService;
import edu.kh.exception.model.service.UserException;

public class ExceptionRun {

	public static void main(String[] args) {

		new ExceptionService().ex4();
		
		
		try {
			new ExceptionService().ex5();
		} catch (UserException e) {
			System.out.println(e.getMessage());
		}
		

	}
//
//	try {  
//		//예외가 발생할것같은 코드
//	}
//	catch{  
//		
//	}
//	
}
