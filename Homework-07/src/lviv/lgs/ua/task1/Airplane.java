package lviv.lgs.ua.task1;

public abstract class Airplane {
	
	private int length;
	private int width;
	private int weight;
	
	public Airplane(int length, int width, int weight) {
		this.length = length;
		this.width = width;
		this.weight = weight;
		
	}
	
	public void startingEngines() {
		int time_to_start = 20 + (int) ( Math.random() * 89);
		System.out.println(time_to_start + " seconds before takeoff");
	}
	
	public void airplaneTakeOff() {
		double distance = (double) (Math.random() * 1000);
		System.out.println("The plane will fly " + distance + " kilometers");
	}
	
	public void airplaneLanding() {
		System.out.println("The plane is landing");
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
}
