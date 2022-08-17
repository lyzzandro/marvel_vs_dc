package marvel;

import generics.Personagem;

public class Hulk extends Personagem {
    String nome = "Hulk";

    @Override
    public String toString() {
        return nome;
    }

    public Hulk(int forca, int vida) {
        super(forca, vida);
    }
}