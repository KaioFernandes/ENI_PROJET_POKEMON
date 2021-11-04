package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
			prepareStmt.setString(6, pokemonToCreate.getType());
			prepareStmt.setInt(7, pokemonToCreate.getCapacity());
			
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

}
