import java.util.Scanner;
public class CirculoEsfera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║        CÍRCULO E ESFERA              ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║  1 - Perímetro do Círculo            ║");
        System.out.println("║  2 - Área do Círculo                 ║");
        System.out.println("║  3 - Volume da Esfera                ║");
        System.out.println("╚══════════════════════════════════════╝");

        System.out.print("Digite o número da operação: ");
        int operacao = sc.nextInt();

        System.out.print("Digite o valor do raio: ");
        double raio = sc.nextDouble();

        double PI = 3.141592;

        System.out.println("\n------------------------------------------");

        if ( operacao == 1) {

            double perimetro = 2 * PI * raio;
            System.out.println("Operação: Perímetro do Círculo");
            System.out.printf("Perímetro = 2 × PI × %.2f%n", raio);
            System.out.printf("Perímetro = %.4f%n", perimetro);

        } else if (operacao == 2) {

            double area = PI * raio * raio;
            System.out.println("Operação: Área do Círculo");
            System.out.printf("Área = PI × %.2f²%n", raio);
            System.out.printf("Área = %.4f%n", area);
            
        } else if (operacao == 3) {

            double volume = (4.0 / 3.0) * PI * raio * raio * raio;
            System.out.println("Operação: Volume da Esfera");
            System.out.printf("Volume = 4/3 × PI × %.2f³%n", raio);
            System.out.printf("Volume = %.4f%n", volume);
        } else {

            System.out.println("Erro: Código da operação inválido!");
            System.out.println("Digite apenas 1, 2 ou 3.");
        }

        System.out.println("------------------------------------------");
        sc.close();
    }

}
