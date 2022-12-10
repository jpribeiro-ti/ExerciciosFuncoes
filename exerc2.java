import java.util.Scanner;

public class exerc2 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Escreva um número: ");
        int n = teclado.nextInt();
        teclado.close();

        System.out.println("Resultado: ");

        imprimeNumeros(n);


    }

    public static void imprimeNumeros(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                
            }
            System.out.println(" ");
        }
    }

}