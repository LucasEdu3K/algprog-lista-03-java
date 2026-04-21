import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║          CALCULADORA                 ║");
        System.out.println("║   Operações: + , - , * , / , ^       ║");
        System.out.println("╚══════════════════════════════════════╝");

        System.out.print("Digite o primeiro numero: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double num2 = sc.nextDouble();

        System.out.print("Digite o símbolo da operação (+, -, *, /, ^): ");
        String operacao = sc.next();

        System.out.println("\n------------------------------------------");

        if (operacao.equals("+")) {

            double resultado = num1 + num2;
            System.out.printf("%.2f%n + %.2f%n = %.2f%n", num1, num2, resultado);

        } else if (operacao.equals("-")) {

            double resultado = num1 - num2;
            System.out.printf("%.2f%n - %.2f%n = %.2f%n", num1, num2, resultado);

        } else if (operacao.equals("*")) {

            double resultado = num1 * num2;
            System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, resultado);

            } else if (operacao.equals("/")) {

            // Verificar divisão por zero
            if (num2 == 0) {
                System.out.println("Erro: Divisão por zero não é permitida!");
            } else {
                double resultado = num1 / num2;
                System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, resultado);
            }

        } else if (operacao.equals("^")) {

            double resultado = Math.pow(num1, num2);
            System.out.printf("%.2f ^ %.2f = %.2f%n", num1, num2, resultado);

        } else {

            System.out.println("Erro: Símbolo da operação inválido!");
            System.out.println("Use apenas: + , - , * , / ou ^");
        }
        sc.nextInt(); 

        System.out.println("------------------------------------------");
        sc.close();
     }
} 


