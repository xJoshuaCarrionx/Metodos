package ClasePractica;

import java.util.Scanner;

public class SobreCargaDeMetodos {
    static Scanner lector = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("El area lateral del prisma es: "+ calcularAreaLateralPrisma());
		System.out.println("El area lateral del prisma es: "+ calcularAreaLateralPrisma(5));
		System.out.println("El area lateral del prisma es: "+ calcularAreaLateralPrisma(5,6.1));
		System.out.println("El area lateral del prisma es: "+ calcularAreaLateralPrisma(5,6.1, 11.2));
		
		
		
	}
	private static double calcularAreaLateralPrisma() {
		double n, l, h, areaLateral;
		System.out.println("Ingrese n = ");
		n = lector.nextInt();
		System.out.println("Ingrese l = ");
		l = lector.nextDouble();
		System.out.println("Ingrese h = ");
		h = lector.nextDouble();
		
		areaLateral = n * l * h;
		
		return areaLateral;
		
	}
	private static double calcularAreaLateralPrisma(int n ) {
		double l, h, areaLateral;
		System.out.println("Ingrese l = ");
		l = lector.nextDouble();
		System.out.println("Ingrese h = ");
		h = lector.nextDouble();
		
		areaLateral = n * l * h;
		
		return areaLateral;
		
	}
	private static double calcularAreaLateralPrisma(int n, double l ) {
		double h, areaLateral;
		System.out.println("Ingrese h = ");
		h = lector.nextDouble();
		
		areaLateral = n * l * h;
		
		return areaLateral;

    }
	private static double calcularAreaLateralPrisma(int n, double l, double h ) {
		double areaLateral;
		
		areaLateral = n * l * h;
		
		return areaLateral;

}
}