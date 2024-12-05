public class Pessoa 
{
    String nome;
    int idade;
    
    public Pessoa(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirInfo()
    {
        System.out.printf("Nome do cidadão = %s\nIdade = %d\n", nome, idade);
    }
}
