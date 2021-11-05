package dao;

import beans.Pokemon;

public interface PokemonDAO {

	public String create(Pokemon pokemon);

	public String delete(int idToDelete);

}
