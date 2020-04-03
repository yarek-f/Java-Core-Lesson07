package lviv.lgs.ua.task1;

public class Aplication {
	public static void main(String[] args) {
		
		//int time_to_start = 20 + (int) ( Math.random() * 89);
	//	System.out.println("The airplane starts in " + time_to_start + " seconds");
		
		/*double distance = (double) (Math.random() * 1000);
		System.out.println("The plane will fly " + distance + " kilometers");*/
		
		
		
		
		Su_27 s = new Su_27(12, 8, 2, "white", 2000);
		s.startingEngines();
		s.airplaneTakeOff();
		s.moveUp(7);
		s.moveLeft(4);
		s.moveDown(2);
		s.moveRight(10);
		s.stealthTechnology();
		s.nuclearImpact();
		s.nitro();
		s.airplaneLanding();
		
		
		
	}
}
