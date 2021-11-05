package services;

import java.util.List;

import beans.Capacity;

public interface CapacityService {
	public void create(Capacity capacity);
	public List<Capacity> findAll();
}
