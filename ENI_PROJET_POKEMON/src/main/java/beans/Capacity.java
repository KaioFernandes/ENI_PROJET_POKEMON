package beans;

public class Capacity {
	
	//Attributes
	
	private int id;
	private String name;
	private int power;
	private String type;
	

	
	public Capacity(int id, String name, int power, String type) {
		super();
		this.id = id;
		this.name = name;
		this.power = power;
		this.type = type;
	}

	


	public Capacity(String name, int power, String type) {
		super();
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


	public void setType(String typesEnum) {
		this.type = typesEnum;
	}


	
	//toString
	@Override
	public String toString() {
		return "Capacity [id=" + id + ", name=" + name + ", power=" + power + ", type=" + type.toString() + "]";
	}
	
	
	
	
	
	
}
