import java.util.Scanner;

public class ex015 
{
    public static void Calculo(double base, double altura)
    {
        System.out.println("A area desse poligono regular eh: " + (base * altura));
    }

    public static void Calculo(double n1, double n2, double n3, double n4)
    {
        System.out.println("O produto de todos esses números eh: " + (n1 * n2 * n3 * n4));
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Insira 2 valores para determinada área: ");
        double base = scan.nextDouble();
        double altura = scan.nextDouble();

        Calculo(base, altura);

        System.out.printf("Agora insira 4 valores se sua preferência: ");
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        double n3 = scan.nextDouble();
        double n4 = scan.nextDouble();

        Calculo(n1, n2, n3, n4);

        scan.close();
    }
}
