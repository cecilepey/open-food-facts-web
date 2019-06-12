package fr.openfoodfact.model;

import java.util.List;

/**
 * Classe qui gère le produit
 * 
 * @author Cécile Peyras
 *
 */
public class Produit {

	/** Categorie : Categorie */
	private String categorie;
	/** marque : Marque */
	private String marque;
	/** ingredient : Ingredient */
	private List<String> ingredient;
	/** nom : String nom du produit */
	private String nom;
	/** grade : String : grade nutritif du produit */
	private String grade;
	/** energie100g : double : energie au 100g */
	private double energie100g;
	/** graisse100g : double : graisse au 100g */
	private double graisse100g;
	/** sucre100g : double : sucre au 100g */
	private double sucre100g;
	/** fibre100g : double : fibre au 100g */
	private double fibre100g;
	/** proteine100g : double : proteine au 100g */
	private double proteine100g;
	/** sel : double : quantité de sel */
	private double sel;
	/** idMarque : int */
	private int idMarque;
	/** idCategorie : int */
	private int idCategorie;

	/**
	 * Constructeur
	 * 
	 * @param categorie
	 * @param marque
	 * @param ingredient
	 * @param nom
	 * @param grade
	 * @param energie100g
	 * @param graisse100g
	 * @param sucre100g
	 * @param fibre100g
	 * @param proteine100g
	 * @param sel
	 * @param idMarque
	 * @param idCategorie
	 */
	public Produit(String nom, String grade, double energie100g, double graisse100g, double sucre100g, double fibre100g,
			double sel, int idMarque, int idCategorie) {
		this.nom = nom;
		this.grade = grade;
		this.energie100g = energie100g;
		this.graisse100g = graisse100g;
		this.sucre100g = sucre100g;
		this.fibre100g = fibre100g;
		this.sel = sel;
		this.idMarque = idMarque;
		this.idCategorie = idCategorie;
	}

	/**
	 * Getter
	 * 
	 * @return the categorie
	 */
	public String getCategorie() {

		return categorie;
	}

	/**
	 * Setter
	 * 
	 * @param categorie
	 *            the categorie to set
	 */
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	/**
	 * Getter
	 * 
	 * @return the marque
	 */
	public String getMarque() {
		return marque;
	}

	/**
	 * Setter
	 * 
	 * @param marque
	 *            the marque to set
	 */
	public void setMarque(String marque) {
		this.marque = marque;
	}

	/**
	 * Getter
	 * 
	 * @return the ingredient
	 */
	public List<String> getIngredient() {
		return ingredient;
	}

	/**
	 * Setter
	 * 
	 * @param ingredient
	 *            the ingredient to set
	 */
	public void setIngredient(List<String> ingredient) {
		this.ingredient = ingredient;
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * Setter
	 * 
	 * @param grade
	 *            the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}

	/**
	 * Getter
	 * 
	 * @return the energie100g
	 */
	public double getEnergie100g() {
		return energie100g;
	}

	/**
	 * Setter
	 * 
	 * @param energie100g
	 *            the energie100g to set
	 */
	public void setEnergie100g(double energie100g) {
		this.energie100g = energie100g;
	}

	/**
	 * Getter
	 * 
	 * @return the graisse100g
	 */
	public double getGraisse100g() {
		return graisse100g;
	}

	/**
	 * Setter
	 * 
	 * @param graisse100g
	 *            the graisse100g to set
	 */
	public void setGraisse100g(double graisse100g) {
		this.graisse100g = graisse100g;
	}

	/**
	 * Getter
	 * 
	 * @return the sucre100g
	 */
	public double getSucre100g() {
		return sucre100g;
	}

	/**
	 * Setter
	 * 
	 * @param sucre100g
	 *            the sucre100g to set
	 */
	public void setSucre100g(double sucre100g) {
		this.sucre100g = sucre100g;
	}

	/**
	 * Getter
	 * 
	 * @return the fibre100g
	 */
	public double getFibre100g() {
		return fibre100g;
	}

	/**
	 * Setter
	 * 
	 * @param fibre100g
	 *            the fibre100g to set
	 */
	public void setFibre100g(double fibre100g) {
		this.fibre100g = fibre100g;
	}

	/**
	 * Getter
	 * 
	 * @return the proteine100g
	 */
	public double getProteine100g() {
		return proteine100g;
	}

	/**
	 * Setter
	 * 
	 * @param proteine100g
	 *            the proteine100g to set
	 */
	public void setProteine100g(double proteine100g) {
		this.proteine100g = proteine100g;
	}

	/**
	 * Getter
	 * 
	 * @return the sel
	 */
	public double getSel() {
		return sel;
	}

	/**
	 * Setter
	 * 
	 * @param sel
	 *            the sel to set
	 */
	public void setSel(double sel) {
		this.sel = sel;
	}

	/**
	 * Getter
	 * 
	 * @return the idMarque
	 */
	public int getIdMarque() {
		return idMarque;
	}

	/**
	 * Setter
	 * 
	 * @param idMarque
	 *            the idMarque to set
	 */
	public void setIdMarque(int idMarque) {
		this.idMarque = idMarque;
	}

	/**
	 * Getter
	 * 
	 * @return the idCategorie
	 */
	public int getIdCategorie() {
		return idCategorie;
	}

	/**
	 * Setter
	 * 
	 * @param idCategorie
	 *            the idCategorie to set
	 */
	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}

}
