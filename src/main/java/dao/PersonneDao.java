package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import config.MySqlConnection;
import model.Personne;
// dao - crud 
//classe Personne, type clé primaire type Integer
public class PersonneDao implements Dao<Personne, Integer> {

	@Override
	public List<Personne> findAll() {
		ArrayList<Personne> personnes = null;
		Connection connection = MySqlConnection.getConnection();
		String sql = "SELECT * FROM personne";
		try {
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(sql);
			personnes = new ArrayList<>();
			while (result.next()) {
				personnes.add(new Personne(result.getInt("num"), result.getString("nom"), result.getString("prenom")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return personnes;
	}

	@Override
	public Personne findById(Integer id) {
		Connection connection = MySqlConnection.getConnection();
		String sql = "SELECT * FROM personne WHERE num = ?";
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, id);
			ResultSet result = statement.executeQuery();
			if (result.next()) {
				return new Personne(result.getInt("num"), result.getString("nom"), result.getString("prenom"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
//		Personne personne = null;
//		Connection connection = MySqlConnection.getConnection();
//		String sql = "SELECT * FROM personne WHRERE num= " + id;
//		try {
//			Statement statement = connection.createStatement();
//			ResultSet result = statement.executeQuery(sql);
//			if (result.next()) {
//				personne = new Personne(result.getInt("num"), result.getString("nom"), result.getString("prenom"));
//			}
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} 
//		return personne;
//	}

	@Override
	public Personne save(Personne objet) {
		Connection connection = MySqlConnection.getConnection();
		String sql = "INSERT INTO personne (nom, prenom) VALUES (?, ?)";
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, objet.getNom());
			statement.setString(2, objet.getPrenom());
			int nombre = statement.executeUpdate();
			if (nombre > 0) {
				return objet;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

//	String sql = "SELECT * FROM personne WHERE num = ?";
//	try {
//		PreparedStatement statement = connection.prepareStatement(sql);
//		statement.setInt(1, id);
		
	@Override
	public Personne update(Personne objet) {
		Connection connection = MySqlConnection.getConnection();
		String sql = "UPDATE personne SET nom = ?, prenom= ?, WHERE num= ?";
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, objet.getNom());
			statement.setString(2, objet.getPrenom());
			statement.setInt(3, objet.getNum());
			int nombre = statement.executeUpdate();
			if (nombre > 0) {
				return objet;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void remove(Integer id) {
		Connection connection = MySqlConnection.getConnection();
		String sql = "DELETE FROM personne WHERE num = ?";
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, id);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
//spring angular 

