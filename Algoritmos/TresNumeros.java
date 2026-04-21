import java.util.Scanner;
public class TresNumeros {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("====Tres Números====");

        System.out.print("Digite o 1º numero: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o 2º numero: ");
        double num2 = sc.nextDouble();

        System.out.print("Digite o 3º numero: ");
        double num3 = sc.nextDouble();

        double maior = num1; 
        if (num2 > maior) maior = num2;
        if (num3 > maior) maior = num3;

        double menor = num1;
        if (num2 < menor) menor = num2;
        if (num3 < menor) menor = num3;

        double media = (num1 + num2 + num3) / 3;

        System.out.println("\n====RESULTADOS====");
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.printf("Média aritmética: %.2f%n", media);

        sc.close();

    }
    
}
