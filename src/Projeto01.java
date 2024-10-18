import java.util.Scanner;

public class Projeto01
{
    public static void divInt(int n1, int n2)
    {
        System.out.printf("Resultado da operação: %d / %d = %d\n", n1, n2, (n1 / n2));
    }
    
    public static void multInt(int n1, int n2)
    {
        System.out.printf("Resultado da operação: %d * %d = %d\n", n1, n2, (n1 * n2));
    }
    
    public static void subInt(int n1, int n2)
    {
        System.out.printf("Resultado da operação: %d - %d = %d\n", n1, n2, (n1 - n2));
    }
    
    public static void somaInt(int n1, int n2)
    {
        System.out.printf("Resultado da operação: %d + %d = %d\n", n1, n2, (n1 + n2));
    }

    public static void div(double n1, double n2)
    {
        System.out.printf("Resultado da operação: %.2f / %.2f = %.2f\n", n1, n2, (n1 / n2));
    }
    
    public static void multi(double n1, double n2)
    {
        System.out.printf("Resultado da operação: %.2f * %.2f = %.2f\n", n1, n2, (n1 * n2));
    }
    
    public static void sub(double n1, double n2)
    {
        System.out.printf("Resultado da operação: %.2f - %.2f = %.2f\n", n1, n2, (n1 - n2));
    }
    
    public static void soma(double n1, double n2)
    {
        System.out.printf("Resultado da operação: %.2f + %.2f = %.2f\n", n1, n2, (n1 + n2));
    }
    
    public static double ler(Scanner scan)
    {
        System.out.printf("Digite novamente um segundo número(diferente de zero): ");
        double num02 = scan.nextDouble();
        
        num02 = (num02 == 0) ? (ler(scan)) : num02;

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

        num02 = (num02 == 0) ? (ler(scan)) : num02;

        System.out.println("Calculando com valores decimais: ");
        soma(num01, num02);
        sub(num01, num02);
        multi(num01, num02);
        div(num01, num02);

        int num03 = (int) num01;
        int num04 = (int) num02;
        
        System.out.println("");

        System.out.println("Calculando com valores inteiros: ");
        somaInt(num03, num04);
        subInt(num03, num04);
        multInt(num03, num04);
        divInt(num03, num04);

        scan.close();
    }
}
