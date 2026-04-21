import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║    EQUAÇÃO DO SEGUNDO GRAU           ║");
        System.out.println("║         ax² + bx + c = 0             ║");
        System.out.println("╚══════════════════════════════════════╝");

        System.out.print("\nDigite o coeficiente a: ");
        double a = sc.nextDouble();

        System.out.print("\nDigite o coeficiente b: ");
        double b = sc.nextDouble();

        System.out.print("\nDigite o coeficiente c: ");
        double c = sc.nextDouble();

         System.out.println("\n------------------------------------------");

         if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
         } else if (a == 0 && b != 0) {
            System.out.print("Essa é uma equação de primeiro grau.");

            double raiz = -c / b;
            System.out.printf("Raiz: x = %.2f%n", raiz);

         } else {
            
            double delta = (b * b) - (4 * a * c);

            System.out.printf("Delta (Δ) = %.2f%n%n", delta);

            if (delta < 0) {

                System.out.println("Essa equação não possui raízes reais.");
            } else if (delta == 0) {

                System.out.println("Essa equação possui duas raízes iguais.");
                double x = -b / (2 * a); 
                System.out.printf("x¹ = x² = %.2f%n", x);
            } else {
                System.out.println("Essa equação possui duas raízes diferentes.");
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.printf("x¹ = %.2f%n", x1); 
                System.out.printf("x2 = %.2f%n", x2); 
            }

         } 

         System.out.println("------------------------------------------");
         sc.close();
        
    }
    
}
