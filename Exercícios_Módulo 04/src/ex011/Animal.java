public class Animal 
{
    String nome;
    int idade;
    
    public Animal(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }

    public void info()
    {
        System.out.println("Nome = " + nome);
        System.out.println("Idade = " + idade);
    }
}
