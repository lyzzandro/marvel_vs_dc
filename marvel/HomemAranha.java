package marvel;

import generics.Personagem;

public class HomemAranha extends Personagem {
    String nome = "Homem Aranha";

    @Override
    public String toString() {
        return nome;
    }

    public HomemAranha(int forca, int vida) {
        super(forca, vida);
    }
}