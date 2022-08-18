package dc;

import generics.Heroi;

public class Flash extends Heroi {
    String nome = "Flash";

    @Override
    public String toString() {
        return nome;
    }

    public Flash(double forca, double vida) {
        super(forca, vida);
    }
}
