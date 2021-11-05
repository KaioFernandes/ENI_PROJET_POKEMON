package dao;

import java.util.List;

import beans.Pokemon;

public interface PokemonDAO {

	public String create(Pokemon pokemon);

	public String delete(int idToDelete);

	public List<Pokemon> findAll();

}
