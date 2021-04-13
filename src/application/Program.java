package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle trianglex; 
		Triangle triangley;
		trianglex = new Triangle();
		triangley = new Triangle();
		
		System.out.println("Enter the measure of triangle X: ");
		trianglex.a = sc.nextDouble();
		trianglex.b = sc.nextDouble();
		trianglex.c = sc.nextDouble();
		System.out.println("Enter the measure of triangle Y: ");
		triangley.a = sc.nextDouble();
		triangley.b = sc.nextDouble();
		triangley.c = sc.nextDouble();
		
		double areaX = trianglex.area();
		double areaY = triangley.area();
		
		System.out.printf("Area X: %.2f%n",  areaX);
		System.out.printf("Area Y: %.2f%n", areaY);
		
		if(areaX > areaY) {
			System.out.printf("Larger Area: X ");
		} else {
			System.out.printf("Larger Area: Y ");
		}
		sc.close();
	}

}