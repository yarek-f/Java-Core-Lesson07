package lviv.lgs.ua.task1;

public class AirplaneControl {
	
	public void up() {
		int distance1 = 10 + (int) ( Math.random() * 60 );
		System.out.println("Airplane is moving UP on : " + distance1 + " kilometer");
	}

	public void down() {
		int distance1 = 10 + (int) ( Math.random() * 60 );
		System.out.println("Airplane is moving DOWN on : " + distance1 + " kilometer");
	}

	public void right() {
		int distance1 = 10 + (int) ( Math.random() * 60 );
		System.out.println("Airplane is moving RIGHT on : " + distance1 + " kilometer");
	}

	public void left() {
		int distance1 = 10 + (int) ( Math.random() * 60 );
		System.out.println("Airplane is moving LEFT on : " + distance1 + " kilometer");
	}

}
