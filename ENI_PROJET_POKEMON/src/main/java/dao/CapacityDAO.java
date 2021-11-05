package dao;

import java.util.List;

import beans.Capacity;

public interface CapacityDAO {

	public String create(Capacity capacity);

	public List<Capacity> findAll();
	
}
