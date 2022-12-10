import java.util.Scanner;

public class exerc3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o primeiro número: ");
		double num1 = teclado.nextInt();
		System.out.print("Informe o segundo número: ");
		double num2 = teclado.nextInt();
		System.out.print("Informe o terceiro número: ");
		double num3 = teclado.nextInt();
        teclado.close();
		
		double t = soma(num1, num2, num3);
		System.out.println("A soma dos 3 números é: "+t);	
	}
	public static double soma(double n1, double n2, double n3) { 
		return n1+n2+n3;
	}

}