package generics;

public class Batalha {

    /* Batalhando os heróis */
    public static void batalhar(Personagem heroi1, Personagem heroi2) {
        while (true) {
            ataque(heroi1, heroi2);
            System.out.println("Vida heroi " + heroi2 + " " + heroi2.getVida());
            if (heroi1.getVida() <= 0 || heroi2.getVida() <= 0) {
                break;
            }
            ataque(heroi2, heroi1);
            System.out.println("Vida heroi " + heroi1 + " " + heroi1.getVida());
            if (heroi1.getVida() <= 0 || heroi2.getVida() <= 0) {
                break;
            }
        }

        fimBatalha(heroi1, heroi2);
    }

    /* Método pra atacar */
    private static void ataque(Personagem heroiAtacante, Personagem defensor) {
        double vidaRestante = defensor.getVida() - heroiAtacante.getForca();
        if (vidaRestante < 0) {
            defensor.setVida(0);
        } else {
            defensor.setVida(vidaRestante);
        }
    }

    /* Imprimindo herói que venceu a batalha */
    private static void fimBatalha(Personagem heroi1, Personagem heroi2) {
        if (heroi1.getVida() <= 0) {
            System.out.println(heroi2 + " venceu a batalha");
        } else {
            System.out.println(heroi1 + " venceu a batalha");
        }
    }
}