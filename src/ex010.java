import java.util.Scanner;

public class ex010 {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);

        System.out.printf("Bom dia! Digite dois números reais, por favor: ");
        double real01 = scan.nextDouble();
        double real02 = scan.nextDouble();

        double soma = real01 + real02;

        System.out.println("A soma desses dois valores eh: " + soma);

        scan.close();
    }
}
