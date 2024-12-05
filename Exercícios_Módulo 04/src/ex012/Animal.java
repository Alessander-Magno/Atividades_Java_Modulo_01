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
        System.out.println("(barulhos de animal)");
    }
}
