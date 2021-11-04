package beans;

public class Pokemon {
	
	//Attributes
	int id;
	String name;
	int lifePoints;
	int attackStrength;
	int defenceStrength;
	int speed;
	String type;
	int capacity;
	
	//Constructor
	public Pokemon(int id, String name, int lifePoints, int attackStrength, int defenceStrength, int speed, String type,
			int capacity) {
		this.id = id;
		this.name = name;
		this.lifePoints = lifePoints;
		this.attackStrength = attackStrength;
		this.defenceStrength = defenceStrength;
		this.speed = speed;
		this.type = type;
		this.capacity = capacity;
	}

	
	//Constructor without id
	public Pokemon(String name, int lifePoints, int attackStrength, int defenceStrength, int speed, String type,
			int capacity) {
		this.name = name;
		this.lifePoints = lifePoints;
		this.attackStrength = attackStrength;
		this.defenceStrength = defenceStrength;
		this.speed = speed;
		this.type = type;
		this.capacity = capacity;
	}


	
	//Constructor empty
	public Pokemon() {
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


	public int getLifePoints() {
		return lifePoints;
	}


	public void setLifePoints(int lifePoints) {
		this.lifePoints = lifePoints;
	}


	public int getAttackStrength() {
		return attackStrength;
	}


	public void setAttackStrength(int attackStrength) {
		this.attackStrength = attackStrength;
	}


	public int getDefenceStrength() {
		return defenceStrength;
	}


	public void setDefenceStrength(int defenceStrength) {
		this.defenceStrength = defenceStrength;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	
	//toString
	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", name=" + name + ", lifePoints=" + lifePoints + ", attackStrength="
				+ attackStrength + ", defenceStrength=" + defenceStrength + ", speed=" + speed + ", type=" + type
				+ ", capacity=" + capacity + "]";
	}
	
	
	
	
	
}
