package generics;

public class Batalha {

    /* Batalhando os heróis */
    public static void batalhar(Personagem heroi1, Personagem heroi2) {
        while (true) {
            ataque(heroi1, heroi2);
            System.out.println("Vida heroi 2 " + heroi2.getVida());
            if (heroi1.getVida() <= 0 || heroi2.getVida() <= 0) {
                break;
            }
            ataque(heroi2, heroi1);
            System.out.println("Vida heroi 1 " + heroi1.getVida());
            if (heroi1.getVida() <= 0 || heroi2.getVida() <= 0) {
                break;
            }
        }

        fimBatalha(heroi1, heroi2);
    }

    /* Método pra atacar */
    private static void ataque(Personagem heroiAtacante, Personagem defensor) {
        defensor.setVida(defensor.getVida() - heroiAtacante.getForca());
    }

    /* Imprimindo herói que venceu a batalha */
    private static void fimBatalha(Personagem heroi1, Personagem heroi2) {
        if (heroi1.getVida() <= 0) {
            System.out.println(heroi2.toString() + " venceu a batalha");
        } else {
            System.out.println(heroi1.toString() + " venceu a batalha");
        }
    }
}