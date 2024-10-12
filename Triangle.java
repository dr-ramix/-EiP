import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hoehe: ");
		int height = sc.nextInt();

		System.out.println("Breite: ");
		int width = sc.nextInt();
		sc.close();

		System.out.println(areaTriangle(width, height));
	}

	public static double areaTriangle(int width, int height) {
		// hier Loesung einfuegen
	}
}
