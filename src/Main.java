import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numeroDaSorte = new Random().nextInt(100);
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        System.out.println("Seja bem vindo ao JOGO DO NÚMERO DA SORTE");
        System.out.println("Você tem 5 tentativas para acertar, boa sorte! ");
        for (int i = 0; i < 5;i++) {
            if (i == 0) {
                System.out.print("Digite um número: ");
                numero = scanner.nextInt();
            } else {
                System.out.println("Digite outro número: ");
                numero = scanner.nextInt();
            }

            if (numero == numeroDaSorte) {
                System.out.println("Parabens você ACERTOU!!");
                break;
            } else if (numero < numeroDaSorte) {
                System.out.println("O número da sorte é maior que " + numero);
            } else {
                System.out.println("O número da sorte é menor que " + numero);
            }
        }
    }
}