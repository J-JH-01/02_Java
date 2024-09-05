package edu.kh.oop.practice.model.vo;

public class Hero {

	private String nickname;//닉네임
	private String job;//직업
	private int hp;//체력
	private int mp;//마력
	private int level;//레벨
	private double exp;//경험치
	
	public Hero() {}

	public Hero(String nickname, String job, int hp, int mp, int level, double exp) {
//		super();
		this.nickname = nickname;
		this.job = job;
		this.hp = hp;
		this.mp = mp;
		this.level = level;
		this.exp = exp;
	}
	
	public void attack(double exp) {
		
		
	}
	
	
	
	public void dash() {
	
		
	}

	
	
	@Override
	public String toString() {
		return "Hero [nickname=" + nickname + ", job=" + job + ", hp=" + hp + ", mp=" + mp + ", level=" + level
				+ ", exp=" + exp + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
