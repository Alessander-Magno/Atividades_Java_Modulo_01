import java.util.Scanner;

public class ex013 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite dois números decimais para meus testes: ");
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();

        int transformado = (int) n1;

        double soma = transformado + n2;

        System.out.println("A soma dos valores eh: " + soma);

        scan.close();
    }
}
