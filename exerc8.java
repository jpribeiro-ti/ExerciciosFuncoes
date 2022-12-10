import java.util.Scanner;

public class exerc8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num = 0;
		
		System.out.print("Digite um número: ");
		num = teclado.nextInt();

		teclado.close();
		contador(num);
	}
	
	//Função 
	public static String contador(int num) {
		String contador =  Integer.toString(num);
		System.out.print("A quantidade de dígitos:" + contador.length());
		return contador;
	}

}