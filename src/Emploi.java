import java.util.Scanner;

import Presentation.Jour;

public class Emploi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String jour1 = "Lundi";
		String jour2 = "Mardi";
		String jour3 = "Mercredi";
		String jour4 = "Jeudi";
		String jour5 = "Vendredi";
		String jour6 = "Semedi";
		String jour7 = "Dimanche";
		String continuer = "o";
		while (continuer.equals("o")) {
			
 System.out.println("Veuillez choisir un jour du lundi au dimanche pour connaitre les cours");

			String choix = scan.next();

			if (choix.equals("Lundi")) {
				System.out.println("maths, francais, anglais");
			}
			// System.out.println("Veuillez encore choisir si voulu");
			if (choix.equals("Mardi")) {
				System.out
						.println("Dessin technique, ESCT, Signaux et systèmes ");
			}
			if (choix.equals("Mercredi")) {
				System.out.println(" Geographie, histoire, francais");
			}
			if (choix.equals("Jeudi")) {
				System.out.println(" Francais, Maths, Philosophie");
			}
			if (choix.equals("Vendredi")) {
				// System.out.println("Histoire, Economie, Signaux et stèmes ");
			}
			if (choix.equals("Samedi")) {
				System.out.println("maths, francais, anglais");
			}
			if (choix.equals("Dimanche")) {
				System.out.println("Repos");
			};
			System.out.println("Veuillez encore choisir si voulu o/n");
			continuer= scan.next();
		}
	}

}
