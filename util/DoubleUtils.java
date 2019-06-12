package fr.diginamic.openfoodfacts.util;

public class DoubleUtils {

	public static Double convert(String chaine) {
		if (chaine == null || chaine.isEmpty()) {
			return 0.0;
		}
		return Double.parseDouble(chaine);
	}

}
