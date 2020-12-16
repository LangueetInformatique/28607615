package Devoir7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.*;

public class LireToutUnTexte {
	private String Stexte;

	/**
	 * lecture d'un fichier texte dans la chaîne sTexte
	 * 
	 * @param ft descripteur du fichier
	 */
	public LireToutUnTexte(File ft) {
		String ligne = null;
		Stexte = "";

		try {
			BufferedReader br = new BufferedReader(new FileReader(ft));
			while ((ligne = br.readLine()) != null) {
				Stexte += ligne + "\n";
			}

		}

		catch (IOException e) {
		}
	}
	
	/** affichage du contenu de Stexte
	 * 
	 */
	public void afficher() {
		System.out.println(Stexte);
	}

	/**
	 * Recherche du nombre d'occurences de s dans sTexte
	 * 
	 * @param s chaîne cherchée
	 * @return nombre d'occurences
	 * 
	 */
	public int Chercher(String s) {

		int deb = -1, nOcc = 0;
		while ((deb = Stexte.indexOf(s, deb+1)) != -1)
			nOcc++;
		
		return nOcc;
	}

	/**
	 * l'exercice 3 de 1er partie
	 * Affichage du contexte des occurences de s dans sTexte
	 * 
	 * @param s      chaîne cherchée
	 * @param taille taille du contexte
	 * @param c      contexte
	 */
	public static String ChercherVoir(String s, int taille) {
		String stexte = "";
		String c;
		if(stexte.contains(s)) {
			int index_start = stexte.indexOf(s) ;
			int index_end = index_start + s.length() + taille;
			c = stexte.substring(index_start,index_end+1);
		}
		else {
			c = "la chaine cherchée n'est pas dans le texte";
		}
		return c;
	}
	/**
	 *  l'exercice de 2er partie
	 */
	public static void ChercherER(String stexte) {
		
		String mot = "(\\baim[e|es|ons|ez|ent|er]\\b)";
		Pattern pattern = Pattern.compile(mot);
		Matcher matcher = pattern.matcher(stexte);
		
		if (matcher.find()) {
	         System.out.println("Trouvé: " + matcher.group(1) );
	    
	      } else {
	         System.out.println("Pas trouvé");
	      }
		}
	}
	
	
