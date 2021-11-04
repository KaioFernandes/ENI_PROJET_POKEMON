package services;

import dao.PokemonDAO;
import dao.PokemonDAOImpl;

public class PokemonServiceImpl implements PokemonService{
	
	
	@Override
	public String delete(int id) {
		PokemonDAO pokemonDAO = new PokemonDAOImpl();
		return pokemonDAO.delete(id);
	}
}
