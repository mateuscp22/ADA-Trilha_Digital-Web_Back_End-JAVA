import Animais.Cachorro;

public class Main {

    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Spike", "Branco", 60, 20.5, 30, "nada");
        System.out.println(cachorro1.getNumCachorros());

        Cachorro cachorro2 = new Cachorro("Cookie", "Malhado", 25, 5.5, 5, "nada");
        System.out.println(cachorro2.getNumCachorros());
        System.out.println(cachorro1.getNumCachorros());

    }
}