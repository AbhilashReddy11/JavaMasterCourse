package basics;

class ChallengeV30 {

	public static void main(String[] args) {
		double a =20.00d;
		double b= 80.00d;
		double c = (a+b)*100.00d;
		boolean d= (c%40.00==0)?true:false;
		System.out.print(d);
		if(!d)
			System.out.println("remainder is not zero");
		

	}

}
