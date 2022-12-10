import java.util.Scanner;

public class exerc9 {

	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		
		int num = 0;
		
		System.out.print("Digite o valor de um número inteiro: ");
		num = teclado.nextInt();
		
		teclado.close();
		inverso(num);
	 }
	
	public static String inverso (int numero) {
		String inverso =  Integer.toString(numero);
		
		char[] ch = new char[inverso.length()];
		
        for (int i = 0; i < inverso.length(); i++) {
            ch[i] = inverso.charAt(i);
        }
  
        for (int i = inverso.length()-1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
        return inverso;
	}

}