import java.util.Scanner;
import java.util.HashSet;

public class Ex009
{
    public static void main(String[] args)
    {
        HashSet<Integer> inteiros = new HashSet<>();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Vamos brincar! Eu tenho um conjunto de 5 números inteiros, de 0 a 15, e o seu objetivo é acertar um deles");
        System.out.println("Vamos lá :)");
        
        inteiros.add(4);
        inteiros.add(6);
        inteiros.add(8);
        inteiros.add(12);
        inteiros.add(13);
        
        int chance;
        int i = 3;
        
        System.out.println("Serão 3 chances");
        
        while (true)
        {
            System.out.printf("Chance %d: ", i);
            chance = scan.nextInt();
            
            if (inteiros.contains(chance) == true && i == 3)
            {
                System.out.println("Você é bom");
                break;
            }
        
            if (inteiros.contains(chance) == true && i != 3)    
            {
                System.out.println("Acertou");
            }
            
            --i;
            
            if (inteiros.contains(chance) != true && i <= 0)
            {
                System.out.println("Não foi dessa vez, amigão");
                break;
            }
            else if (i <= 0)
            {
                break;
            }
        }
        
        scan.close();
    }
}