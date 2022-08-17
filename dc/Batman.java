package dc;

import generics.Personagem;

public class Batman extends Personagem {
    String nome = "Batman";

    @Override
    public String toString() {
        return nome;
    }

    public Batman(int forca, int vida) {
        super(forca, vida);
    }

}
