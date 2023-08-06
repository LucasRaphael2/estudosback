package estudosCoffee;

import java.util.Scanner;

public class CalculadoraDeIMC {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double peso = 0;
		double altura = 0;
		
		System.out.println("Qual seu peso: ");
		peso = in.nextDouble();
		
		System.out.println("Qual sua altura");
		altura = in.nextDouble();
		
		double imcBrasil = peso / Math.pow(altura,altura ) ;
		double weight = peso * 2.2;
		double height = (altura * 100) / 2.54;
		double heightFeet = height * 0.08333;
		double feet = 30.48;
		
		double imcEUA = weight / 2.54;
		double weightPerFeet = weight / feet;
		
		System.out.printf("Seu peso é de: %.2f%nYou weight is: %.2f%n%n",peso,weight);
		System.out.printf("Sua altura é de: %.2f%nYour height in inches: %.2f%nYou height in feets: %.2f%n%n",altura,height,heightFeet);
		System.out.printf("Seu IMC é de: %.2f%nYou body fat is: %.2f%nYour body fat per feet: %.2f",imcBrasil,imcEUA,weightPerFeet);
		
		
		in.close();

	}

}
