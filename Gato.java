public class Gato implements Animal {

    @Override
    public void emitirSom() {
        System.out.println("Gato faz MIAU.");
    }

    @Override
    public void dormir() {
        System.out.println("Gato dorme na cama");
    }

}
