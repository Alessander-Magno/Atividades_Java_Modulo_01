import java.util.Scanner;

public class projeto01a
{
    public static void Div(double n1, double n2)
    {
        System.out.printf("Resultado da operação: %.2f / %.2f = %.2f\n", n1, n2, (n1 / n2));
    }
    
    public static void Multi(double n1, double n2)
    {
        System.out.printf("Resultado da operação: %.2f * %.2f = %.2f\n", n1, n2, (n1 * n2));
    }
    
    public static void Sub(double n1, double n2)
    {
        System.out.printf("Resultado da operação: %.2f - %.2f = %.2f\n", n1, n2, (n1 - n2));
    }
    
    public static <T extends Number, U extends Number> void Operacoes(T n1, U n2)
    {
        System.out.printf("Resultado da operação: %s + %s = %s\n", n1, n2, (n1 + n2));
    }
    
    public static double ler(Scanner scan)
    {
        System.out.printf("Digite novamente o segundo número(maior que zero): ");
        double num02 = scan.nextDouble();

        return num02;
    }
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Por favor, digite o seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Olá, " + nome + "! Bem vindo(a) a minha calculadora!");

        System.out.printf("Digite o primeiro número: ");
        double num01 = scan.nextDouble();
        System.out.printf("Digite o segundo número: ");
        double num02 = scan.nextDouble();

        num02 = (num02 <= 0) ? (ler(scan)) : num02;

        System.out.println("Calculando com valores decimais: ");
        Operacoes(num01, num02);
        Sub(num01, num02);
        Multi(num01, num02);
        Div(num01, num02);

        int num03 = (int) num01;
        int num04 = (int) num02;
        
        System.out.println("");

        System.out.println("Calculando com valores inteiros: ");
        SomaInt(num03, num04);
        SubInt(num03, num04);
        MultInt(num03, num04);
        DivInt(num03, num04);

        scan.close();
    }
}