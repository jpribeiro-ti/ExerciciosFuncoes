import java.util.Scanner;

public class exerc4 {
	
		public static void main(String[] args) {
			
			Scanner teclado = new Scanner(System.in);
			
			double num = 0;
			System.out.print("Digite o valor de um número: ");
			num = teclado.nextDouble();
			
			System.out.println(num);	
			System.out.println(letras(num));

			teclado.close();
			
			
		}
		public static double letras(double num) {
			if (num > 0){
				System.out.println("O número escolhido é Positico -> P");	
			} else {
				System.out.println("O número escolhido é Negativo -> N");
		    }
			
			return num;	
		}

}