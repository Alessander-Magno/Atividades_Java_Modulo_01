 import java.util.Scanner;

public class ex008 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Pense em um numero e eu vou adivinha-lo, mas antes disso o digite aqui: ");
        int num = scan.nextInt();

        System.out.println("O numero digitado foi: " + num);

        scan.close();
    }
}
