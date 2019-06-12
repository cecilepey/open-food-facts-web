package fr.openfoodfact.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.openfoodfact.connexion.ConnexionManager;
import fr.openfoodfact.exception.TechnicalException;
import fr.openfoodfact.model.Produit;

/**
 * Classe qui gère les actions sur la table produit
 * 
 * @author Cécile Peyras
 *
 */
public class ProduitDao {

	public void produitAdd(Produit produit) {
		Connection conn = ConnexionManager.getInstance();
		PreparedStatement statement = null;

		try {
			conn.setAutoCommit(false);
			statement = conn.prepareStatement(
					"INSERT INTO produit (nom, gradenutrition, energie100g, graisse100g, sucre100g, fibre100g, proteine100g, sel, id_marque, id_cat) VALUES (?,?, ?,?, ?,?, ?, ?, ?, ?)");
			statement.setString(1, produit.getNom());
			statement.setString(2, produit.getGrade());
			statement.setDouble(3, produit.getEnergie100g());
			statement.setDouble(4, produit.getGraisse100g());
			statement.setDouble(5, produit.getSucre100g());
			statement.setDouble(6, produit.getFibre100g());
			statement.setDouble(7, produit.getProteine100g());
			statement.setDouble(8, produit.getSel());
			statement.setDouble(9, produit.getIdMarque());
			statement.setDouble(10, produit.getIdCategorie());

			statement.executeUpdate();

			conn.commit();
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				throw new TechnicalException("Le rollback n'a pas fonctionné", e);
			}
			throw new TechnicalException("L'ajout ne s'est pas fait", e);
		} finally {
			try {
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {

				throw new TechnicalException("La fermeture ne s'est pas faite", e);
			}
		}
	}

	public boolean produitExist(String nomProduit) {
		Connection conn = ConnexionManager.getInstance();
		PreparedStatement statement = null;
		ResultSet curseur = null;

		try {

			statement = conn.prepareStatement("SELECT nom FROM produit where nom = ?");
			statement.setString(1, nomProduit);
			curseur = statement.executeQuery();

			if (curseur.next()) {

				return true;
			}

			return false;
		} catch (SQLException e) {
			throw new TechnicalException("Une erreur sur l'existence du produit", e);
		} finally {
			try {
				if (statement != null) {
					statement.close();
				}
				if (curseur != null) {
					curseur.close();
				}
			} catch (SQLException e) {

				throw new TechnicalException("La fermeture ne s'est pas faite", e);
			}
		}

	}

	public int getIdProduit(String nomProduit) {
		Connection conn = ConnexionManager.getInstance();
		PreparedStatement statement = null;
		ResultSet curseur = null;
		int idProduit = 0;

		try {

			statement = conn.prepareStatement("SELECT id FROM produit where nom = ?");
			statement.setString(1, nomProduit);
			curseur = statement.executeQuery();

			if (curseur.next()) {

				int id = curseur.getInt("id");

				idProduit = id;
			}

			return idProduit;

		} catch (SQLException e) {

			throw new TechnicalException("Une erreur sur l'id du produit", e);
		} finally {
			try {
				if (statement != null) {
					statement.close();
				}
				if (curseur != null) {
					curseur.close();
				}
			} catch (SQLException e) {

				throw new TechnicalException("La fermeture ne s'est pas faite", e);
			}
		}
	}

	public List<Produit> rechercherProduitCategorie(Integer idCategorie) {
		Connection conn = ConnexionManager.getInstance();
		PreparedStatement statement = null;
		ResultSet curseur = null;
		List<Produit> listeProduit = new ArrayList<>();

		try {

			statement = conn.prepareStatement("SELECT * FROM produit where id_cat = ?");
			statement.setLong(1, idCategorie);
			curseur = statement.executeQuery();

			while (curseur.next()) {

				String nom = curseur.getString("nom");
				String grade = curseur.getString("gradenutrition");
				double energie = curseur.getDouble("energie100g");
				double graisse = curseur.getDouble("graisse100g");
				double sucre = curseur.getDouble("sucre100g");
				double fibre = curseur.getDouble("fibre100g");
				double sel = curseur.getDouble("sel");
				int idMarque = curseur.getInt("id_marque");

				listeProduit.add(new Produit(nom, grade, energie, graisse, sucre, fibre, sel, idMarque, idCategorie));

			}

			return listeProduit;

		} catch (SQLException e) {

			throw new TechnicalException("Une erreur sur l'id du produit", e);
		} finally {
			try {
				if (statement != null) {
					statement.close();
				}
				if (curseur != null) {
					curseur.close();
				}
			} catch (SQLException e) {

				throw new TechnicalException("La fermeture ne s'est pas faite", e);
			}
		}
	}

	public List<Produit> rechercherProduitMarque(Integer idMarque) {
		Connection conn = ConnexionManager.getInstance();
		PreparedStatement statement = null;
		ResultSet curseur = null;
		List<Produit> listeProduit = new ArrayList<>();

		try {

			statement = conn.prepareStatement("SELECT * FROM produit where id_marque = ?");
			statement.setLong(1, idMarque);
			curseur = statement.executeQuery();

			while (curseur.next()) {

				String nom = curseur.getString("nom");
				String grade = curseur.getString("gradenutrition");
				double energie = curseur.getDouble("energie100g");
				double graisse = curseur.getDouble("graisse100g");
				double sucre = curseur.getDouble("sucre100g");
				double fibre = curseur.getDouble("fibre100g");
				double sel = curseur.getDouble("sel");
				int idCategorie = curseur.getInt("id_cat");

				listeProduit.add(new Produit(nom, grade, energie, graisse, sucre, fibre, sel, idMarque, idCategorie));

			}

			return listeProduit;

		} catch (SQLException e) {

			throw new TechnicalException("Une erreur sur l'id du produit", e);
		} finally {
			try {
				if (statement != null) {
					statement.close();
				}
				if (curseur != null) {
					curseur.close();
				}
			} catch (SQLException e) {

				throw new TechnicalException("La fermeture ne s'est pas faite", e);
			}
		}
	}
}
