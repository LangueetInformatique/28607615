package Devoir2;

public class Etudiant {
	String nom, prenom;
	int numeroEtudiant;
	float notes;

	/**
	 *  constructeur vide
	 */
	public Etudiant() {
		
	}
	
	/**
	 *  constructeur non vide
	 */
	public Etudiant(String nom, String prenom, int numero, float notes) {
		this.nom = nom;
		this.prenom = prenom;
		this.numeroEtudiant = numero;
		this.notes = notes;
	
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNom() {
		return nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getPreom() {
		return prenom;
	}
	public void setNumero(int numero) {
		this.numeroEtudiant = numero;
	}
	public int getNumero() {
		return numeroEtudiant;
	}
	public void setNotes(float notes) {
		this.notes = notes;
	}
	public float getNotes() {
		return notes;
	}
}