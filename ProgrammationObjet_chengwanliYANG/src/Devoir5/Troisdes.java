package Devoir5;

public class Troisdes {
// Test du lancement (mais non réussi...)
	public static void main(String[] args) {
		try {
			lancement();
		} catch (E421version2 e) {
			System.out.print("Nom du lanceur: ");
			System.out.println(e.getMessage());
		}

	}

	public static void lancement() throws E421version2 {
		int d1, d2, d3;
		d1=9; d2=4; d3=6;
		
		if (d1 > 6){
			throw new E421version();
			}

}
}