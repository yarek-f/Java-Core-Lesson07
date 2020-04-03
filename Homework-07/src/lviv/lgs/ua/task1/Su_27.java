package lviv.lgs.ua.task1;

public class Su_27 extends Airplane implements Options {

	private String color;
	private int maxSpeed;
	private AirplaneControl AirplaneControl = new AirplaneControl();

	public Su_27(int length, int width, int weight, String color, int maxSpeed) {
		super(length, width, weight);
		this.color = color;
		this.maxSpeed = maxSpeed;

	}

	@Override
	public void nitro() {
		int a = maxSpeed + 200;
		int acceleration = 10 + (int) (a + Math.random() * 300 );
		System.out.println("nitro = " + acceleration + " km/h");
		
	}

	@Override
	public void stealthTechnology() {
		int time = 10 + (int) (10 + Math.random() * 100 );
		System.out.println("Su-27 is not visible for " + time + " seconds");
	}

	@Override
	public void nuclearImpact() {
		int number = 1 + (int) (1 + Math.random() * 10 );
		System.out.println(number + " nuclear warheads were dropped");
	}

	public void moveUp(Integer kilometer) {
		AirplaneControl.up();
	}

	public void moveDown(Integer kilometer) {
		AirplaneControl.down();
	}

	public void moveRight(Integer kilometer) {
		AirplaneControl.right();
	}

	public void moveLeft(Integer kilometer) {
		AirplaneControl.left();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void setAirplaneControl(AirplaneControl airplaneControl) {
		AirplaneControl = airplaneControl;
	}

}
