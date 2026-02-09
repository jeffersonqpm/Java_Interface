public class Main {
    public static void main(String[] args) {

        Animal meuGato = new Gato();

        meuGato.emitirSom();
        meuGato.dormir();

        System.out.println("================");

        Animal meuCachorro = new Cachorro();

        meuCachorro.emitirSom();
        meuCachorro.dormir();


  
    }
}