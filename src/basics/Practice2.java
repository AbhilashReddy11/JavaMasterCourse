package basics;

public class Practice2 {

	public static void main(String[] args) {
		int highScore =50;
		if (highScore>50) {
			highScore =1000 + highScore;
		}
		
		int health = 100;
		if ((health < 25)&&(highScore >1000)){
			highScore = highScore-1000;
		}

		System.out.println(highScore);
	}

}
