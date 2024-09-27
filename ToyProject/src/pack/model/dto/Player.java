package pack.model.dto;

public class Player {
	private int HP;


	public void heal(int a) {
		HP+=a;		
	}

	public void damage(int a) {
		HP-=a;
	}
	
	public Player() {
	}
	

	public Player(int hP) {
		super();
		HP = hP;
	}



	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	
}
