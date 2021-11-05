package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.Pokemon;

public class PokemonDAOImpl implements PokemonDAO{

	@Override
	public String create(Pokemon pokemonToCreate) {
		
		// Etape 1 : Connexion à la BDD
		Connection connection = DAOUtil.getConnection();				
		
		// Etape 2 : Préparation de notre requete
		String request = "INSERT INTO pokemon (name, life_points, attack_strength, defence_strength, speed, type, capacity) VALUES (?,?,?,?,?,?,?)";
		
		try {
			// Etape 3 : Exécuter la requete
			// Préparation
			PreparedStatement prepareStmt;
			prepareStmt = connection.prepareStatement(request);
			
			prepareStmt.setString(1, pokemonToCreate.getName()); // 1er ?
			prepareStmt.setInt(2, pokemonToCreate.getLifePoints()); // 2eme ?
			prepareStmt.setInt(3, pokemonToCreate.getAttackStrength()); // 3eme ?
			prepareStmt.setInt(4, pokemonToCreate.getDefenceStrength());
			prepareStmt.setInt(5, pokemonToCreate.getSpeed());
			prepareStmt.setString(6, pokemonToCreate.getType().toString());
			prepareStmt.setInt(7, pokemonToCreate.getIdCapacity());
			
			// Exécuter la requete
			prepareStmt.executeUpdate(); // Car on fait une modification
			
			connection.close();
			return "La création s'est bien passée";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "La création ne s'est pas bien passée";
		}
	}

	@Override
	public String delete(int idToDelete) {
		// Etape 1 : Connexion à la BDD
		Connection connection = DAOUtil.getConnection();
		
		// Etape 2 : Préparation de notre requete
		String request = "DELETE FROM Pokemon WHERE id = ?";
		
		try {
			// Etape 3 : Exécuter la requete
			// Préparation
			PreparedStatement prepareStmt;
			prepareStmt = connection.prepareStatement(request);
			
			prepareStmt.setInt(1, idToDelete); // 1er ?
			
			// Exécuter la requete
			prepareStmt.executeUpdate(); // Car on fait une modification
			
			connection.close();
			
			return "La supression s'est bien passée";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "La supression ne s'est pas bien passée";
		}
			
	}

	@Override
	public List<Pokemon> findAll() {
		System.out.println("[UserDAOImpl findAll]");
		List<Pokemon> pokemonList = new ArrayList<Pokemon>();
		
		Connection connection = DAOUtil.getConnection();
		
		String request = "SELECT * FROM pokemons";
		
		try {
			PreparedStatement prepareStmt = connection.prepareStatement(request);
			ResultSet resultSet = prepareStmt.executeQuery();
			
			while(resultSet.next()) {
				Pokemon pokemon = new Pokemon(
					resultSet.getInt("id"),
					resultSet.getString("name"),
					resultSet.getInt("life_points"),
					resultSet.getInt("attack_strength"),
					resultSet.getInt("defence_strength"),
					resultSet.getInt("speed"),
					resultSet.getString("type"),
					resultSet.getInt("capacity")
				);
				System.out.println(pokemon);
				pokemonList.add(pokemon);
			}
			
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return pokemonList;
		
	}

}
