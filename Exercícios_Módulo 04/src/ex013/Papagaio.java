public class Papagaio extends Animal
{
    public Papagaio(String nome, int idade)
    {
        super(nome, idade);
    }    

    @Override
    public void emitirSom()
    {
        System.out.println("Calma aí, paizão. Está vendo aquela neblina brilhante? é a radiação deixada do Big Bang, a explosão que criou o universo há 13,8 bilhões de anos. O que houve antes do Big Bang, ninguém sabe.");
    }
}
