package dc;

import generics.Personagem;

public class Superman extends Personagem {
    String nome = "Superman";

    @Override
    public String toString() {
        return nome;
    }

    public Superman(int forca, int vida) {
        super(forca, vida);
    }
}
