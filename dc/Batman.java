package dc;

import generics.Heroi;

public class Batman extends Heroi {
    String nome = "Batman";

    @Override
    public String toString() {
        return nome;
    }

    public Batman(double forca, double vida) {
        super(forca, vida);
    }
}
