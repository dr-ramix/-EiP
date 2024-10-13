import java.util.Scanner;

public class Summieren1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int zaehler = 0, summe = 0;
		boolean weiter = true;

		while (weiter) {
			zaehler++;
			System.out.println(zaehler + ". ganze Zahl angeben: ");
			int zahl = sc.nextInt(); // Liest nur bis Zahlende ein. 
			//sc.nextLine(); // Liest ab dem Zeichen nach Zahlende bis NewLine ein.
							// String quatsch = sc.nextLine();
							// System.out.println(quatsch);
			summe = summe + zahl;
			System.out.println("Weiter (Ja/Nein)? ");
			weiter = sc.nextLine().equals("Ja");
		}
		System.out.println("Die Summe der " + zaehler + " Zahlen ist: " + summe);
		sc.close();
	}

}
