package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PokemonDAOImpl implements PokemonDAO{

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
