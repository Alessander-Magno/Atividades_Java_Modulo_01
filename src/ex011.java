import java.util.Scanner;

public class ex011 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Me dê quantos metros você quiser: ");
        double metros = scan.nextDouble();

        double centi = metros * 100;

        System.out.println("Você me disponibilizou aproximadamente " + centi + "cm");

        scan.close();
    }
}
