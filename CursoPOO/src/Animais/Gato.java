package Animais;

public class Gato extends Animal {

    static int numGatos;

    // Construtor
    public Gato(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        super(nome, cor, altura, peso, estadoDeEspirito);
    }
    // Métodos

    @Override
    public String toString() {
        return "Gato{" +
                " nome='" + nome + "'" +
                "}";
    }

    @Override
    public void soar() {
        System.out.println("Miau Miau");
    }

}
