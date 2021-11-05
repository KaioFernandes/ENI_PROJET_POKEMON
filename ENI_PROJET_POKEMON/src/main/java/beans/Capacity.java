package beans;

public class Capacity {
	
	//Attributes
	int id;
	String name;
	int power;
	TypesEnum type;
	
	//Constructor
	public Capacity(int id, String name, int power, TypesEnum type) {
		this.id = id;
		this.name = name;
		this.power = power;
		this.type = type;
	}

	
	//Constructor without id
	public Capacity(String name, int power, TypesEnum type) {
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


	public TypesEnum getType() {
		return type;
	}


	public void setType(TypesEnum typesEnum) {
		this.type = typesEnum;
	}


	
	//toString
	@Override
	public String toString() {
		return "Capacity [id=" + id + ", name=" + name + ", power=" + power + ", type=" + type.toString() + "]";
	}
	
	
	
	
	
	
}
