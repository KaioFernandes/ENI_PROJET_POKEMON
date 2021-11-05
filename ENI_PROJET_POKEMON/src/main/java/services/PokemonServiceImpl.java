package services;

import java.util.List;

import beans.Pokemon;
import dao.PokemonDAO;
import dao.PokemonDAOImpl;

public class PokemonServiceImpl implements PokemonService{
	PokemonDAO pokemonDAO = new PokemonDAOImpl();
	

	
	@Override
    public String create(Pokemon pokemon) {
        return pokemonDAO.create(pokemon);
    }

	
	@Override
	public String delete(int id) {
		PokemonDAO pokemonDAO = new PokemonDAOImpl();
		return pokemonDAO.delete(id);
	}


	@Override
	public List<Pokemon> findAll() {
		PokemonDAO pokemonDAO = new PokemonDAOImpl();
		return pokemonDAO.findAll();
	}
}
