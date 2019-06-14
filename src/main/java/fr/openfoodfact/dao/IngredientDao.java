package fr.openfoodfact.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.openfoodfact.connexion.ConnexionManager;
import fr.openfoodfact.exception.TechnicalException;

/**
 * Classe qui gère les méthode concernant les ingrédients
 * 
 * @author Cécile Peyras
 *
 */
public class IngredientDao {

	/**
	 * méthode qui permet l'ajout d'un ingrédient dans la base de données
	 * 
	 * @param ingredient
	 * @param id
	 */
	public void ingredientJAdd(String ingredient, int id) {
		Connection conn = ConnexionManager.getInstance();
		PreparedStatement statement = null;

		try {

			conn.setAutoCommit(false);

			statement = conn.prepareStatement("INSERT INTO ingredient (nom, id_prd) VALUES (?,?)");
			statement.setString(1, ingredient);
			statement.setInt(2, id);
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

	/**
	 * méthode qui vérifie l'existence d'un ingrédient
	 * 
	 * @param idProduit
	 * @return
	 */
	public boolean ingredientExist(int idProduit) {
		Connection conn = ConnexionManager.getInstance();
		PreparedStatement statement = null;
		ResultSet curseur = null;

		try {

			statement = conn.prepareStatement("SELECT id_prd FROM ingredient where id_prd=?");
			statement.setInt(1, idProduit);
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

	/**
	 * méthode qui retourne id du produit
	 * 
	 * @param nomProduit
	 * @return
	 */
	public int getIdProduit(String nomProduit) {
		Connection conn = ConnexionManager.getInstance();
		PreparedStatement statement = null;
		ResultSet curseur = null;
		int idProduit = 0;

		try {

			statement = conn.prepareStatement("SELECT id FROM produit where nom = ?");
			statement.setString(1, nomProduit);
			curseur = statement.executeQuery();

			while (curseur.next()) {

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
}
