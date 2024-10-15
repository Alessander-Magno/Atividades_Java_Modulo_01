import java.util.Scanner;

public class ex014 
{
    public static void ImprimirMensagem(String nome)
    {
        System.out.println(nome);
    }
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite uma frase de sua escolha: ");
        String frase = scan.nextLine();

        ImprimirMensagem(frase);

        scan.close();
    }
}
