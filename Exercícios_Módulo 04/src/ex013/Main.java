public class Main 
{
    public static void main(String[] args)
    {
        Animal bixo = new Animal("Bicho", 0);
        Cachorro dog = new Cachorro("Bolinha", 1);
        Gato cat = new Gato("Cleopatra", 4);
        Papagaio papa = new Papagaio("Napoleao", 3);

        //Array do tipo Animal
        Animal[] bichanos = new Animal[4];

        bichanos[0] = bixo;
        bichanos[1] = dog;
        bichanos[2] = cat;
        bichanos[3] = papa;

        //tipo de dado - local de armazenamento - local dos dados
        for (Animal animais : bichanos)
        {
            animais.info();
        }
    }    
}
