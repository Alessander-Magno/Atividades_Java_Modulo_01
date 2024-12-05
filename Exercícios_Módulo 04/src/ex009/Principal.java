public class Principal 
{
    public static void main(String[] args)
    {
        Persona human = new Persona();

        human.setNome("Conan");
        human.setIdade(53);
        human.setGenero("MACHO");

        human.exibirInfo();
    }    
}