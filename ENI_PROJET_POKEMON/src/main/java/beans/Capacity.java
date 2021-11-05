package beans;

public class Capacity {
	
	//Attributes
	private int id;
	private String name;
	private int power;
	private String type;
	
	//Constructor
	public Capacity(int id, String name, int power, String type) {
		this.id = id;
		this.name = name;
		this.power = power;
		this.type = type;
	}

	
	//Constructor without id
	public Capacity(String name, int power, String type) {
		this.name = name;
		this.power = power;
		this.type = type;
	}

	//Constructor empty
	public Capacity() {
	}


	
	
	//Getters and Setters
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPower() {
		return power;
	}


	public void setPower(int power) {
		this.power = power;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	
	//toString
	@Override
	public String toString() {
		return "Capacities [id=" + id + ", name=" + name + ", power=" + power + ", type=" + type + "]";
	}
	
	
	
	
	
	
}
