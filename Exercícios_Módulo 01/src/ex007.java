import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite o seu nome, por favor: ");
        String nome = scan.nextLine();

        System.out.println("Ola, " + nome + "! Seja bem-vindo(a)!");

        scan.close();
    }
}
