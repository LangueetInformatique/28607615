package Devoir7;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class testLireTouUnTexte {


	public static void main(String[] args) throws IOException {
		
		LireToutUnTexte lt = new LireToutUnTexte(new File("livres/andromaque.txt"));
		// lt.afficher();
		//System.out.println(lt.Chercher("je"));
		
		System.out.println(lt.ChercherVoir("lui", 3)); // test de l'exercice 3 de 1er partie
		
		
		
		String lp = new String(Files.readAllBytes(Paths.get("livres/avare.txt")));

		LireToutUnTexte.ChercherER(lp);
	}

}
