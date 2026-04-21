import java.util.Scanner;

public class MaquinaVendas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║     MÁQUINA DE VENDAS AUTOMÁTICA     ║");
        System.out.println("║  Salgadinhos, Doces, Sucos e Refri   ║");
        System.out.println("╚══════════════════════════════════════╝");

        System.out.print("\nDigite o valor da compra R$: ");
        double valorCompra = sc.nextDouble();

        System.out.print("Digite o valor pago R$: ");
        double valorPago = sc.nextDouble();

        if (valorPago < valorCompra) {

            System.out.println("\n PAGAMENTO INSUFICIENTE!");
            System.out.printf("Valor da compra: %.2f%n", valorCompra);
            System.out.printf("Valor pago: %.2f%n", valorPago);
            System.out.printf("Faltam: R$ %.2f%n", (valorCompra - valorPago));
            System.out.println("Por favor, insira mais dinheiro.");
        } else {
            int troco = (int) Math.round((valorPago - valorCompra) * 100);

            System.out.printf("\n Compra Aprovada!%n");
            System.out.printf("Troco a devolver: R$ %.2f%n", troco / 100.0);

            int notaDe50 = troco / 5000;
            troco = troco % 5000;

            int notaDe20 = troco / 2000;
            troco = troco % 2000;

            int notaDe10 = troco / 1000;
            troco = troco % 1000;

            int notaDe5 = troco / 500;
            troco = troco % 500;

            int notaDe2 = troco / 200;
            troco = troco % 200;

            int notaDe1 = troco / 100;

            System.out.println("\n  TROCO EM NOTAS:");
            System.out.println("  ------------------------");
            System.out.println("  Notas de R$ 50,00 : " + notaDe50);
            System.out.println("  Notas de R$ 20,00 : " + notaDe20);
            System.out.println("  Notas de R$ 10,00 : " + notaDe10);
            System.out.println("  Notas de R$  5,00 : " + notaDe5);
            System.out.println("  Notas de R$  2,00 : " + notaDe2);
            System.out.println("  Notas de R$  1,00 : " + notaDe1);
            System.out.println("  ------------------------");
        }

        sc.close();
    }

}
