package Devoir5;
// Question 3
public class E421 {


	public static void main(String[] args) {
		try {
			throw new Exception ("E421");
		}catch (Exception e) {
			System.out.println("Nom du lanceur: " + e);
		}
	}

}
