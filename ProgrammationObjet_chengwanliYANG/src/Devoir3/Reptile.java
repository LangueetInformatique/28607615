package Devoir3;

/** Creation et gestion de reptile */
public class Reptile extends Chordata {
	private String espece_Reptile;
	private boolean avoirqueue;
	
	public Reptile(String type_Reptile, boolean queue) { 
		super("Reptile", true); 
		
		espece_Reptile = type_Reptile; //creation d'une nouvelle instance de la classe chordata
		avoirqueue = queue;	
	}					

	/** presentation des caracteristiques du Reptile */
	public void presente() {
		super.presente();  
		
		System.out.println("J'ai aussi des écailles.");
	}

}
