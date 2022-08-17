package marvel;

import generics.Personagem;

public class Thor extends Personagem {
    String nome = "Thor";

    @Override
    public String toString() {
        return nome;
    }

    public Thor(int forca, int vida) {
        super(forca, vida);
    }
}