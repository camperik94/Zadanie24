import java.util.Scanner;

public class Zadanie {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Podaj ciag znakow");
		
		String nazwa = in.nextLine();
		
		Klasa kla = new Klasa(nazwa);
		
		kla.funkcja();
		
	}
}
