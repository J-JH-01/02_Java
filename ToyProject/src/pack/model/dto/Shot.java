package pack.model.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Shot{

	Random random = new Random();
	
	private int red = random.nextInt(3)+2; //
	private int blue = 6-red;

	List<String> cylinder = new ArrayList<String>();

	public void reload() {
		int a=red;
		int b=blue;
		
		while (a > 0 && b > 0) {
			if(random.nextBoolean()) {cylinder.add("빨강");a--;}
			else {cylinder.add("파랑");b--;}
		}
		
		if (cylinder.size() < 6) {
			int k= cylinder.size();
			if (a == 0) 
				for (int i = 0; i < 6 - k; i++)
					cylinder.add("파랑");
			else if (b == 0) 
				for (int i = 0; i < 6 - k; i++)
					cylinder.add("빨강");

		}
		
		
		System.out.println(cylinder);
	}
	
	public void showHowManyRemain() {
		System.out.println(cylinder);
	}

	public void showNextBullet() {
		System.out.println("다음 총알은 " + cylinder.get(0) + " 입니다");
	}
	

	
	public Random getRandom() {
		return random;
	}

	public void setRandom(Random random) {
		this.random = random;
	}

	public int getRed() {
		return red;
	}

	public void setRed(int red) {
		this.red = red;
	}

	public int getBlue() {
		return blue;
	}

	public void setBlue(int blue) {
		this.blue = blue;
	}

	public List<String> getCylinder() {
		return cylinder;
	}

	public void setCylinder(List<String> cylinder) {
		this.cylinder = cylinder;
	}
 
	public Shot() {
		// TODO Auto-generated constructor stub
	}
	
	public Shot(Random random, int red, int blue, List<String> cylinder) {
		super();
		this.random = random;
		this.red = red;
		this.blue = blue;
		this.cylinder = cylinder;
	}
	
	
	
	
}
