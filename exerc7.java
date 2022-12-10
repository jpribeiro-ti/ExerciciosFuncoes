import java.util.Scanner;

public class exerc7 {

public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		double dia= 0;
		double prestacao= 0;
		
		System.out.print("Digite o valor da prestacao: ");
		prestacao = teclado.nextDouble();
		
		System.out.print("Digite o número de dias em atraso: ");
		dia = teclado.nextDouble();
		
		teclado.close();
		valorPagamento(prestacao, dia);
		double total = valorPagamento(prestacao, dia)+ prestacao;
		System.out.println("valor total a pagar: "+ total);
	}
	public static double valorPagamento(double prestacao, double dia) {
		return  (prestacao * 0.03 + 0.01 * dia);
	}

}