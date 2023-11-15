package Animais;

public class Passaro extends Animal {

    static int numPassaros;
    // /Construtores

    public Passaro() {
    }

    public Passaro(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        super(nome, cor, altura, peso, estadoDeEspirito);
    }

    // Métodos
    @Override
    public void soar() {
        System.out.println("Piu Piu");
    }
}
