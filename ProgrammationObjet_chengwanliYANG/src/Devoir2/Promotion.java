package Devoir2;

import java.util.*;
import Devoir2.Etudiant;

public class Promotion {
	String nom, annee;
	
	public Promotion(String nom_promo, String annee_promo) {
	
		this.nom=nom_promo;
		this.annee=annee_promo;
	}
	
	public void setNom(String nomPromo) {
		this.nom=nomPromo;
	}
	public String getNom() {
		return nom;
	}
	
	public void setAnnee(String anneePromo) {	
		this.annee=anneePromo;
	}
	public String getAnnee() {
		return annee;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nom de promotion：");
		String nompro = input.next();
		
		System.out.print("Annee de promotion：");
		String anneepro = input.next();
	}
}
