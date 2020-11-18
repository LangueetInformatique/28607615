package Devoir3;

public class Crocodile extends Reptile implements Griffe, Yeux {

	
	
	
	public Crocodile (String nom) {
			
			super("Crocodile", true);
			
	}
	
	
	public void presente() {
		super.presente();  
		System.out.println("Voilà, je suis crocodile!");
	}

	@Override
	public void avoir_griffes(int griffe) {
		griffe = 4;
	}

	@Override
	public void avoir_yeux(int yeux) {
		yeux = 2;
	}
	
}
