import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int km;
		double litros, t;
		
		km = sc.nextInt();
		litros = sc.nextDouble();
		
		t = km/litros;
		
		System.out.printf("%.3f km/l%n", t);
		
		sc.close();

	}

}
