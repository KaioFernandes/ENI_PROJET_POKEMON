package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.Capacity;

public class CapacityDAOImpl implements CapacityDAO{

	@Override
	public String create(Capacity capacity) {
		// Etape 1 : Connexion � la BDD
				Connection connection = DAOUtil.getConnection();
								
				// Etape 2 : Pr�paration de notre requete
				String request = "INSERT INTO capacities (name, power, type) VALUES (?,?,?)";
								
				try {
				// Etape 3 : Ex�cuter la requete
					// Pr�paration
					PreparedStatement prepareStmt;
					prepareStmt = connection.prepareStatement(request);
					prepareStmt.setString(1, capacity.getName());
					prepareStmt.setInt(2, capacity.getPower());
					prepareStmt.setString(3, capacity.getType().toString());
				
					// Ex�cuter la requete
					prepareStmt.executeUpdate();
									
					connection.close();
					return "L'utilisateur a bien �t� enregistr� dans la base de donn�es !";
				} catch (SQLException e) {
					e.printStackTrace();
					return "ECHEC D'INSERTION !";
				}
		
	}

	@Override
	public List<Capacity> findAll() {
		System.out.println("[CapacityDAOImpl findAll]");
		List<Capacity> capacityList = new ArrayList<Capacity>();
		
		Connection connection = DAOUtil.getConnection();
		
		String request = "SELECT * FROM capacities";
		
		try {
			PreparedStatement prepareStmt = connection.prepareStatement(request);
			ResultSet resultSet = prepareStmt.executeQuery();
			
			while(resultSet.next()) {
				Capacity capacity = new Capacity(
					resultSet.getInt("id"),
					resultSet.getString("name"),
					resultSet.getInt("power"),
					resultSet.getString("type")
				);
				System.out.println(capacity);
				capacityList.add(capacity);
			}
			
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return capacityList;
		
	}
}

