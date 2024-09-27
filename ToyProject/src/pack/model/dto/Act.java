package pack.model.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Act{
	
	Player gf = new Player(4);
	
	Random random = new Random();
	
	public void getHeal (int a) {
		gf.heal(a);
	}
	
	public void getShot(int a) {
		for (int i = 1; i <= a; i++) {
			gf.damage(a);
		}
	}
	
   public void randomlyheal() {
	   if(random.nextBoolean())gf.heal(1);
	   else gf.damage(1);
   }
   
	
}
