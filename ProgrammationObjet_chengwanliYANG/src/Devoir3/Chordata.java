package Devoir3;


/** Creation et gestion de Chordata */
public class Chordata extends Animal {
	private String espece_chordata;
	private boolean avoirecaille;

	/**
	 * le constructeur de Chordata fait appel au constructeur de la sur-classe Animal
	 */
	public Chordata(String type_chordata, boolean ecaille) { 
		super("Chordata", true); 
		
		espece_chordata = type_chordata; //creation d'une nouvelle instance de la classe chordata
		avoirecaille = ecaille;		
	}					
	

	/** presentation des caracteristiques du Chordata */
	public void presente() {
		super.presente();  
		
		System.out.println("Je suis vraiment un animal, j'ai l'échine.");
	}
}

