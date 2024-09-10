package edu.kh.inheritance.model.dto;

/**
 * 
 * Object* 
 *    ㄴPerson*    
 *          ㄴ Student
 */


public class Student extends Person{
	//Student 클래스에 Pserson 클래스 내용을 인정한다
	// == Student 클래스에 Person 클래스와 필드,메서드를 추가하여 확장한다
	
	
/*	//속성(필드)
	private String name;
	private int age;
	private String nationality;
*/
//상속 받아서 굳이 안만들어도 댐
	
	private int grade; //학년
	private int classRoom; // 반

//생성자
	public Student() {
	}
//매개변수 생성자
	
	public Student(String name,int age, String nationality, int grade, int classRoom) {
		
		
		//this 사용은 왜 안될까?
		// -> this 참조변수는 본인을 의미
		// -> 상속을 받았어도 name age nationality는 부모 고유 필드이기 떄문에
		// 자식인 student에서 this 참조변수를 이용해 직접 접근 불가(this의 주소값이 부모를 안가르키기 때문)
		
		super(name,age,nationality); 
		// super(); : 부모의 기본 생성자
		// super(매개변수...) : 부모의 매개변수 생성자
		// 부모 매개변수 생성자의 매개변수 순서랑 똑같이 맞춰줘야함
		
		//person(부모) 상속받은 메서드 setter
//		setName(name);
//		setAge(age);
//		setNationality(nationality);
		// 이렇게 부모의 setter 쓸 수 있긴 하지만 비효율적
		
		this.grade = grade;
		this.classRoom = classRoom;
	}
	
	
	//세터
	/*public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
*/
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	};
	
	//기능(메서드)
	
	@Override
	public String toString() {
		return super.toString()+ " / "+grade+" / "+classRoom;
	}
	
	
	
	
}
