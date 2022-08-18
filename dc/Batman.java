package dc;

import generics.Personagem;

public class Batman extends Personagem {
    String nome = "Batman";

    @Override
    public String toString() {
        return nome;
    }

    public Batman(double forca, double vida) {
        super(forca, vida);
    }
}
