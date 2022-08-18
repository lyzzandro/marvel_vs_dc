package dc;

import generics.Personagem;

public class Flash extends Personagem {
    String nome = "Flash";

    @Override
    public String toString() {
        return nome;
    }

    public Flash(double forca, double vida) {
        super(forca, vida);
    }
}
