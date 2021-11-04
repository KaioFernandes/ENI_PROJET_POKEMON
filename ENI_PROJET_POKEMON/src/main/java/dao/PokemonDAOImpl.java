package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PokemonDAOImpl implements PokemonDAO{

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

}
