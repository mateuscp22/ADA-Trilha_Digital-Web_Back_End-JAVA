import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;

public class Main {

    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Spike", "Branco", 60, 20.5, 30, "nada");

        Gato gato1 = new Gato("Felix", null, 0, 0, null);

        Passaro passaro1 = new Passaro("Fajola", "Preto", 50, 10, "Cansado");

        cachorro1.soar();
        gato1.soar();
        passaro1.soar();
    }
}