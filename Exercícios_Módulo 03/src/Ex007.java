import java.util.Scanner;
import java.util.ArrayList;

public class Ex007
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        
        ArrayList<String> cores = new ArrayList<>();
        
        System.out.println("Digite o nome de 5 cores");
        
        for (int i = 0; i < 5; ++i)
        {
            System.out.printf("Cor[%d] = ", i + 1);
            String cor = scan.nextLine();
            cores.add(cor);
        }
        
        System.out.println("A lista de cores = " + cores);
        System.out.print("Escolha uma cor da lista para remover: ");
        String remover = scan.nextLine();
        
        while (cores.contains(remover) == false)
        {
            System.out.print("Sua cor não foi encontrada\nEscolha uma cor da lista para remover: ");
            remover = scan.nextLine();
        }
        
        cores.remove(remover);
        System.out.println("Lista atualizada = " + cores);

        scan.close();
    }
}