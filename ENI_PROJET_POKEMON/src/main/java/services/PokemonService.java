package services;

import java.util.List;

import beans.Pokemon;

public interface PokemonService {

	public String create(Pokemon pokemon);
	public String delete(int id);
	public List<Pokemon> findAll();

}
