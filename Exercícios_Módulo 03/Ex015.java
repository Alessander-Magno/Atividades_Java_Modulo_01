import java.util.ArrayList;
import java.util.Scanner;

public class Ex015
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        
        ArrayList<String> nomes = new ArrayList<>();
        
        System.out.println("Digite seis palavras de sua escolha");
        
        String palavra;
        
        for (int i = 0; i < 6; ++i)
        {
            System.out.printf("Digite a %d° palavra: ", i + 1);
            palavra = scan.nextLine();
            nomes.add(palavra.trim());
        }
        
        System.out.println("Lista completa = " + nomes);
        
        for (int j = 0; j < 6; ++j)
        {
            if (nomes.get(j).charAt(0) == 'a' || nomes.get(j).charAt(0) == 'A')
            {
                System.out.println(nomes.get(j));
            }
        }
        
        scan.close();
    }
}
