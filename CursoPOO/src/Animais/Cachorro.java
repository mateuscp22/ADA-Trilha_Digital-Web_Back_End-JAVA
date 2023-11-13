package Animais;

public class Cachorro {

    public String nome;
    public String cor;
    public int altura;
    public double peso;
    public int tamanhoDoRabo;
    public String estadoDeEspirito;

    public void comer() {
    }

    public void latir() {
        System.out.println("Au au!");
    }

    public String pegar() {
        return "Bolinha";
    }

    public String interagir(String acao) {

        switch (acao) {
            case "carinho":
                this.estadoDeEspirito = "feliz";
                break;
            case "vai dormir!":
                this.estadoDeEspirito = "bravo";
                break;
            case "pisar na patinha":
                this.estadoDeEspirito = "triste";
                break;
            default:
                this.estadoDeEspirito = "neutro";
                break;
        }

        /*
         * /*
         * if (acao.equals("carinho")) {
         * estadoDeEspirito = "feliz";
         * } else if (acao.equals("Vai dormir!")) {
         * this.estadoDeEspirito = "bravo";
         * } else {
         * this.estadoDeEspirito = "neutro";
         * }/
         */

        return estadoDeEspirito;

    }
}
