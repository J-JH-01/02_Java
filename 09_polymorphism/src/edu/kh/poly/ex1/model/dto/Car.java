package edu.kh.poly.ex1.model.dto;

public class Car /*extends Object*/{ 

	//속성
	private String engine;//엔진
	private String fuel;//연료
	private int wheel;//바퀴개수
	
	//기능(생성자 + 메서드)
	
	public Car() 	{}

	public String getEngine() {
		return engine;
	}

	public Car(String engine, String fuel, int wheel) {
		super();
		this.engine = engine;
		this.fuel = fuel;
		this.wheel = wheel;
	}
	

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	
	//Object.toString()을 오버라이딩
	@Override // 오버라이딩했다는걸 컴파일러에게 알려주는 OVerride 어노테이션
	public String toString() {
		return engine + " / " + fuel + " / " + wheel;
	}
	// 코드 단에서 에러나서 빨간줄 나오는거 : 컴파일에러
	// 실행하고 보니까 에러가 뜨는거 : 런타임에러
	
	
	
}
