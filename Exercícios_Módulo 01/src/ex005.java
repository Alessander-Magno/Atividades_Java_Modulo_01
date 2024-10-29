import java.util.Scanner;

public class ex005
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite um valor: ");
        int valor = scan.nextInt();

        System.out.println("O valor anterior eh: " + (valor - 1) + "\nO valor digitado eh: " + valor + "\nE o seu sucessor eh: " + (valor + 1));

        scan.close();
    }   
}
