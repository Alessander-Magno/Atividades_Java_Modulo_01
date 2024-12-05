public class Pessoa 
{
    String nome;
    int idade;
    String endereco; 

    public String getNome()
    {
        return nome;
    }

    public int getIdade()
    {
        return idade;
    }

    public String getEndereco()
    {
        return endereco;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }

    public void exibirInfo()
    {
        System.out.printf("Nome = %s\nIdade = %d\nEndereco = %s\n", nome, idade, endereco);
    } 
}
