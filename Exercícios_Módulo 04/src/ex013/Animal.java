public class Animal
{
    String nome;
    int idade;

    public Animal(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom()
    {
        System.out.println("(sons de bixos)");
    }

    public void info()
    {
        System.out.println("Nome = " + nome);
        System.out.println("Idade = " + idade);
        emitirSom();
        System.out.println("------------------------------------------------");
    }
}