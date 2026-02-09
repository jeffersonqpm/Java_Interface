public class Cachorro  implements Animal{
    @Override
    public void emitirSom() {
        System.out.println("Chachorro faz AU AU AU.");
    }

    @Override
    public void dormir() {
        System.out.println("Cachorro dorme na sala");
    }

}