package fr.openfoodfact.util;

/**
 * Classe qui gère les doubles
 * 
 * @author Cécile Peyras
 *
 */
public class DoubleUtils {

	/**
	 * méthode qui permet de convertir un string en double
	 * 
	 * @param chaine
	 * @return
	 */
	public static Double convert(String chaine) {
		if (chaine == null || chaine.isEmpty()) {
			return 0.0;
		}
		return Double.parseDouble(chaine);
	}

}
