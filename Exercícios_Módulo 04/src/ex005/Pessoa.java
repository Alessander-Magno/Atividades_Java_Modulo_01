public class Pessoa 
{
    String nome;
    int idade;

    public void fazerAniversario(String nome, int idade)
    {
        this.idade = idade + 1;
        
        System.out.printf("Caríssimo %s, você irá fazer %d anos\n", nome, this.idade);
    }
}
