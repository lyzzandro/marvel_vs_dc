package marvel;

import generics.Personagem;
import interfaces.superforca;

public class Hulk extends Personagem implements superforca {
    String nome = "Hulk";

    @Override
    public String toString() {
        return nome;
    }

    public Hulk(double forca, double vida) {
        super(forca, vida);
        aumentarForca();
    }

    @Override
    public void aumentarForca() {
        super.setForca(super.getForca() * 1.05);
    }
}