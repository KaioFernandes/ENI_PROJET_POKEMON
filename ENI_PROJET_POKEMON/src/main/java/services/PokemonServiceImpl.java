package services;

import beans.Pokemon;
import dao.PokemonDAO;
import dao.PokemonDAOImpl;

public class PokemonServiceImpl implements PokemonService{
	PokemonDAO pokemonDAO = new PokemonDAOImpl();
	

	
	@Override
    public String create(Pokemon pokemon) {
        return pokemonDAO.create(pokemon);
    }


}
