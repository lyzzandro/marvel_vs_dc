package marvel;

import generics.Heroi;

public class HomemDeFerro extends Heroi {
    String nome = "Homem de Ferro";

    @Override
    public String toString() {
        return nome;
    }

    public HomemDeFerro(double forca, double vida) {
        super(forca, vida);
    }

}