import java.util.Scanner;

public class exerc5 {

	public static void main (String[] args) {
		
		Scanner teclado  = new Scanner(System.in);
		
		double porcentagem = 0;
		double produto = 0;
		
		System.out.print("Digite o valor da porcentagem: ");
		porcentagem = teclado.nextDouble();
		
		System.out.print("Digite o valor do produto: ");
		produto = teclado.nextDouble();
		
		System.out.println("Valor com imposto: R$ " + somaImposto(porcentagem, produto));
		teclado.close();
	}
	
	public static double somaImposto(double porcentagem, double produto) {
		 return (1 + porcentagem / 100) * produto;	
	}
	

}