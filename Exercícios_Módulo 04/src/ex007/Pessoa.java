public class Pessoa 
{
    String nome;
    int idade;
    String endereco;
    
    public Pessoa(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome, int idade, String endereco)
    {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public void exibirInfo()
    {
        System.out.printf("Nome do cidadão = %s\nIdade = %d\n", nome, idade);
    }

    public void exibirInfoII()
    {
        System.out.printf("Nome do cidadão = %s\nIdade = %d\nEndereco = %s\n", nome, idade, endereco);
    }
}