import java.util.Scanner;

public class ex009
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        char classe;

        System.out.printf("Digite a sua nota: ");
        double nota = scan.nextDouble();

        if (nota >= 9 && nota <= 10)
        {
            classe = 'a';
        }
        else if (nota >= 7)
        {
            classe = 'b';
        }
        else if (nota >= 5)
        {
            classe = 'c';
        }
        else
        {
            classe = 'd';
        }

        switch(classe)
        {
            case 'a':
                System.out.println("Nota A");
                break;

            case 'b':
                System.out.println("Nota B");
                break;  
                
            case 'c':
                System.out.println("Nota C");
                break;
                
            default:
                System.out.println("Nota D");
        }

        scan.close();
    }
}