package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import beans.Pokemon;

public class PokemonDAOImpl implements PokemonDAO{

	@Override
	public String create(Pokemon pokemonToCreate) {
		
		// Etape 1 : Connexion � la BDD
		Connection connection = DAOUtil.getConnection();				
		
		// Etape 2 : Pr�paration de notre requete
		String request = "INSERT INTO pokemon (name, life_points, attack_strength, defence_strength, speed, type, capacity) VALUES (?,?,?,?,?,?,?)";
		
		try {
			// Etape 3 : Ex�cuter la requete
			// Pr�paration
			PreparedStatement prepareStmt;
			prepareStmt = connection.prepareStatement(request);
			
			prepareStmt.setString(1, pokemonToCreate.getName()); // 1er ?
			prepareStmt.setInt(2, pokemonToCreate.getLifePoints()); // 2eme ?
			prepareStmt.setInt(3, pokemonToCreate.getAttackStrength()); // 3eme ?
			prepareStmt.setInt(4, pokemonToCreate.getDefenceStrength());
			prepareStmt.setInt(5, pokemonToCreate.getSpeed());
			prepareStmt.setString(6, pokemonToCreate.getType().toString());
			prepareStmt.setInt(7, pokemonToCreate.getIdCapacity());
			
			// Ex�cuter la requete
			prepareStmt.executeUpdate(); // Car on fait une modification
			
			connection.close();
			return "La cr�ation s'est bien pass�e";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "La cr�ation ne s'est pas bien pass�e";
		}
	}

	@Override
	public String delete(int idToDelete) {
		// Etape 1 : Connexion � la BDD
		Connection connection = DAOUtil.getConnection();
		
		// Etape 2 : Pr�paration de notre requete
		String request = "DELETE FROM Pokemon WHERE id = ?";
		
		try {
			// Etape 3 : Ex�cuter la requete
			// Pr�paration
			PreparedStatement prepareStmt;
			prepareStmt = connection.prepareStatement(request);
			
			prepareStmt.setInt(1, idToDelete); // 1er ?
			
			// Ex�cuter la requete
			prepareStmt.executeUpdate(); // Car on fait une modification
			
			connection.close();
			
			return "La supression s'est bien pass�e";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "La supression ne s'est pas bien pass�e";
		}
			
	}

}
