import java.util.Random;
import java.util.Scanner;

public class Sorteio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║         SORTEIO DE NÚMEROS           ║");
        System.out.println("╚══════════════════════════════════════╝");

        
        System.out.print("\nDigite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número : ");
        int num2 = sc.nextInt();

       
        int menor;
        int maior;

        if (num1 < num2) {
            menor = num1;
            maior = num2;
        } else {
            menor = num2;
            maior = num1;
        }

        System.out.println("\n------------------------------------------");
        System.out.println("Intervalo do sorteio: " + menor + " a " + maior);

      
        int sorteado = random.nextInt(maior - menor + 1) + menor;

        System.out.println("Número sorteado     : " + sorteado);

     
        System.out.println("\n------------------------------------------");

        if (sorteado % 2 == 0) {
            System.out.println("O número " + sorteado + " é PAR.");
        } else {
            System.out.println("O número " + sorteado + " é ÍMPAR.");
        }

        System.out.println("------------------------------------------");
        sc.close();
    }
}