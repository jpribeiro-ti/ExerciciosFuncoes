import java.util.Scanner;
import java.util.Random;

public class exerc10 {

    public static int jogodeCraps(int numero_do_dado) {
        Random sorteio = new Random();
        int primeiro = 0;
        int segundo = 0;
        primeiro = sorteio.nextInt(6) + 1;
        segundo = sorteio.nextInt(6) + 1;
        return primeiro + segundo;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int tDados = 2;
        int nDigitado = 0;
        int ponto = 0;
        boolean teste = true;

        do {
            System.out.println("[1] para jogar os dados na mesa");
            System.out.println("[0] para sair da mesa de jogo");
            nDigitado = teclado.nextInt();
            tDados = jogodeCraps(nDigitado);
            
            teclado.close();

            if (nDigitado < 0 || nDigitado > 1) {
                System.out.println("Opção inválida");
            } else if (nDigitado == 1) {
                System.out.println(" A soma dos números dos dados é: " + tDados);
                if (tDados == 7 || tDados == 11) {
                    System.out.println("Você venceu!");
                } else if (tDados == 2 || tDados == 3 || tDados == 12) {
                    System.out.println(" Você perdeu!");
                } else if (tDados == 4 || tDados == 5 || tDados == 6 || tDados == 8
                        || tDados == 9 || tDados == 10) {
                    if (teste) {
                        teste = false;
                        ponto = tDados;
                    } else if (ponto == tDados) {
                        System.out.println("Ganhou!");
                    }
                }
            }
        } while (nDigitado != 0);
        System.out.println("Fim de jogo!");
        
    }

}