package edu.kh.oop.practice.model.vo;

public class Hero {

	//속성
	//필드 == 멤버변수
	private String nickname;//닉네임
	private String job;//직업
	private int hp;//체력
	private int mp;//마력
	private int level;//레벨
	private double exp;//경험치
	
	// 기본생성자
	public Hero() {}

	// 매개변수 생성자
	public Hero(String nickname, String job, int hp, int mp, int level, double exp) {
//		super();
		this.nickname = nickname;
		this.job = job;
		this.hp = hp;
		this.mp = mp;
		this.level = level;
		this.exp = exp;
		
		System.out.println("===========캐릭터 생성===========");
		System.out.println("현재 레벨 : "+ this.level);
		System.out.println("현재 hp : "+this.hp);
		System.out.println("현재 mp : "+this.mp);
		System.out.printf("현재 경험치 : %.1f\n",this.exp);
	}
	

	public void attack(double exp) {
		this.exp += exp;
		System.out.printf("'%s'은/는 공격을 했다!!! 현재 경험치 : %.1f\n",this.nickname,this.exp);
		if(this.exp >=300 * this.level) {
			this.level++;
			System.out.println("레벨이 올랐습니다! 현재 레벨 : "+this.level);
		}
		
	}
	
	
	
	public void dash() {
		if(mp<=0) {System.out.println("[마나가 모자랍니다]");}
		else{
			mp -= 10;
			System.out.println(this.nickname+"의 엄청 빠른 대시!!! 남은마력 : "+this.mp);
			}
			
	}

	
	
	@Override
	public String toString() {

		return "======='%s' 님의 정보=======\n"
				+"- 현재 레벨 : %d\n"
				+"- 현재 hp : %d\n" 
				+"- 현재 mp : %d\n"
				+"- 현재 exp : %.1f\n";
		}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
