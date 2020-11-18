package Devoir3;

/** Creation et gestion d'animaux */
public abstract class Animal {
	private String espece;
	private boolean avoirechine;

	/**
	 * creation d'une nouvelle instance de la classe Animal
	 * 
	 * @param type   nom de l'espece
	 * @param avoirechine avoir l'echine ou non
	 */
	public Animal(String type, boolean echine) {
		espece = type;
		avoirechine = echine;
	}

	/** presentation des caractéristiques de l'animal */
	public void presente() {
		System.out.println("Je suis un representant de l'espece de " + espece);
	}

}
