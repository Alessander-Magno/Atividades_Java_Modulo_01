import java.util.Scanner;

public class ex009 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite a sua idade: ");
        int idade = scan.nextInt();

        System.out.println("A sua idade está entre 16 e 18 anos? " + ((idade >= 16 && idade <= 18) ? "True" : "False"));
        System.out.println("A sua idade é superior a 65 anos? " + ((idade > 65) ? "True" : "False"));

        scan.close();
    }
}
