package dc;

import generics.Personagem;

public class MulherMaravilha extends Personagem {
    String nome = "Mulher Maravilha";

    @Override
    public String toString() {
        return nome;
    }

    public MulherMaravilha(int forca, int vida) {
        super(forca, vida);
    }
}
