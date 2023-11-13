import Animais.Cachorro;

public class Main {

    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro("Cookie", "Malhado", 25, 5.5, 5, "Nada");

        /*
         * cachorro1.setNome("Spike");
         * cachorro1.setCor("Branco");
         * cachorro1.setAltura(25);
         * cachorro1.setPeso(5.5);
         * cachorro1.setTamanhoDoRabo(5);
         */

        // cachorro1.latir();
        // System.out.println("O cachorro pegou uma " + cachorro1.pegar());
        System.out.println(cachorro2.getNome());
        System.out.println(cachorro2.getPeso());

        System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
        System.out.println("O cachorro está " + cachorro1.interagir("vai dormir!"));
        System.out.println("O cachorro está " + cachorro1.interagir("nada"));
    }
}