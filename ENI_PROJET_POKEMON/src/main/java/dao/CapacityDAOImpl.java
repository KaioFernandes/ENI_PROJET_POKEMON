package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import beans.Capacity;

public class CapacityDAOImpl implements CapacityDAO{

	@Override
	public String create(Capacity capacity) {
		// Etape 1 : Connexion à la BDD
				Connection connection = DAOUtil.getConnection();
								
				// Etape 2 : Préparation de notre requete
				String request = "INSERT INTO capacities (name, power, type) VALUES (?,?,?)";
								
				try {
				// Etape 3 : Exécuter la requete
					// Préparation
					PreparedStatement prepareStmt;
					prepareStmt = connection.prepareStatement(request);
					prepareStmt.setString(1, capacity.getName());
					prepareStmt.setInt(2, capacity.getPower());
					prepareStmt.setString(3, capacity.getType().toString());
				
					// Exécuter la requete
					prepareStmt.executeUpdate();
									
					connection.close();
					return "L'utilisateur a bien été enregistré dans la base de données !";
				} catch (SQLException e) {
					e.printStackTrace();
					return "ECHEC D'INSERTION !";
				}
		
	}

}
