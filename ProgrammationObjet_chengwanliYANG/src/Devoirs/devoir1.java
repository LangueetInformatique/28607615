package Devoirs;

public class devoir1 {      

	public static void main(String[] args) {

		int p1 = 10, p2 = 9, p3 = -1;
/*
 * On touve d'abord la médiane des 3 premiers chiffres.		
 */
		mediane(p1, p2, p3);
		mediane(p1, p3, p2);
		mediane(p2, p1, p3);
		mediane(p2, p3, p1);
		mediane(p3, p1, p2);
		mediane(p3, p2, p1);
		
	}
	public static int mediane(int p1, int p2, int p3) { 
		int p7;

		if (p1 > p2) {
			if (p3 > p1)
				p7 = p1;
			else {
				if (p3 > p2)
					p7 = p3;
				else
					p7 = p2;
			}
		} else {
			if (p3 > p2)
				p7 = p2;
			else {
				if (p3 > p1)
					p7 = p3;
				else
					p7 = p1;
			}
		}
/*
 * Ensuite on trouve la médiane de p7 et les 2 derniers.			
 */
		int  p4 = 4, p5 = 8;
		
		media(p7, p4, p5);
		media(p7, p5, p4);
		media(p4, p7, p5);
		media(p4, p5, p7);
		media(p5, p7, p4);
		media(p5, p4, p7);
		return p7;
	}
	public static int media(int p7, int p4, int p5) {
			int p6;

			if (p7 > p4) {
				if (p5 > p7)
					p6 = p7;
				else {
					if (p5 > p4)
						p6 = p5;
					else
						p6 = p4;
				}
			} else {
				if (p5 > p4)
					p6 = p4;
				else {
					if (p5 > p7)
						p6 = p5;
					else
						p6 = p7;
				}
			}
			
			System.out.print(p6);
			return p6;
		
		}
}