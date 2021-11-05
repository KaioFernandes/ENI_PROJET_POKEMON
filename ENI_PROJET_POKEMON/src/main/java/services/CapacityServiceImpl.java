package services;

import java.util.List;

import beans.Capacity;
import dao.CapacityDAO;
import dao.CapacityDAOImpl;

public class CapacityServiceImpl implements CapacityService{

	@Override
	public void create(Capacity capacity) {
		CapacityDAO capacityDAO = new CapacityDAOImpl();
		capacityDAO.create(capacity);
	}

	@Override
	public List<Capacity> findAll() {
		CapacityDAO capacityDAO = new CapacityDAOImpl();
		return capacityDAO.findAll();
	}

}
