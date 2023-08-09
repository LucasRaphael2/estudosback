package estudosCoffee;

import java.util.Scanner;

public class CalculadoraDeIMC {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double peso = 0;
		double height = 0;
		int age = 0;
		
		System.out.println("Qual sua idade / How are you age: ");
		age = in.nextInt();
		System.out.println("Qual seu peso / What's your weight: ");
		peso = in.nextDouble();
		System.out.println("Qual sua altura / What's your height: ");
		height = in.nextDouble();
		

		double weight = peso * 2.204;
		double heightInches = (height * 100) / 2.54;
		double BMI = weight / (heightInches * heightInches) * 703;
		double bodyFatMens = (1.20 * BMI) + (0.23 * age) - 16.2;
		double bodyFatWomans = (1.20 * BMI) + (0.23 * age) - 5.4;
		

		System.out.printf("Tabela IMC/BMI:%n%nIdade/Age           Body fat Percentage for Men        Body fat Percentage for Women%n");
		System.out.println("20 - 39                       8% - 19%                           21% - 32%");
		System.out.println("40 - 59                       11% - 21%                          23% - 33%");
		System.out.println("60 - 79                       13% - 24%                          24% - 35%");		
		System.out.printf("%n%n");

		if(BMI <8 ) {
			System.out.printf("Male IMC/BMI: %n%n");
			System.out.printf("Seu IMC/ Your BMI: %.2f", BMI);
			System.out.println("%");
			System.out.println("According to your inputs, your weight is in the Underweight category");
			System.out.printf("Body Fat %.2f", bodyFatMens);
			System.out.println("%");
			System.out.printf("%n%n");
		}else if(BMI <= 19) {
			System.out.printf("Male IMC/BMI: %n%n");
			System.out.printf("Seu IMC/ Your BMI: %.2f", BMI);
			System.out.println("%");
			System.out.println("According to your inputs, your weight is in the healthy category");
			System.out.printf("Body Fat %.2f", bodyFatMens);
			System.out.println("%");
			System.out.printf("%n%n");
		}else if(BMI <= 30) {
			System.out.printf("Male IMC/BMI: %n%n");
			System.out.printf("Seu IMC/ Your BMI: %.2f", BMI);
			System.out.println("%");
			System.out.println("According to your inputs, your weight is in the Overweight category");
			System.out.printf("Body Fat %.2f", bodyFatMens);
			System.out.println("%");
			System.out.printf("%n%n");
		}else{
			System.out.printf("Male IMC/BMI: %n%n");
			System.out.printf("Seu IMC/ Your BMI: %.2f", BMI);
			System.out.println("%");
			System.out.println("According to your inputs, your weight is in the Obese category ;");
			System.out.printf("Body Fat %.2f", bodyFatMens);
			System.out.println("%");
			System.out.printf("%n%n");
		}
		if(BMI <21 ) {
			System.out.printf("Female IMC/BMI: %n%n");
			System.out.printf("Seu IMC/ Your BMI: %.2f", BMI);
			System.out.println("%");
			System.out.println("According to your inputs, your weight is in the Underweight category");
			System.out.printf("Body Fat %.2f", bodyFatWomans);
			System.out.println("%");
		}else if(BMI <= 32) {
			System.out.printf("Female IMC/BMI: %n%n");
			System.out.printf("Seu IMC/ Your BMI: %.2f", BMI);
			System.out.println("%");
			System.out.println("According to your inputs, your weight is in the healthy category");
			System.out.printf("Body Fat %.2f", bodyFatWomans);
			System.out.println("%");
		}else if(BMI <= 33) {
			System.out.printf("Female IMC/BMI: %n%n");
			System.out.printf("Seu IMC/ Your BMI: %.2f", BMI);
			System.out.println("%");
			System.out.println("According to your inputs, your weight is in the Overweight category");
			System.out.printf("Body Fat %.2f", bodyFatWomans);
			System.out.println("%");
		}else {
			System.out.printf("Female IMC/BMI: %n%n");
			System.out.printf("Seu IMC/ Your BMI: %.2f", BMI);
			System.out.println("%");
			System.out.println("According to your inputs, your weight is in the Obese category");
			System.out.printf("Body Fat %.2f", bodyFatWomans);
			System.out.println("%");
		}
		in.close();

	}

}
