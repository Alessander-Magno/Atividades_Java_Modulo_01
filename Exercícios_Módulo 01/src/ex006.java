import java.util.Scanner;

public class ex006 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite tres numeros");
        System.out.printf("Digite o 1° numero: ");
        int n1 = scan.nextInt();
        System.out.printf("Digite o 2° numero: ");
        int n2 = scan.nextInt();
        System.out.printf("Digite o 3° numero: ");
        int n3 = scan.nextInt();

        int soma = n1 + n2 + n3;
        int media = soma / 3;

        System.out.println("" + ((media > 50) ? "True" : "False"));

            scan.close();
    }    
}
